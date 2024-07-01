package ch08.extended.abstractExam;

public class PhoneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Phone phone = new Phone("김기원")
		// phone 클래스에 abstract가 되어있어 객체로 사용할수 없음.
		// 사용하려면 구현 클래스 (조원) 상속받아 활용해야한다.

		SmartPhone smartPhone = new SmartPhone("김기원");
		smartPhone.turnOn(); // 부모
		System.out.println(smartPhone.owner); // 부모 생성자
		smartPhone.internetSearch();// 자식
		smartPhone.turnOff(); // 부모

	}

}
