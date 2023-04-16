package day32;
// Wrapper 클래스
public class WrapperEx1 {
	public static void main(String[] args) {
		int i = 30;
		Integer ii = new Integer(i); //jdk9 버전 이후부터는 Wrapper 클래스의 생성자 사용을 권장하지 않는다.ㅍ그래서 줄쳐져있는 것.
		System.out.println(ii); //30
		
		double d = 3.14;
		Double dd = new Double(d);
		System.out.println(dd); //3.14
	}

}
