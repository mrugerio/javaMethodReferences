package book.esteban.instanceMethodObjectType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Shipment {
	
	public double calculateWeight(){
		double weight = 0;
		//CALCULATE WEIGHT
		return weight;
	}

	public double calculaPeso(int a){
		return a;
	}
	
	public static List<Double> calculateOnShipments(
			List<Shipment> lista, Function<Shipment, Double>f){
		
		List<Double> results = new ArrayList<>();
		
		for (Shipment s : lista){
			results.add(f.apply(s));
		}
		return results;
	}
	
	public static void main(String args[]){
		List<Shipment> lista = new ArrayList<Shipment>();
		
		//PRUEBA AUXILIAR PARA ENTENDER LA FUNCION
		Function<Shipment, Double> funcion = Shipment::calculateWeight;
		
		Shipment ship01 = new Shipment();
		Double resultado = funcion.apply(ship01);
		System.out.println("res: "+resultado);
		
		
		//EJEMPLO02 AUXILIAR
		BiFunction<Shipment, Integer, Double> funcion01 = Shipment::calculaPeso;		
		resultado = funcion01.apply(ship01, 5);
		System.out.println("res2: "+resultado);
		
		funcion01 = (x,y) -> x.calculaPeso(y);
		resultado = funcion01.apply(ship01, 10);
		System.out.println("res3: "+resultado);
		
		//USING A LAMBDA EXPRESSION
		calculateOnShipments(lista, x -> x.calculateWeight());
		
		//USING A METHOD REFERENCE
		calculateOnShipments(lista, Shipment::calculateWeight);
		
		
	}
	
}
