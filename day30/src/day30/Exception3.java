package day30;
//throws - 예외던지기(현재메서드가 예외처리하지 않고 메서드 호출하는 부분에서 처리하도록 하는 것.)
public class Exception3 {
	public static void main(String[] args) {
		try {
			methodA();
		}
		catch(Exception e) {
			System.out.println("메인에서 처리");
		}
	}
	public static void methodA() throws Exception {
		methodB();
	}
	public static void methodB() throws Exception {
		methodC();
	}
	public static void methodC() throws Exception {
		Exception e = new Exception();
		throw e; //예외발생시킴.
  }
}
