package book.esteban.constructor;

import java.util.Locale;
import java.util.function.BiFunction;

public class DemoConParametrosDos {

	public static void main(String[] args) {

		BiFunction<String, String, Locale> f = Locale::new;
		Locale loc = f.apply("en", "UK");
		
		BiFunction<String, String, Locale> f01 = 
				(x,y) -> new Locale(x,y);
		Locale loc01 = f01.apply("en", "UK");
	}

}
