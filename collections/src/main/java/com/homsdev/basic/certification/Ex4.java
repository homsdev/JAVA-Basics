package com.homsdev.basic.certification;

interface Rideable {
	String getGait();
}

class Camel implements Rideable {
	int weight = 2;

	public String getGait() {
		return " mph, lope";
	}

	void go(int speed) {
		++speed;
		//Here is the error Weight must began with lowercase "w"
		//Weight++;
		int walkrate = speed * weight;
		System.out.println(walkrate+getGait());
	}
}

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Camel().go(8);
	}

}
