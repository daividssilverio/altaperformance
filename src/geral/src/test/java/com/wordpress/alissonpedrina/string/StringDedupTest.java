package com.wordpress.alissonpedrina.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Xmx256 -XX:+UseG1 Run it with: -XX:+UseG1GC -XX:+UseStringDeduplication
 * -XX:+PrintStringDeduplicationStatistics Give as much Xmx as you can on your
 * box. This test will show you how long does it take to run a single
 * deduplication and if it is run at all. To test when deduplication is run, try
 * changing a parameter of Thread.sleep or comment it out. You may want to print
 * garbage collection information using -XX:+PrintGCDetails
 * -XX:+PrintGCTimestamps
 *
 * 
 * @author Auxiliadora
 *
 */
public class StringDedupTest {
	private static final int MAX_EXPECTED_ITERS = 300;
	private static final int FULL_ITER_SIZE = 100 * 1000;

	private static List<String> LIST = new ArrayList<>(MAX_EXPECTED_ITERS
			* FULL_ITER_SIZE);

	public static void main(String[] args) throws InterruptedException {
		fillUnique();
	}

	private static void fillUnique() throws InterruptedException {
		int iters = 0;
		final UniqueStringGenerator gen = new UniqueStringGenerator();
		while (true) {
			for (int i = 0; i < FULL_ITER_SIZE; ++i)
				LIST.add(gen.nextUnique());
			Thread.sleep(300);
			System.out.println("Iteration " + (iters++) + " finished");
		}
	}

	private static void fillNonUnique(final boolean intern)
			throws InterruptedException {
		int iters = 0;
		final UniqueStringGenerator gen = new UniqueStringGenerator();
		while (true) {
			for (int i = 0; i < FULL_ITER_SIZE; ++i)
				LIST.add(intern ? gen.nextNonUnique().intern() : gen
						.nextNonUnique());
			Thread.sleep(300);
			System.out.println("Iteration " + (iters++) + " finished");
		}
	}

	private static class UniqueStringGenerator {
		private char upper = 0;
		private char lower = 0;

		public String nextUnique() {
			final String res = String.valueOf(upper) + lower;
			if (lower < Character.MAX_VALUE)
				lower++;
			else {
				upper++;
				lower = 0;
			}
			return res;
		}

		public String nextNonUnique() {
			final String res = "a" + lower;
			if (lower < 100)
				lower++;
			else
				lower = 0;
			return res;
		}
	}
}