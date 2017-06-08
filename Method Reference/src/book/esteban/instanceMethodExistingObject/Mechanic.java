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
		Mechanic mechanic = new Mechanic();
		Car car = new Car();
		car.id = 5;
		
		//USING A LAMBDA EXPRESSION
		Consumer<Car> lambda01 = c -> mechanic.fix(c);
		mechanic.execute(car, lambda01);	
		
		//USING A METHOD REFERENCE
		Consumer<Car> lambda02 = mechanic::fix;
		mechanic.execute(car, lambda02);	
	}
}
