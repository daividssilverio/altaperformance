package com.geral.notafiscal.alisson_daivid;

public class Main {
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Feijao", 12));
		pedido.addItem(new Item("Feijao", 12));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz C", 10));
		pedido.addItem(new Item("Arroz D", 7));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz A", 11));
		pedido.addItem(new Item("Arroz", 10));
		
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz D", 7));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz", 10));
		pedido.addItem(new Item("Arroz", 10));
		
		pedido.addItem(new Item("Arroz", 10));
		
		NotaFiscal nf = pedido.gerarNotaFiscal();
		System.out.println(nf);
	}
}
