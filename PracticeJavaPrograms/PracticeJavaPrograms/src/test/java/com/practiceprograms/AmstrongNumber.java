package com.practiceprograms;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		System.out.println("Number is: " + number);
		int temp = number;
		int digit = 0;
		int length = String.valueOf(number).length();
		int cube = 0;
		while (temp != 0) {
			// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
			digit = temp % 10;
			// 153%10 = 3
			// cube = 0+ 3*3*3
			cube += Math.pow(digit, length);
			temp = temp / 10;
			System.out.println(cube);
		}
		if (cube == number) {
			System.out.println("It's an amstrong number");
	}
		else {
			System.out.println("It's not an amstrong number");
		}
	}
}
