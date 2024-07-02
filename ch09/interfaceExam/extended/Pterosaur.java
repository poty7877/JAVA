package ch09.interfaceExam.extended;

public class Pterosaur implements Bird {

	@Override
	public void land() {
		System.out.println("홍학이 착륙한다.");
		
	}

	@Override
	public void flying() {
		System.out.println("홍학이 난다");
		// TODO Auto-generated method stub

	}

	@Override
	public void takeOff() {
		System.out.println("홍학이 이륙한다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		System.out.println("홍학이 먹는다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void breath() {
		System.out.println("홍학이 숨을쉰다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		System.out.println("홍학이 배출한다");
		// TODO Auto-generated method stub

	}

	@Override
	public void sound() {
		System.out.println("홍학이 소리를낸다.");
		// TODO Auto-generated method stub

	} // 익룡

}
