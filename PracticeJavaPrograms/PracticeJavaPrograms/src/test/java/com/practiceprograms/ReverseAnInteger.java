package com.practiceprograms;

public class ReverseAnInteger {

	public static void main(String[] args) {

		int number = 12345;
		int rev = 0;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println(rev);

	// Reverse of an integer
	int num = 12345;
	String name = String.valueOf(num);
	StringBuilder name1 = new StringBuilder(name);
	System.out.println(name1.reverse());

}
}