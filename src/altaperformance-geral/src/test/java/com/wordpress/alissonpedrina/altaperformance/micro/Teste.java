package com.wordpress.alissonpedrina.altaperformance.micro;


public class TryCatchVsCheckPerformanceTest
extends JUnitAutoProgressionPerformanceTemplate {

private static final int ARRAY_SIZE = 10;

public static void main(final String[] args) {
new TryCatchVsCheckPerformanceTest().executeWithIntermediateOutput();
}

@Override
public void init(ProgressionConfigurator config) {
config.setBaseIterations(1_000_000);
}

@Override
public void addTests(TestsContainer tests) {
tests.addTest("exception", new Runnable() {
    private char[] array = new char[ARRAY_SIZE];
    private int pos;

    @Override
    public void run() {
        try { // spare the check
            array[pos] = '*';
            pos++;
        } catch (ArrayIndexOutOfBoundsException e) {
            pos = 0;
        }
    }
});

tests.addTest("if_then", new Runnable() {
    private char[] array = new char[ARRAY_SIZE];
    private int pos;

    @Override
    public void run() {
        if (pos < ARRAY_SIZE) {
            array[pos] = '*';
            pos++;
        } else {
            pos = 0;
        }
    }
});
}

@Override
public void addAssertions(PerformanceAssertion assertion) {
assertion.withPercentageTolerance(7)
        .assertTest("exception").fasterThan("if_then");
}

}