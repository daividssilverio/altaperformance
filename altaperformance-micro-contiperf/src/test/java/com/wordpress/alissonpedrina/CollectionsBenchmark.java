package com.wordpress.alissonpedrina;

import java.util.ArrayList;
import java.util.List;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;

public class CollectionsBenchmark {

	@Rule
	public ContiPerfRule contiPerfRule = new ContiPerfRule();

	@Test
	@PerfTest(warmUp = 100, duration = 5000, threads = 5)
	public void deveInserirElementosEmArrayList() {
		List<String> arrayList = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			arrayList.add("valor" + i);
		}
	}

}
