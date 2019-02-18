package com.sdlc.javaprograms;

public class Student {
	int rollno;
	String name;
	static int count = 10;
	static String college = "SVNC";
	public  void printStudentName()
	{
		System.out.println("name of the student  "+name);
		
	}
public static void printTotalCount()
{
	System.out.println("Totalcount  "+count);
}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.rollno = 1;
		s1.name = "sam";
		s1.printStudentName();
		Student s2 = new Student();
		s2.rollno = 2;
		s2.name ="Ram";
		s2.printStudentName();
		System.out.println(s1.rollno);
		System.out.println(s1.name);
        System.out.println(s2.rollno);
        System.out.println(s2.name);
        Student.printTotalCount();
	}

}
