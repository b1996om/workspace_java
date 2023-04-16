package day23;
//생성자
public class Constructor {
	public static void main(String[] args) {
		Aclass a=new Aclass();
	}

}
class Aclass {
	//기본생성자(==default 생성자)
	Aclass(){
		System.out.println("Aclass 기본생성자()");
	}
}