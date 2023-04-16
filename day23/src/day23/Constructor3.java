package day23;
//매개변수 생성자와 기본생성자(디폴트생성자)를 같이 사용하고 싶을 때는 기본생성자를 먼저 만들어줘야 함.
// -> 생성자 오버로딩!
public class Constructor3 {
	public static void main(String[] args) {
		Bclass b1 = new Bclass("홍길동");
		Bclass b2 = new Bclass(); 
		System.out.println(b1.name);
	}

}
class Bclass {
	String name;
	//생성자 오버로딩: 여러개의 생성자 중복정의
	Bclass(){} //기본생성자(디폴트생성자)
	Bclass(String name) { //매개변수 생성자
		System.out.println("Bclass의 매개변수 생성자()");
		this.name=name;
	}
}