package day06;

public class Assign_operator {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		
		b=a; //오른쪽에 있는게 값이고 왼쪽에 있는게 저장공간이므로 a값 3이 b에 저장되서 b가 3
		System.out.println(b); //b=3
		
	    a+=1;  //a=a+1
	    System.out.println(a);  //a=4
	    
	    a/=2;  //a=a/2
	    System.out.println(a);  //a=4/2 =2
		
	    a*=a;  //a=a*2
	    System.out.println(a);  //a=4
		
	}

}
