package day27;
//여행 가이드 객체를 만들고 그 객체는 레저, 관광, 음식투어를 진행할 수 있도록 구현하기!
public class Interface3 {
	public static void main(String[] args) {
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
	}
}
interface Providable {
	void leisureSports();
	void sightseeing();
	void food();
}
class KoreaTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}
	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}
	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
}

class JapanTour implements Providable {
	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프 투어");
	}
	@Override
	public void sightseeing() {
		System.out.println("오사카 관람 투어");
	}
	@Override
	public void food() {
		System.out.println("초밥 투어");
	}
}

class TourGuide {
//	private Providable tour = new KoreaTour();
	private Providable tour = new JapanTour();
// -> 인터페이스를 사용하여 업 캐스팅을 하면, TourGuide와 KoreaTour클래스 간 관계가 느슨해지므로 코드의 수정이 간편함.
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}