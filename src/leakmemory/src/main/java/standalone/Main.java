package standalone;

/**
 * -XX:+HeapDumpOnOutOfMemoryError
 * 
 * @author apedrina
 *
 */
public class Main {
	private static IExample referenciaPermanete;
	private static IExample referenciaClassLoadingDinamicamente;

	public static void main(String[] args) throws Exception {
		referenciaPermanete = ExampleFactory.newInstance();

		while (true) {
			referenciaClassLoadingDinamicamente = ExampleFactory.newInstance()
					.copy(referenciaClassLoadingDinamicamente);

			System.out.println("1) " + referenciaPermanete.message() + " = "
					+ referenciaPermanete.plusPlus());
			System.out.println("2) "
					+ referenciaClassLoadingDinamicamente.message() + " = "
					+ referenciaClassLoadingDinamicamente.plusPlus());
			System.out.println();

			//Thread.currentThread().sleep(1000);
		}
	}
}
