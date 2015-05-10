package com.wordpress.alissonpedrina.flags;

public class Micro {

	volatile double count;

	public static void main(String[] args) {
		Micro micro = new Micro();
		micro.teste(false);
		micro.teste(true);
	}

	public void teste(boolean warnup) {
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			soma(i);
		}
		if (!warnup){
			long fim = System.currentTimeMillis();
			System.out.println("Tempo decorrido: " + (fim - inicio));
		}
	}

	
	private void soma(int i) {
		count = i;
	}

}
