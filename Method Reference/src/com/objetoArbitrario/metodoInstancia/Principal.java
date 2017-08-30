package com.objetoArbitrario.metodoInstancia;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		
		//EJEMPLOS PREVIOS
		Comparator<String> comparador =  (s1, s2) -> s2.compareToIgnoreCase(s1);
		Comparator<String> comparador01 =  String::compareToIgnoreCase;
		
		int resultado = comparador01.compare("b", "a");
		System.out.println(resultado);

		Principal principal = new Principal();
		principal.referenciarMetodoInstanciaObjetoArbitrario01();
		principal.referenciarMetodoInstanciaObjetoArbitrario02();
		principal.referenciarMetodoInstanciaObjetoArbitrario03();
	}

	
	// EJEMPLO 01
	public void referenciarMetodoInstanciaObjetoArbitrario01() {
		String[] nombres = { "Uno", "Dos", "Tres", "Cuatro" };
		Arrays.sort(nombres, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s1.compareToIgnoreCase(s2);
			}
		});
		System.out.println(Arrays.toString(nombres));
	}

	// EJEMPLO 02
	public void referenciarMetodoInstanciaObjetoArbitrario02() {
		String[] nombres = { "Uno", "Dos", "Tres", "Cuatro" };
		Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2));
		System.out.println(Arrays.toString(nombres));
	}

	// EJEMPLO 03
	public void referenciarMetodoInstanciaObjetoArbitrario03() {
		String[] nombres = { "Uno", "Dos", "Tres", "Cuatro" };
		Arrays.sort(nombres, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(nombres));
	}

}
