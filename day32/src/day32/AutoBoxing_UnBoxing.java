package day32;

public class AutoBoxing_UnBoxing {
	public static void main(String[] args) {
		//autoBoxing : 기본 자료형 값을 자동으로 wrapper클래스의 객체로 변환시켜줌.
		Integer i = 10;
		Double d = 3.14;
		Float f = 3.14f;
		Character c = 'A';
		
		//auto unBoxing : wrapper클래스의 객체 값을 자동으로 기본 자료형 값으로 변환시켜 줌.
		int ii = i;
		double dd=d;
		float ff=f;
		char cc=c;
		System.out.println(ii); //10		
		System.out.println(dd);	//3.14		
		System.out.println(ff); //3.14
		System.out.println(cc);	//A	
	}

}
