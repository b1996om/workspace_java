package day28;
//익명클래스(Anonymous)
public class Anonymous {
	public static void main(String[] args) {
		OuterClass1 o = new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의된 익명클래스 입니다.");
			}
		};
		o.a(); //새롭게 정의된 익명클래스 입니다.
		OuterClass1 ok = new OuterClass1();
		ok.a(); //method a, 즉 익명클래스는 일회성이다.
	}

}
class OuterClass1 {
	void a() {System.out.println("method a");}
	void b() {}
}