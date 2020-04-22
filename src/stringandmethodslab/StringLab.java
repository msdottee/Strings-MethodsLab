package stringandmethodslab;

import java.util.Scanner;

public class StringLab {

	public static String capitalize(String word) {
		String s1;
		
		s1 = word.substring(0,1).toUpperCase() + word.substring(1);
		
		return s1;
	}
	
	public static void wheresWaldo(String phrase) {
		
	}
	
	public static void firstThingsFirst(String a, String b) {
		
	}
	
	public static String reverse(String s) {
		StringBuilder s2 = new StringBuilder();
		
		s2.append(s);
		
		s2 = s2.reverse();
		
		return s2.toString();
	}
	
	public static void soLong(String a, String b) {
		
	}
	
	public static void afterMath(String phrase) {
		
	}
	
	public static void letterize(String word) {
		
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String word;
//		String phrase;
//		String a;
//		String b;
		String s;
		
		System.out.println("Hit me with that lowercase word.");
		word = scnr.next();
		
		System.out.println("Abra Cadabra: " + capitalize(word));
		
		scnr.nextLine();
		System.out.println("Please give me a string (sentence)");
		s = scnr.nextLine();
		
		System.out.println("Your string in reverse: " + reverse(s));
		
		scnr.close();

	}

}
