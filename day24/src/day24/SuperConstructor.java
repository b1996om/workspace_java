package day24;

public class SuperConstructor {
	public static void main(String[] args) {
		SportsCar mycar = new SportsCar("red",300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
	}

}

class Car {
	int wheel;
	int speed;
	String color;
	Car(){}  //이렇게 디폴트 생성자를 만들어줘야 SportsCar에서 오류가 사라진다.
	Car(String color) {
		this.color = color;
	}
}

class SportsCar extends Car {
	int speedLimit;
	SportsCar(String color, int speedLimit) {
		super(color); //위에서 디폴트생성자를 만들어주지 않고 이렇게 super로 지정해줘도 된다.
		this.color = color;
		this.speedLimit = speedLimit;
	}
}