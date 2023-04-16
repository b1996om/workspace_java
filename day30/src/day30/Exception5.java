package day30;
//예외처리 - 나만의 예외클래스 만들기.  -> console창 확인해서 결과값 보기!
public class Exception5 {
	public static void main(String[] args) {
		int age = -19;
		try {
			ticketing(age);
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
	}
	public static void ticketing(int age) throws AgeException {
		if(age<0) {
			throw new AgeException("나이 입력이 잘못되었습니다.");
		}
	}
}
class AgeException extends Exception {
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
}