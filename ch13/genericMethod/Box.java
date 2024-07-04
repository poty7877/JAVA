package ch13.genericMethod;

public class Box<T> extends Object {

	private T t;

	public T get() { // getter
		return t;
	}

	public void set(T t) { // setter
		this.t = t;
	}

}
