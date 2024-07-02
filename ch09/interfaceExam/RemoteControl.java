package ch09.interfaceExam;

public interface RemoteControl {
	// 상수 (변하지않는 값) -> 초기값이 있다 .
	// 타입 상수명 = 값 ; static final 을 생략해도 상수처리 됨.
	public /* static final */ int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;

	// 상수 필드 : 인터페이스는 객체 사용설명서.
	// 런타임시(프로그램 실행시) 데이터를 저장할 수 있는 필드를 선언 할 수 없다.

	// 메서드 (추상, 디폴트, 정적)
	// 추상 메서드(기본값) : abstract(생략가능)-> 자식에게 강제로 주입 {실행 문 없이} ;으로 끝남
	public /* abstract */ void turnOn(); // 전원을 켠다.

	public void turnOff(); // 전원을 끈다.

	public void setVolume(int volume); // 소리 조절

	// 디폴트 메서드 : default -> 인스턴스 메서드용 new로 객체 생성 가능
	default void setMute(boolean mute) { // mute = true, false
		if (mute) {
			System.out.println("음소거 합니다.");
		} else {
			System.out.println("음소거 해제 합니다.");
		}
	}

	// 정적 메서드 : static -> new 없이 사용되는 메서드
	public static void changeBattery() {
		System.out.println("건전지를 교체 해야 합니다.");
	}

}
