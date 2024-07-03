package ch12.priority;

public class CalcThread extends Thread {

	public CalcThread(String name) {
		setName(name);
	} // CalcThread calcThread = new CalcThread("스레드이름");

	@Override
	public void run() {
		for (int i = 0; i < 2000000000; i++) {

		}
		System.out.println(getName());
	}

}
