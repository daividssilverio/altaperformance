package standalone;

public class Example implements IExample {
	private int counter;
	private ILeak leak;

	public ILeak leak() {
		return new Leak(leak);
	}

	public String message() {
		return "Version 1";
	}

	public int plusPlus() {
		return counter++;
	}

	public int counter() {
		return counter;
	}

	public IExample copy(IExample example) {
		if (example != null) {
			counter = example.counter();
			leak = example.leak();
		}
		return this;
	}
}
