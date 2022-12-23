package org.yoesoff.tutorial.specific;

public class GenericBox<T> {
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public static void main(String[] args) {
		GenericBox<Integer> integerBox = new GenericBox<Integer>();
		GenericBox<Long> longBox = new GenericBox<Long>();
		GenericBox<String> stringBox = new GenericBox<String>();
		
		integerBox.add(10);
		longBox.add(10L);
		stringBox.add("Hello World");
		
		System.out.printf(">> Integer Value :%d\n\n", integerBox.get());
		System.out.printf(">> Long Value :%d\n\n", longBox.get());
		System.out.printf(">> String Value :%s\n", stringBox.get());
	}
}
