package day27;
//다중 인터페이스.
public class Interface4 {
	public static void main(String[] args) {
		MyCellphone phone1 = new MyCellphone();
		Camera phone2 = new MyCellphone();
		Call phone3 = new MyCellphone();
		Memo phone4 = new MyCellphone();
		Clock phone5 = new MyCellphone();
		PhoneUser user1 = new PhoneUser();
		user1.call(phone1); //된다.
//		user1.call(phone2); //안된다.
		user1.call(phone3);
//		user1.call(phone4);
//		user1.call(phone5);
			
	}

}
interface Camera {
	void photo();
}
interface Call {
	void calling();
}
interface Memo {
	void wirte();
}
interface Clock {
	void clock();
}
class MyCellphone implements Camera, Call, Memo, Clock {
	@Override
	public void clock() {
		System.out.println("clock()");
	}
	@Override
	public void wirte() {
		System.out.println("write()");
	}

	@Override
	public void calling() {
		System.out.println("calling()");
	}

	@Override
	public void photo() {
		System.out.println("photo()");
	}
}
class PhoneUser {
	void call(Call c) {
		System.out.println("전화를 걸었습니다.");
	}
}