package com.practiceprograms;

public class ReverseAstring {

	public static void main(String[] args) {

		// Reverse of a string and palindrome check

		String name = "aabaa";
		String temp = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			// System.out.println(name.charAt(i));
			temp = temp + name.charAt(i);
		}
		System.out.println(temp);
		System.out.println(name);
		if (name.equals(temp)) {
			System.out.println("It's a palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

		//int[] a= {1,2,3,4,5};

		// String to CharArray
		// char[] b = { 'a', 'b', 'c', 'd', 'e', 'f' };
		char[] b = name.toCharArray();
		int l=b.length;
		char tempy;
		for (int i = (l - 1) / 2; i >= 0; i--) {
			tempy=b[i];
			b[i]=b[l-i-1];
			b[l-i-1]=tempy;

		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println(new String(b));

		// Stringbuilder usage
		StringBuilder x = new StringBuilder("Sowmya");
		System.out.println(x.reverse().toString());

	}

	String y = "Madhu";
	String temporary = "";
	{
		for (int i = y.length() - 1; i >= 0; i--) {
			temporary = temporary + y.charAt(i);
		}
		System.out.println(temporary);
		if (y.equals(temporary)) {
			System.out.println("it's a palindrome");

		} else {
			System.out.println("Its not a palindrome");
		}

}
}