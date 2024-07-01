package ch06.car;

public class Car {
	// 자동차 객체용 클래스

	// 필드 (멤버 변수)
	// 고유데이터
	String company; // 제조회사
	String model; // 모델명
	String color; // 색상
	int maxSpeed; // 최대속도

	// 상태
	int speed; // 현재 속도
	int rpm; // 현재 엔진 회전수
	boolean start; // 시동 유무

	// 부품
	Body body; // 차종
	Engine engine; // 엔진회사
	Tire tire; // 타이어 회사

	// 생성자 (new) -> Source -> generate constructor using field
	public Car() { // 기본생성자 는 자동으로 생성 안됨. 
		
	}
	public Car(String company, String model, String color, int maxSpeed, boolean start) { 
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.start = start;
	}
	@Override // 재정의 코드 (객체를 문자열로 출력)
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + ", start=" + start + "]";
	}

	// 메서드 (동작)
	
	
	

}
