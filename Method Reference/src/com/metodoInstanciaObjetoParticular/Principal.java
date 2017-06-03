package com.metodoInstanciaObjetoParticular;

import com.estaticos.InterfaceFuncional;

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
	}
	
	public void metodoInstanciaObjetoParticular(){
		System.out.println("Objeto particular, metodo de instancia");
	}
	
}
