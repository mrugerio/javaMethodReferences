package book.esteban.constructor;

import java.util.function.Function;

public class DemoConParametros {

	public static void main(String args[]){
		
		Function<String, Integer> f01 = s -> new Integer(s);
		Function<String, Integer> f02 = Integer::new;
		
		Integer resultado = f01.apply("4");
		System.out.println(resultado);
		
		resultado = f01.apply("8");
		System.out.println(resultado);
		
	}
}
