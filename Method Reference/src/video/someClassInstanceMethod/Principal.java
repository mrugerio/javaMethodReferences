package video.someClassInstanceMethod;

import video.StringFunction;
import video.Utils;

public class Principal {
	
	public static void main(String args[]){
		String s = "Test";
		
		StringFunction funcion01 = String::toUpperCase;
		String resul = funcion01.aplicarFuncion(s);
		System.out.println(resul);
		
		String resultado01 = Utils.transforma(s, x -> x.toUpperCase());
		System.out.println(resultado01);
		
		String resultado = Utils.transforma(s, String::toUpperCase);
		System.out.println(resultado);
	}

}
