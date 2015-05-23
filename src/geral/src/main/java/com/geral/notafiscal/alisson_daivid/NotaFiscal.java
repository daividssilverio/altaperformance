package com.geral.notafiscal.alisson_daivid;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NotaFiscal {
	private Map<Item, Integer> items;
	
	public NotaFiscal() {
		items = new HashMap<Item, Integer>();
	}
	
	public void addItem(Item item) {
		if (items.containsKey(item)) {
			items.put(item, items.get(item) + 1);
		}
		else {
			items.put(item, 1);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		Iterator it = items.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			Item item = (Item) entry.getKey();
			Integer quantidade = (Integer) entry.getValue();
			sb.append("Nome: " + item.descricao)
			  .append("\tQuantidade: " + quantidade)
			  .append("\tValor Total: " + item.preco * quantidade);
			sb.append("\n");
		}
		
		return sb.toString();		
	}
	
}
