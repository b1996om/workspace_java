package day04;

public class Equality_sign_operator {
	public static void main(String[] args) {
		double a=3.14; //실수형 변수 a에 3.14저장
		double b=5.14; //실수형 변수 b에 5.14저장
		System.out.println(a==b);
		System.out.println(a!=b);
		
		String c1 = "Hello JAVA!"; //c1 문자열 변수에 "Hello JAVA!"값 저장
		System.out.println(c1 == "Hello JAVA!"); //true
		System.out.println(c1.equals("Hello JAVA!")); //true 
		System.out.println(c1.equals("hello java!")); //false
	}
}
