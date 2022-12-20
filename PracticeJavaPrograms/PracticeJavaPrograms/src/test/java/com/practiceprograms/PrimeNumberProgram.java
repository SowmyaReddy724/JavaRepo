package com.practiceprograms;

import java.util.Scanner;

public class PrimeNumberProgram {

	public static void main(String[] args) {

		/*
		 * int chk = 0; int count = 0; for (int i = 2; count < 10; i++) { chk = 0; for
		 * (int j = 2; j < i; j++) { if (i % j == 0) { chk++; break; } }
		 *
		 * if (chk == 0) { System.out.println(i); count++; }
		 *
		 * }
		 */

		// Check whether given number is prime or not

		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scanner.nextInt();
		System.out.println("Number is : " + num);
		int flag =0;
		for (int i = 2; i <= num / 2; i++) {
			flag = 0;
			if (num % i == 0) {
					System.out.println("inside fist if condition");
				flag++;
				break;
			}

		}
		if (flag == 0) {
			System.out.println("It's a prime number");
		} else {
			System.out.println("It's not a prime number");
		}

	}
}
