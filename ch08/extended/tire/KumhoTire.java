package ch08.extended.tire;

public class KumhoTire extends Tire {

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// oem 타이어에서 만든 규격대로 생성자 만듬.

	}

	@Override
	public boolean roll() { // 달리면서 마일리지 소모
		accRotation += 8; // 주행거리 3씩 증가
		if (accRotation < maxRotation) { // 타이어 소모
			System.out.println(location + "위치의 금호 타이어 수명 : " + (maxRotation - accRotation) + "마일리지");
			return true;

		} else {
			System.out.println("***** 경고 *****");
			System.out.println(location + "위치의 금호 타이어가 펑크 되었습니다.");
			return false;
		}
	}
}