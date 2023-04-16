package day17;

public class Method1 {
	public static void main(String[] args) {
		open(); //open을 메서드로 사용하기 위해서 밑에 먼저 선언을 해준다.
		        //그럼 이후에 open을 호출하면 네가지 한번에 호출된다.
		f1(200);
	}
    static void open() {

    	System.out.println("문열열기");
    	System.out.println("바닥청소");
    	System.out.println("포스기켜");
    	System.out.println("빵을진열");
    }
    static void f1(int x ) {//함수 호출 시 100을 전달받아서, 전달받은 100을 출력하자!
    	System.out.println("x:"+x);
    	
    }
}
