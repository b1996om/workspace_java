package day30;
//throw - 예외발생
public class Exception2 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의 예외");
			throw e; //고의로 예외를 던지겠다.
		}
		catch(Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage()); //고의 예외
		}
	}
}