package com.sdlc.javaprograms;

public class Constructorex {
	int i;
	char Section;
	int rollno;
	Constructorex()
	{ 
		i= 10;
		Section = 'A';
		System.out.println("invoked constructor");
	}
	public Constructorex(int rollno)
	{
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorex c= new Constructorex(); 
		System.out.println(c.i);
		System.out.println(c.Section);
		c.rollno = 1;
		System.out.println(c.rollno);
		Constructorex c1 = new Constructorex();
		System.out.println(c1.i);
		System.out.println(c1.Section);
		c1.rollno =2;
		System.out.println(c1.rollno);
		Constructorex c2 = new Constructorex(3);
		System.out.println(c2.rollno);

	}

}
