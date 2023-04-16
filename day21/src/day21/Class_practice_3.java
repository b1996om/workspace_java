package day21;

public class Class_practice_3 {
	public static void main(String[] args) {
		System.out.println(Car.wheel); //4
		
		Car myCar1=new Car();
		System.out.println(myCar1.speed); //0(으로 초기화.)
		
		Car myCar2=new Car();
		
		System.out.println("<변경전>");
		System.out.println("myCar1.speed:"+myCar1.speed); //0
		System.out.println("myCar2.speed:"+myCar1.speed); //0
		System.out.println("myCar1.wheel:"+myCar1.wheel); //4
		System.out.println("myCar2.wheel:"+myCar1.wheel); //4
		
		myCar2.speed=100;
		myCar2.wheel=5;
		
		System.out.println("<변경후>");
		System.out.println("myCar1.speed:"+myCar1.speed); //0
		System.out.println("myCar2.speed:"+myCar1.speed); //0
		System.out.println("myCar1.wheel:"+myCar1.wheel); //5
		System.out.println("myCar2.wheel:"+myCar1.wheel); //5
	}

}

class Car {
	static int wheel=4;
	int speed;
}
