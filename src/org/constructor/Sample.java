package org.constructor;

public class Sample {
	public Sample() {
		
		System.out.println("Non parametrized Constructor method");
	}
	public Sample(int w) {
		this('o');
		System.out.println("Parametrized Constructor method-int");
	}
	public Sample(char c) {
		this();
		System.out.println("Parametrized Constructor method-char");
	}
	public static void main(String[] args) {
		Sample s=new Sample(45);
	}
}
