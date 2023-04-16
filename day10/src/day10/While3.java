package day10;
// while문
// : 조건식의 결과값이 거짓이라면 단 한번도 실행되느 않고 종료!
public class While3 {

	public static void main(String[] args) {
		int i = 100;
		while(i<10) {
			System.out.println("적어도 한번은 출력되는 문장"); //조건이 거짓이라, 한번도 실행안됨.
		}
		System.out.println("프로그램 종료");
	}

}
