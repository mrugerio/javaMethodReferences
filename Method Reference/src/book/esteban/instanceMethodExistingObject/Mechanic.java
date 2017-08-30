package book.esteban.instanceMethodExistingObject;

import java.util.function.Consumer;

class Car {
	public int id;
	public String color;
}

class Mechanic {
	
	public void fix(Car c){
		System.out.println("Fixing car "+ c.id);
	}
	
	public void execute(Car car, Consumer<Car> c){
		c.accept(car);
	}
	
	public static void main(String args[]){
		
		Mechanic mecanico = new Mechanic();
		Car car = new Car();
		car.id = 5;
		
		Consumer<Car> lambda0a = c -> mecanico.fix(c);
		//lambda0a.accept(car);
		
		Consumer<Car> lambda0b = mecanico::fix;
		lambda0b.accept(car);
		
		//USING A LAMBDA EXPRESSION
		Consumer<Car> lambda01 = c -> mecanico.fix(c);
		//mecanico.execute(car, lambda01);	
		
		//USING A METHOD REFERENCE
		Consumer<Car> lambda02 = mecanico::fix;
		//mecanico.execute(car, lambda02);	
	}
}
