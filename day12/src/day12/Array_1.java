package day12;

public class Array_1 {

	public static void main(String[] args) {
		//3명의 학생 점수를 저장하고 싶다. 100점, 80점, 70점
		
		int scores[]=new int[3];
		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 70;
		
	  /*System.out.println("1번째 학생의 점수:" + scores[0] + "점");
		System.out.println("2번째 학생의 점수:" + scores[1] + "점");
		System.out.println("3번째 학생의 점수:" + scores[2] + "점");*/
		//위의 긴 식을 밑의 for문으로 간단하게 정리할 수 있다!
		
		for(int i=0; i<3; i++) {
			System.out.println(i + 1 + "번째 학생의 점수" + scores[i] + "점");
		}
	}

}
