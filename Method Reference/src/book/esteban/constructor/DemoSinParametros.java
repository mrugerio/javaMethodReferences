package book.esteban.constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class DemoSinParametros {

	public static void main(String[] args) {
		
		// USING A LAMBDA EXPRESSION
		Supplier<List<String>> s01 = () -> new ArrayList<String>();
		List<String> l01 = s01.get();

		// USING A METHOD REFERENCE
		Supplier<List<String>> s02 = ArrayList<String>::new;
		List<String> l02 = s02.get();

	}

}
