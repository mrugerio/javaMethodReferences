package com.metodoInstanciaObjetoParticular;

import com.estaticos.InterfaceFuncional;
import com.estaticos.InterfaceFuncional03;

public class Principal {

	public static void main(String args[]){
		Principal principal = new Principal();
		//TRADICIONAL
		principal.metodoInstanciaObjetoParticular();
				
		//LAMBDAS
		InterfaceFuncional interfaceFuncional01 = ()->principal.metodoInstanciaObjetoParticular();
		interfaceFuncional01.ejecuta();

		//METODO DE REFERENCIA
		InterfaceFuncional interfaceFuncional02 = principal::metodoInstanciaObjetoParticular;
		interfaceFuncional02.ejecuta();
		
		//METODO DE REFERENCIA
		InterfaceFuncional03 interfaceFuncional03 = principal::metodoInstanciaObjetoParticular03;
		interfaceFuncional03.ejecuta("uno", "dos");
	}
	
	public void metodoInstanciaObjetoParticular(){
		System.out.println("Objeto particular, metodo de instancia");
	}
	
	public int metodoInstanciaObjetoParticular03(String a, String b){
		System.out.println("Objeto particular, "+a+" "+b);
		return 5;
	}
}
