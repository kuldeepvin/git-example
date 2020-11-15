package com.git.test;

public abstract class TestClass {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		hayHello();
		hayAdvanceHello();

	}

	public static void hayHello() {
		System.out.println("From sayhello Method()");
	}
	
	public static void hayAdvanceHello() {
		System.out.println("From sayAdvancehello Method()");
	}
}
