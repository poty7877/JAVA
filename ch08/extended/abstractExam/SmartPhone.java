package ch08.extended.abstractExam;

//구현 클래스, (추상 메서드를 상속받음)
public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		// 추상메서드에서 만든 생성자를 강제로 주입 받음.

		// TODO Auto-generated constructor stub
	}

	public void internetSearch() {
System.out.println("인터넷 검색을 합니다. ");
	}
}
