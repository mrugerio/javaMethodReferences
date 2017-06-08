package book.esteban.statica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Numbers {

	public static boolean isMoreThanFifty(int n1, int n2){
		return (n1 + n2) > 50;
	}
	
	public static List<Integer> findNumbers(
			List<Integer> l, BiPredicate<Integer,Integer> p){
		
		List<Integer> newList = new ArrayList<>();
		
		for(Integer i: l){
			if (p.test(i, i+10)){
				newList.add(i);
			}
		}
		return newList;
	}
	
	public static void main(String args[]){
		List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);
	
		//USING A METHOD REFERENCE
		List<Integer> listaResultado;
		listaResultado = findNumbers(list, Numbers::isMoreThanFifty);
		System.out.println(listaResultado);
		
		//LAMBDA
		listaResultado = findNumbers(list, (x,y)-> Numbers.isMoreThanFifty(x, y));
		System.out.println(listaResultado);

	}
}
