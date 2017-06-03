package com.estaticos;

public class Principal {
	
	
	public static void main(String arg []){
		
		//VALIDO
		//InterfaceFuncional if01 = ()->System.out.println("Hello");
		//if01.ejecuta();
		
		//VALIDO PERO NO IMPRIME NADA
		//InterfaceFuncional if02 = System.out::println;
		//if02.ejecuta();
		
		//NO VALIDO
		//InterfaceFuncional if03 = System.out::println("NO VALIDO");
		//if03.ejecuta();
		
		InterfaceFuncional if04 = Principal::metodoEstatico;
		if04.ejecuta();
	}
	
	public static void metodoEstatico(){
		System.out.println("Hola Método estatico");
	}
}
