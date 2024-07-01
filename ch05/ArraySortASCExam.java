package ch05;

public class ArraySortASCExam {

	public static void main(String[] args) {
		// 버블 정렬 오름차순으로 구현
		// 오름차순은 작은 값 부터 큰값으로 재배열함.
		// 필수 항목 : 임시방 (ex : temp)

		int[] scores = new int[] { 79, 88, 91, 33, 100, 55, 95 };
		// scores 변수에 int 배열 7칸 생성 하며 정수가 들어있음.

		System.out.println("=====배열 초기값 출력=====");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		System.out.println("======================");
		System.out.println("====오름 차순 정렬 시작====");

		for (int j = 0; j < scores.length - 1; j++) {
			for (int k = 0; k < scores.length - 1 - j; k++) {
				if (scores[k] > scores[k + 1]) {
					int temp = scores[k]; // 큰 값이 temp라는 임시방에 저장이 됨.
					scores[k] = scores[k + 1]; // 작은 값이 scores[k]에 저장이 됨.
					scores[k + 1] = temp; // 저장된 큰 값이 scores[k+1]에 저장이 됨.

				} // 옆자리랑 비교하여 큰지 물어보는 if문

				System.out.println("=====배열 정렬중  출력=====");
				for (int i = 0; i < scores.length; i++) {
					System.out.print(scores[i] + " ");
				}
				System.out.println();
				System.out.println("======================");
			} // 싸이클1(0~6) 싸이클2(0~5) 싸이클3(0~4) 싸이클4(0~3) 싸이클5(0~2) 싸이클6(0~1)
			
			System.out.println("싸이클 종료 ");

		} // j = 0부터 6 까지 반복(싸이클 반복용)

		System.out.println("=====배열 정렬 오름 차순 결과값  출력=====");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		System.out.println("======================");
	}

}
