package day31;
// StringTokenizer 클래스
// import시켜주기.
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		//문자열 생성
		String str = "kim:010-1234-1234";
		String delim = ":";
		StringTokenizer st = new StringTokenizer(str,delim);
		System.out.println(st.countTokens()); //2
		System.out.println(st.nextToken()); //kim
		System.out.println(st.hasMoreTokens()); //true
		
		System.out.println(st.countTokens()); //1
		System.out.println(st.nextToken()); //010-1234-1234
		
		System.out.println(st.countTokens()); //0
		System.out.println(st.hasMoreTokens()); //false
		
	}

}
