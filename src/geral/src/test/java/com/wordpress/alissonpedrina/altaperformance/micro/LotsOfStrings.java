package com.wordpress.alissonpedrina.altaperformance.micro;

import java.util.LinkedList;

/**
 * Rode este programa com o jdk 8 e com as flags
 * -Xmx256m -XX:+UseG1GC.
 * Depois execute novamente o programa com as flags
 * -Xmx256m -XX:+UseG1GC -XX:+UseStringDeduplication -XX:+PrintStringDeduplicationStatistics
 * @author alissonpedrina
 *
 */
public class LotsOfStrings {

	private static final LinkedList<String> LOTS_OF_STRINGS = new LinkedList<>();

	public static void main(String[] args) throws Exception {
		int iteration = 0;
		while (true) {
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 1000; j++) {
					LOTS_OF_STRINGS.add(new String("String " + j));
				}
			}
			iteration++;
			System.out.println("Survived Iteration: " + iteration);
			Thread.sleep(100);
		}
	}
}
