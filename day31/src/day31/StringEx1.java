package day31;
// 다양한 String 클래스 
public class StringEx1 {
	public static void main(String[] args) {
		String str = "hello";
		//concat
		System.out.println(str.concat(" world!"));  //hello world!
	    System.out.println(str);   //hello
	    //substring(시작위치, 끝위치):시작위치부터 끝위치 전까지 가져온다.
	    System.out.println(str.substring(2, 4)); //ll
	    System.out.println(str.substring(3)); //3위치부터 시작해서 끝까지가져와. - lo
	    //length()
	    System.out.println(str.length());  //5 (문자열 길이)
	    //toUpperCase, toLowerCase
	    System.out.println(str.toUpperCase()); //HELLO
	    System.out.println("TesT".toLowerCase()); //test
	    
	    //charAt(인덱스), indexOf(문자열), equals(문자열)
	    System.out.println(str.charAt(0)); //h (0번째 문자)
	    System.out.println(str.charAt(1)); //e (1번째 문자)
	    System.out.println(str.indexOf("o")); //4(문자열 "o"의 위치)
	    System.out.println("hello world!".indexOf("WORLD")); //-1:못찾음
	    System.out.println(str.equals("hello")); //true 
	    System.out.println(str.equals("HELLO")); //false
	    
	    //trim(), replace, replaceAll
	    System.out.println(" test".trim()); //test앞에 공백제거
	    System.out.println("hello world!".replace('l', 'L')); //heLLo worLd! : 스몰l을 라지L로 바꾸겠다.
	    System.out.println("hello world!".replaceAll("hello", "bye")); //bye world! : hello를 bye로 바꾸겠다.
	}
}
