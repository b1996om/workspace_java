package day22;

public class ObjectArray1 {

	public static void main(String[] args) {
		//클래스명 객체배열명[]=ew 클래스명[크기];
		Aclass ar[] = new Aclass[3];
		ar[0]=new Aclass(); //이렇게 동일한 클래스명으로 선언해줘야 필드에 접근이 가능하다. 
		ar[0].x=100;
		ar[0].f1();
		System.out.println(ar[0].x);
	}

}
class Aclass {
	int x;
	void f1() {
		System.out.println("f1()");
	}
}