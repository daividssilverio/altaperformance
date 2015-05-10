/**
 *  mvn archetype:generate \
          -DinteractiveMode=false \
          -DarchetypeGroupId=org.openjdk.jmh \
          -DarchetypeArtifactId=jmh-java-benchmark-archetype \
          -DgroupId=org.sample \
          -DartifactId=test \
          -Dversion=1.0
          
          java -jar target/benchmarks.jar
 */
package com.wordpress.alissonpedrina;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class Memoria {

	private final static int ARRAY_SIZE = 64 * 1024 * 1024;
	private int[] array = new int[ARRAY_SIZE];
	
    @Benchmark
    public void testMethod() {
    	for (int i = 0; i < array.length; i++) {
			array[i] *= 3;
		}
    }

}
