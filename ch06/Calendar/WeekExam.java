package ch06.Calendar;

import java.util.Calendar;

public class WeekExam {

	public static void main(String[] args) {
		// Calendar 객체를 이용해서 날짜를 처리함

		Calendar cal = Calendar.getInstance();
		// .getInstance()는 내장된 객체를 가져옴(new x)

		int year = cal.get(Calendar.YEAR);
		// get() 메서드는 객체의 값을 가져오는 동작
		// Calendar.YEAR 매개값으로 년도를 신청.

		System.out.println("현재 년도 : " + year);

		int month = cal.get(Calendar.MONTH) + 1;
		// Calendar.MONTH는 0부터 시작하기 때문에 +1이 필수다.
		System.out.println("현재 월 : " + month);

		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("현재 일 : " + day);

		Week today = null;
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch (week) { // 요일 숫자로 받은 값을 변환

		case 1:
			today = Week.SUNDAY;
			System.out.println("현재 요일 : " + today); // 일요일
			break;

		case 2:
			today = Week.MONDAY;
			System.out.println("현재 요일 : " + today); // 월요일
			break;

		case 3:
			today = Week.TUESDAY;
			System.out.println("현재 요일 : " + today); // 화요일
			break;

		case 4:
			today = Week.WEDNESDAY;
			System.out.println("현재 요일 : " + today); // 수요일
			break;

		case 5:
			today = Week.THURSDAY;
			System.out.println("현재 요일 : " + today); // 목요일
			break;

		case 6:
			today = Week.FRIDAY;
			System.out.println("현재 요일 : " + today); // 금요일 
			break;

		case 7:
			today = Week.SATURDAY;
			System.out.println("현재 요일 : " + today); // 토요일
			break;
			
		default:
			System.out.println("버그 생성 : 작성자에게 문의 하세요");
			break;

		}
		// 요일은 숫자로 나옴,

		int hour = cal.get(Calendar.HOUR);
		System.out.println("현재 시 : " + hour);

		int minute = cal.get(Calendar.MINUTE);
		System.out.println("현재 분 : " + minute);

		int second = cal.get(Calendar.SECOND);
		System.out.println("현재 초 : " + second);

	}

}
