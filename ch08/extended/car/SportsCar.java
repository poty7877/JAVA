package ch08.extended.car;

public class SportsCar extends Car { // 자식 자동차

	@Override
	public void speedUp() { // speedUp 메서드 재정의 (호출시 속도가 5씩 증가)
		speed += 5;
	}
	
	//@Override
	public void stop1() {
		
	}

}
