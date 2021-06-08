package com.homsdev.basic.certification;

class SampleClass {

}

class AnotherSampleClass extends SampleClass {

}

public class Ex12 {

	public static void main(String[] args) {
		AnotherSampleClass asc = new AnotherSampleClass();
		SampleClass sc = new SampleClass();
		sc = asc;

		System.out.println("sc: " + sc.getClass());
		System.out.println("asc: " + asc.getClass());
	}

}
