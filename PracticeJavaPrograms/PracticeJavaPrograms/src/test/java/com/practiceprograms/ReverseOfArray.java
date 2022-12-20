package com.practiceprograms;

import org.testng.annotations.Test;

public class ReverseOfArray {
  @Test
	public static void main(String args[]) {

		int[] a = { 1, 2, 3, 4, 5 };
		int b = a.length;
		int temp;
		for (int i = 0; i < b / 2; i++) {
			temp = a[i];
			a[i] = a[b - i - 1];
			a[b - i - 1] = temp;
			// System.out.println(a[i]);
  }

		for (int i = 0; i < b; i++) {
			System.out.println(a[i]);
		}
	}
}
