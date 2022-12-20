package com.practiceprograms;

import java.util.HashMap;

public class HashMapUsage {

	public static void main(String[] args) {
		// To count the number of words in a string using HashMap.

		String name = "sowmya";
		String[] split = name.split("");
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i]))
					{
			int count = map.get(split[i]);
			map.put(split[i], count + 1);
			} else {
			map.put(split[i], 1);
			}
			}
			System.out.println(map);
		}
}


