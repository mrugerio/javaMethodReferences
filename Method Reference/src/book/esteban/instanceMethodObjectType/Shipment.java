package book.esteban.instanceMethodObjectType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Shipment {
	
	public double calculateWeight(){
		double weight = 0;
		//CALCULATE WEIGHT
		return weight;
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
		
		//USING A LAMBDA EXPRESSION
		calculateOnShipments(lista, x -> x.calculateWeight());
		
		//USING A METHOD REFERENCE
		calculateOnShipments(lista, Shipment::calculateWeight);
	}
	
}
