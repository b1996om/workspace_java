package day06;
//instanceof연산자 : 객체의 타입을 확인하는 연산자
public class Hello {
	
	public static void main(String[] args) {
		String s = "Hello";
		int i=3;
		float f=3.14f;
		double d=3.14;
		char c='a';
		
		System.out.println("Hello" instanceof String);
		System.out.println(Integer.valueOf(i) instanceof Integer);
		System.out.println(Float.valueOf(f) instanceof Float);
		System.out.println(Double.valueOf(d) instanceof Double);
		System.out.println(Character.valueOf(c) instanceof Character);
		}
}
