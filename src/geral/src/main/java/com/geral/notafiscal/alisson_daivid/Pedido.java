package com.geral.notafiscal.alisson_daivid;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	List<Item> itens;
	
	public Pedido() {
		this.itens = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.itens.add(item);
	}
	
	public NotaFiscal gerarNotaFiscal() {
		NotaFiscal notaFiscal = new NotaFiscal();
		
		for (Item item: itens) {
			notaFiscal.addItem(item);
		}
		
		return notaFiscal;
	}
}
