package com.wordpress.alissonpedrina.altaperformance.reference;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

import org.junit.Test;

public class WeakReferenceTest {

	@Test
	public void deveTestarComportamentoDeWeakHashMap() {
		WeakHashMap<Employee, EmployeeVal> aMap = new WeakHashMap<Employee, EmployeeVal>();

		Employee emp = new Employee("Vinoth");
		EmployeeVal val = new EmployeeVal("Programmer");

		aMap.put(emp, val);

		emp = null;

		System.gc();
		int count = 0;
		while (0 != aMap.size()) {
			++count;
			System.gc();
		}
		System.out.println("Took " + count
				+ " calls to System.gc() to result in weakHashMap size of : "
				+ aMap.size());
	}

	@Test
	public void deveTestarComportamentoDeWeakReference() {
		HashMap<Employee, EmployeeVal> map = new HashMap<Employee, EmployeeVal>();
		WeakReference<HashMap<Employee, EmployeeVal>> aMap = new WeakReference<HashMap<Employee, EmployeeVal>>(
				map);

		map = null;

		while (null != aMap.get()) {
			aMap.get().put(new Employee("Vinoth"),
					new EmployeeVal("Programmer"));
			System.out.println("Size of aMap " + aMap.get().size());
			System.gc();
		}
		System.out.println("Its garbage collected");
	}

	@Test
	public void deveTestarComportamentoDeHashMap() {
		HashMap<Employee, EmployeeVal> aMap = new HashMap<Employee, EmployeeVal>();

		Employee emp = new Employee("Vinoth");
		EmployeeVal val = new EmployeeVal("Programmer");

		aMap.put(emp, val);

		emp = null;

		System.gc();
		System.out.println("Size of Map: " + aMap.size());

	}

	class Employee {

		private String nome;

		public Employee(String nome) {
			this.nome = nome;
		}

	}

	class EmployeeVal {

		private String valor;

		public EmployeeVal(String valor) {
			this.valor = valor;
		}

	}
}
