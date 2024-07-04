package ch13.multiType;

public class Product<T, M> /*타입 모델*/ {
	// 필드
	private T kind;	// Car or Tv
	private M Model; // Model of Car, Model of Tv
	
	
	// 생성자
	
	
	// 메서드
	
	public T getKind() { //getter
		return kind;
	}
	public M getModel() { //getter
		return Model;
	}
	public void setKind(T kind) { //setter
		this.kind = kind;
	}
	public void setModel(M model) { //setter
		Model = model;
	}

}
