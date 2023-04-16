package day30;
//console창 확인해서 결과값 확인해보기!
public class RethrowExample {
	public static void main(String[] args) {
		try {
			System.out.println("외부 try...");
			
			try {
				System.out.println("내부 try...");
				Exception e = new Exception();
				throw e; //예외던지기
			}
			catch (Exception e){
				System.out.println("(내부 try-catch) exception:" + e);
				System.out.println("예외던지기 한번더:");
				throw e; //ㅇ
			}
			finally {
				System.out.println("finally 구문 출력");
			}
		}
		catch(Exception e) {
			System.out.println("(외부 try-catch) exception:" + e);
		}
		System.out.println("종료");
	}

}
