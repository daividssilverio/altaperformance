package standalone;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ExampleFactory {
	public static IExample newInstance() {
		URLClassLoader tmp = new URLClassLoader(new URL[] { getClassPath() }) {
			@Override
			public synchronized Class<?> loadClass(String name)
					throws ClassNotFoundException {
				if ("standalone.Example".equals(name))
					return findClass(name);
				return super.loadClass(name);
			}
		};

		try {
			return (IExample) tmp.loadClass("standalone.Example").newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e.getCause());
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	private static URL getClassPath() {
		String resName = ExampleFactory.class.getName().replace('.', '/')
				+ ".class";
		String loc = ExampleFactory.class.getClassLoader().getResource(resName)
				.toExternalForm();
		URL cp;
		try {
			cp = new URL(loc.substring(0, loc.length() - resName.length()));
		} catch (MalformedURLException e) {
			throw new RuntimeException(e);
		}
		return cp;
	}
}
