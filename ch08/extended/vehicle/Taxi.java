package ch08.extended.vehicle;

public class Taxi extends Vehicle {// vehicle의 자식

	String model; // 택시 종류 (카카오,티,수원,등등)

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

	public void meter() {
		System.out.println("요금을 측정합니다.");
	}

}
