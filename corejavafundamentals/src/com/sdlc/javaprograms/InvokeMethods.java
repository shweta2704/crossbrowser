package com.sdlc.javaprograms;

public class InvokeMethods {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int total= c.add(2, 3);
		int difference= c.sub(10, 5);
		System.out.println("Total " +total);
		System.out.println("difference  "+ difference);

	}

}
