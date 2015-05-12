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
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
@Fork(value = 2)
@BenchmarkMode(Mode.AverageTime)
public class Memoria {

	private final static int ARRAY_SIZE = 64 * 1024 * 1024;
	private int[] array = new int[ARRAY_SIZE];

	@Benchmark
	public void iteracaoNormal() {
		for (int i = 0, n = array.length; i < n; i++) {
			array[i] *= 3;
		}
	}

	@Benchmark
	public void iteracaoCom16() {
		for (int i = 0, n = array.length; i < n; i += 16) {
			array[i] *= 3;
		}
	}

}
