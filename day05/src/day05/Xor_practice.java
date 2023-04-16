package day05;
//비트 논리연산자, 비트 쉬프트 연산자
public class Xor_practice {

	public static void main(String[] args) {
		int a=15; //1111(2)
		int b=5;  //0101(2)
		
		//비트 논리연산자
		System.out.println(a&b); //0101(2) = 5
		System.out.println(a|b); //1111(2) = 15
		System.out.println(a^b); //1010(2) = 10
		
		System.out.println(~b); //1010(2) = 10이 아니라 -6이 나옴.
		
		//비트 쉬프트 연산자
		System.out.println(a>>2);
		System.out.println(b<<4);
	}

}
