package day20;

public class Exam31 {
	public static void main(String[] args) {
		Car mycar=new Car();
		System.out.println("시동 처음 초기화:"+mycar.powerOn); //false
		System.out.println("차의 색상 초기화:"+mycar.color); //null
		System.out.println("바퀴의 수 초기화:"+mycar.wheel); //0
		System.out.println("속력 초기화:"+mycar.speed); //0
		System.out.println("와이퍼 작동 초기화:"+mycar.wiperOn); //false
		
		mycar.power();
		System.out.println("시동 메서드 동작:"+mycar.powerOn); //true
		mycar.power();
		System.out.println("자동메서드 다시 동작"+mycar.powerOn); //false
		
		mycar.color="black";
		System.out.println("현재 차의 색상:"+mycar.color); //black
	}
}
class Car {
	boolean powerOn; //시동
	String color; //색깔
	int wheel; //바퀴수
	int speed; //속력
	boolean wiperOn; //와이퍼
	
	void power() {powerOn=!powerOn;} //true->false, false->true
	void speedUp() {speed++;}
	void speedDown() {speed--;}
	void wiper() {wiperOn=!wiperOn;} //true->false, false->true
 }

