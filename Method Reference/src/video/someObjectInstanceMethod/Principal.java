package video.someObjectInstanceMethod;

import video.StringFunction;
import video.Utils;

public class Principal {

	public static void main(String args[]){
		
		String s = "Test";
		String prefix = "Blah";
		
		StringFunction funcion01 = prefix::concat;
		String resultado00 = funcion01.aplicarFuncion(s);
		System.out.println(resultado00);		
		
		String resultado01 = Utils.transforma(s, x -> prefix.concat(x));
		System.out.println(resultado01);		
		
		String resultado02 = Utils.transforma(s, prefix::concat);
		System.out.println(resultado02);
	}
	
}
