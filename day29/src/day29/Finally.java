package day29;
//Finally 구문 - 네트워크(N/W) 연결 시, 외부와의 연결을 종료하는 작업에 주로 사용!
public class Finally {
	public static void main(String[] args) {
		//외부로 접근
		int a=0;
		int b=2;
		try {
			System.out.println("외부로 접속");
			int c=b/a;
//			int c=b/3; //오류가 안나기 때문에 외부로 접속하고 바로 finally문으로 감.
		}
		catch(ArithmeticException e) {
			System.out.println("오류가 발생하였습니다.");
		}
		finally {
			System.out.println("무조건 연결해제");
		}
	}
}
