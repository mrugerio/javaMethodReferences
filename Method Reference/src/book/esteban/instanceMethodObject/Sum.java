package book.esteban.instanceMethodObject;

public class Sum {
	
	Integer doSum(String s1, String s2){
		return Integer.parseInt(s1) + Integer.parseInt(s2);
	}
	
	public static void main(String args[]){
		
		//USING A LAMBDA EXPRESSION
		TriFunction<Sum, String, String, Integer> lambda01 = 
				(Sum s, String arg1, String arg2) -> s.doSum(arg1, arg2);
		System.out.println(lambda01.apply(new Sum(), "3", "4"));
		
		//USING A METHOD REFERENCE
		TriFunction<Sum, String, String, Integer> lambda02 = Sum::doSum;
		System.out.println(lambda01.apply(new Sum(), "6", "5"));

	}

}
