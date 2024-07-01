package ch08.extended.car;

public class Car { // 부모 자동차

	// 필드
	public int speed;

	// 생성자
	public Car() { // 기본생성자, 안쓰면 자동으로 생성됨.

	} // Car car = new Car ();

	// 메서드

	public void speedUp() { // speedUp 메서드 호출시 속도가 1씩 증가
		speed += 1;

	} // speedUp 메서드 종료

	public final void stop() { // final 최종적
		System.out.println("자동차가 멈춥니다.");
		speed = 0;
	}

}
