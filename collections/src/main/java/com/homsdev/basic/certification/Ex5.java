package com.homsdev.basic.certification;

import java.io.UncheckedIOException;

public class Ex5 {
		public static void doSomething() throws UncheckedIOException{
			throw new UncheckedIOException(null);
		}
		
		public static void main(String[] args) {
			try {
				doSomething();				
			}catch (UncheckedIOException e) {
				e.printStackTrace();
			}
		}
}
