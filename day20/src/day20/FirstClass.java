package day20;

public class FirstClass {

	public static void main(String[] args) {
		//변수=객체값;
		//클래스명 참조변수 = new 클래스명();
		ClassA ca = new ClassA();
		System.out.println(ca.x); //10
		ca.f1(); //f1()
		
		ca.x=30;
		System.out.println(ca.x); //30
	}

}

class ClassA {
	int x=10;
	void f1() {
		System.out.println("f1()");
	}
}