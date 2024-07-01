package ch04;

public class IfDiceExam {

	public static void main(String[] args) {
		// if문을 활용하여 주사위 값을 추출 해본다.
		// Math.random() 메서드는 컴퓨터 시간의 초를 활용하여 난수를 발생 시킴.

		int num = (int) (Math.random() * 6) + 1; // 1부터 6사이 값이 랜덤하게 추출 됨.
		System.out.println("주사위 값 : " + num);

	}

}
