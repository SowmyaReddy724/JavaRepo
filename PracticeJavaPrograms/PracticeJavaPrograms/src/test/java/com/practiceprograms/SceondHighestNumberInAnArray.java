package com.practiceprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SceondHighestNumberInAnArray {

	public static void main(String[] args) {

		int[] number = { 34, 55, 67, 88, 46, 68 };
		int high = 0;
		int second = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] > high) {
				second = high;
				high = number[i];
			} else {
				second = number[i];

			}
		}
		System.out.println("Second highest number is:" + second);


		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(500);
		numbers.add(300);

		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println(numbers.get(1));
	}




	}
