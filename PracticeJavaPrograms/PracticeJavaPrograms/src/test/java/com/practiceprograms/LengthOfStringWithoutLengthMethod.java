package com.practiceprograms;

public class LengthOfStringWithoutLengthMethod {

	public static void main(String[] args) {
		String name = "Sowmya";
		int length = 0;
		int name1 = name.toCharArray().length;
		System.out.println(name1);
		System.out.println(name.lastIndexOf(""));



	// Remove junk values in string
	String junk = "abc#$%2def['/../,^/ajsoidjeop72189470^*&*";
	junk = junk.replaceAll("[^a-z,0-9,A-Z]", "");
	System.out.println(junk);

	// Replacing c char from String
	String girl = "Sowmya";
	girl = girl.replace("w", "u");
	System.out.println(girl);

}
}
