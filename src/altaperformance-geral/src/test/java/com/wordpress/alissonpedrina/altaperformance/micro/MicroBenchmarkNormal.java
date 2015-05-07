package com.wordpress.alissonpedrina.altaperformance.micro;

import org.junit.Assert;
import org.junit.Test;

public class MicroBenchmarkNormal {

	private int nLoops = 1000;
	private int numero = 100;
	
	@Test
	public void testeNormal() {
		double l;
		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < nLoops; i++) {
			l = executa(numero - i);
		}
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo decorrido para teste normal(Elapsed time):" + Math.abs(tempoInicial - tempoFinal));
	}
	
	@Test
	public void testeComUso() {
		double l = 0;
		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < nLoops; i++) {
			l = executa(numero);
		}
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo decorrido para teste com uso:" + Math.abs(tempoInicial - tempoFinal) + "" +l);
	}

	private double executa(int numero) {
		if (this.numero == 0)
			Assert.assertTrue(true);

		if (Double.isInfinite(numero))
			throw new ArithmeticException("Sobrecarga");
		return numero * numero;
	}

}
