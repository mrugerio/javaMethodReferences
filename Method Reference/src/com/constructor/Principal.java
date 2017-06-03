package com.constructor;

public class Principal {

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.referenciarConstructor01();
		principal.referenciarConstructor02();
		principal.referenciarConstructor03();


	}
	
	public void referenciarConstructor01(){
		IPersona iper = new IPersona(){
			public Persona crear(int id, String nombre) {
				return new Persona(id,nombre);
			}
		};
		Persona persona = iper.crear(2, "Paco");
		System.out.println(persona);
	}
	
	public void referenciarConstructor02(){
		IPersona iper = (x,y)->new Persona(x,y);
		Persona persona = iper.crear(2, "Paco");
		System.out.println(persona);
	}
	
	public void referenciarConstructor03(){
		IPersona iper = Persona::new;
		Persona persona = iper.crear(2, "Paco");
		System.out.println(persona);
	}

}
