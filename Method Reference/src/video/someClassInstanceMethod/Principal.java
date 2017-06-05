package video.someClassInstanceMethod;

import video.Utils;

public class Principal {
	
	public static void main(String args[]){
		String s = "Test";
		
		String resultado01 = Utils.transforma(s, x -> x.toUpperCase());
		System.out.println(resultado01);
		
		String resultado = Utils.transforma(s, String::toUpperCase);
		System.out.println(resultado);
	}

}
