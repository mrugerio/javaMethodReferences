package video.estatico;

import video.StringFunction;
import video.Utils;

public class Principal {

	public static void main(String[] args) {

		String s = "Test";
		
		StringFunction funcion00 = Utils::hacerExcitante;
		String prueba = funcion00.aplicarFuncion("Prueba");
		System.out.println(prueba);

		// SomeClass.staticMethod
		String resultado01 = Utils.transforma(s, x -> Utils.hacerExcitante(x));
		System.out.println(resultado01);

		// SomeClass::staticMethod
		StringFunction funcion01 = Utils::hacerExcitante;
		String resultado02 = Utils.transforma(s, funcion01);
		System.out.println(resultado02);
		
		// SomeClass::staticMethod
		String resultado03 = Utils.transforma(s, Utils::hacerExcitante);
		System.out.println(resultado03);

	}

}
