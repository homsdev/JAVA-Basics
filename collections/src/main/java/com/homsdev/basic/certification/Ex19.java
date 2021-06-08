package com.homsdev.basic.certification;

class Student{
	public String name="";
	public int age =0;
	public String major="Undeclared";
	public boolean fulltime= true;
	
	public void display() {
		System.out.println("Name: "+name+"Major: "+major);
	}

	public boolean isFulltime() {
		return fulltime;
	}
}



public class Ex19 {
	public static void main(String[] args) {
		Student bob= new Student();
		Student jian= new Student();
		bob.name="bob";
		bob.age=19;
		jian=bob;
		jian.name="Jian";
		System.out.println("Bob's name: "+bob.name);
	}
}
