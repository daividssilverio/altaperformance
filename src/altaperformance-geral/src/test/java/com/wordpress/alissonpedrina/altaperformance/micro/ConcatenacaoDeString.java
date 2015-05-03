package com.wordpress.alissonpedrina.altaperformance.micro;

import org.junit.Test;

public class ConcatenacaoDeString {

	@Test(timeout = 50000)
	public void deveTestarDesempenhoDeConcatenacaoDeStringComOperadorMais(){
		concatenador();
	}

	@Test(timeout = 50000)
	public void deveTestarDesempenhoDeConcatenacaoDeStringComBuilder(){
		concatenadorComBuilder();
	}
	
	private String concatenador() {
		String numeros = "";
		
		for (int i = 0; i < 1000; i++) {
			numeros += i;
		}
		
		return numeros;
	}
	
	private String concatenadorComBuilder() {
		StringBuilder numeros = new StringBuilder();
		
		for (int i = 0; i < 1000; i++) {
			numeros.append(i);
		}
		
		return numeros.toString();
	}
	
}
