package com.wordpress.alissonpedrina;

import java.util.ArrayList;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import entidades.Pessoa;

public class CollectionsBenchmark {

	@Rule
	public ContiPerfRule contiPerfRule = new ContiPerfRule();
	

	@Test
	@PerfTest(warmUp = 100, duration = 1000, threads = 5)
	public void deveInserirElementosEmArrayList() {
		ArrayList<Pessoa> pessoaList = new ArrayList<>();

		for (int i = 0; i < 1000; i++) {
			pessoaList.add(new Pessoa("nome" + i, "sobrenome" + 1, i));
		}
	}
	
}
