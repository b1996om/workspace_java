package day25;
//다형성1, 업캐스팅
public class Polymorphism1 {
	public static void main(String[] args) {
		
		A obj = new B(); //부모변수에 자식 값 넣는 것.(== 업캐스팅)
		obj.methodA();
//		obj.methodB(); - 이건 당연히 값 안나옴!(에러발생)
	}

}
class A {
	void methodA() {
		System.out.println("methodA");
	}
}
class B extends A {
	void methodB() {
		System.out.println("methodB");
	}
}