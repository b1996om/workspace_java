package day25;
//다운캐스팅1
public class Downcasting1 {
	public static void main(String[] args) {
		
		//업캐스팅
		Human h1 = new Student("가길동",20,"게임하기",3);
//		h1.study();
		//다운캐스팅 - 자식그릇에 부모값 넣겠다는 의미, (Student)-명시적으로 적어줘야함.
		Student s1 = (Student)h1;
		s1.study();
	}

}
