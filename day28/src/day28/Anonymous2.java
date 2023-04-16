package day28;
//인터페이스를 익명클래스로 구현하기.
public class Anonymous2 {
	public static void main(String[] args) {
		//Inter1 it1 = new Inter1(); ->인터페이스는 객체를 생성할 수 없다.
		Inter1 it = new Inter1() {
			@Override
			public void f1() {
				System.out.println("inter1 imple f1()");
			}};
			it.f1(); //inter1 imple f1()
		}
	}

interface Inter1 {
	void f1();
}
class Inter1Impl implements Inter1 {
	@Override
	public void f1() {
		
	}
	
}