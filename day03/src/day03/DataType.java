package day03;
//형변환
public class DataType {
	public static void main(String[] args) {
		int a = 65;
		float b = a;  //묵시적(자동) 형변환
		System.out.println(b); //65.0
		
		char c = (char)a;  //명시적(강제) 형변환
		System.out.println(c); //A

	}

}
