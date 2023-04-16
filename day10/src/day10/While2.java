package day10;
// do-while문
// : 조건식의 결과값이 거짓이라면 한번은 실행되고 종료한다.
public class While2 {

	public static void main(String[] args) {
		int i =100;
		do {
			System.out.println("적어도 한번은 출력되는 문장"); // 조건이 거짓이어도 한번은 출력됨.
		}
		while(i<10);
		System.out.println("프로그램 종료");
		}
}