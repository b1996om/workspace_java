package day24;

public class ObjectTest {
	public static void main(String[] args) {
		Aclass a1 = new Aclass();
		Aclass a2 = new Aclass();
		
		//toString() : 객체정보를 문자열로 출력
		System.out.println(a1.toString());  //day24.Aclass@5e91993f
		System.out.println(a1);  //위의 결과값과 동일하게 출력(toString생략가능)
		
		//equals() : 두 객체가 동일한가 비교
		System.out.println(a1.equals(a2));  //false
		System.out.println(a1.equals(a1));  //true
		
		//getClass() : 객체의 클래스정보를 가져옴.
		System.out.println(a1.getClass());  //class day24.Aclass
		
	}
}
class Aclass {
	
}