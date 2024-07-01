package ch08.extended.vehicle;

public class Bus extends Vehicle {// vehicle의 자식

	String type;

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void busCard() {
		System.out.println("승차권");
	}

}
