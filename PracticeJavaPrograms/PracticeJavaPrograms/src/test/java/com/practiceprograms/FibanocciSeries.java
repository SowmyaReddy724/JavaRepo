package com.practiceprograms;

public class FibanocciSeries {

	public static void main(String[] args) {

		//Display first 10 numbers
		int a = 0;
		int b = 1;
		int result;
		for (int i = 0; i < 10; i++) {
			System.out.println(a);
			result = a + b;
			b = a;
			a = result;

		}
	}
}
