package day32;

public class IntegerWrapper {
	public static void main(String[] args) {
		Integer ii = 30; //auto boxing
		//Integer -> int
		System.out.println(ii.intValue()+3); //33 
		//Integer -> double
		System.out.println(ii.doubleValue());
		//Integer -> float
		System.out.println(ii.floatValue());
		//Integer -> String
		System.out.println(ii.toString()+3); //303 - 문자열이기때문에.
		
	}

}
