package com.practiceprograms;

public class DuplicateCharInString {

	public static void main(String[] args) {

		String name = "sowmya";
		char[] name1 = name.toCharArray();
		int flag = 0;
		for (int i = 0; i < name1.length; i++) {
			flag = 0;
			for (int j = 0; j < i; j++) {

				if (name1[i] == name1[j]) {

					System.out.println(name1[j]);
					flag++;
					break;

				}
			}
		}
		if (flag == 0) {
			System.out.println("No duplicates found");

		}


	}

}
