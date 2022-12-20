package com.practiceprograms;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeProgram {


	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();
		name.add("Sowmya");
		name.add("Madhu");
		name.add("Lilly");
		String name2 = "madhu";
		int i=0;
		for (String j : name) {
			if (j.equalsIgnoreCase(name2)) {
				i++;
				System.out.println("True");
				break;

			}
		}
		if(i==0) {
			System.out.println("False");
		}
	}
}


