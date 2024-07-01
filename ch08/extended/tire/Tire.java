package ch08.extended.tire;

public class Tire { // oem 타이어(내장)
	// 부모 객체

	// 필드
	public int maxRotation; // 타이어 최대 회전수 (0이면 터짐)
	public int accRotation; // 타이어 주행 거리(5씩 증가시킴)
	public String location; // 타이어 위치(왼앞,왼뒤,오앞,오뒤)
	// 생성자

	public Tire(int maxRotation, String location) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}// Tire tire = new Tire(int, "String"); -> 기본생성자 없음

	// 메서드
	public boolean roll() { // 달리면서 마일리지 소모
		accRotation += 5; // 주행거리 5씩 증가
		if (accRotation < maxRotation) { // 타이어 소모
			System.out.println(location + "위치의 타이어 수명 : " + (maxRotation - accRotation) + "마일리지");
			return true;

		} else {
			System.out.println("***** 경고 *****");
			System.out.println(location + "위치의 타이어가 펑크 되었습니다.");
			return false;
		}
	}

}
