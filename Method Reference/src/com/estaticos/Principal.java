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
		
		//InterfaceFuncional if04 = Principal::metodoEstatico;
		//if04.ejecuta();
		
		// NO ES NECESARIO INDICAR LOS PARAMETROS
		// InterfaceFuncional02 if05 = Principal::otroMetodoEstatico;
		// if05.ejecuta("Parámetro");
		
		InterfaceFuncional03 if06 = Principal::tercerMetodoEstatico;
		
		if06.ejecuta("Primero","Segundo");
		
	}
	
	public static void metodoEstatico(){
		System.out.println("Hola Método estatico");
	}
	
	public static void otroMetodoEstatico(String s){
		System.out.println("Hola Método estatico "+s);
	}
	
	public static int tercerMetodoEstatico(String s, String t){
		System.out.println("Hola Método estatico con dos parametros: "+s+" "+t);
		return 5;
	}
}
