package stringandmethodslab;

import java.util.Scanner;

public class StringLab {

	public static void wheresWaldo(String phrase) {
		
	}
	
	public static void firstThingsFirst(String a, String b) {
		
	}
	
	public static void soLong(String a, String b) {
		
	}
	
	public static void afterMath(String phrase) {
		
	}
	
	public static void letterize(String word) {
		String newWord = StringLab2.capitalize(word);
		
		for (int i = 0; i < newWord.length(); i++) {
			System.out.println(newWord.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String word;
//		String phrase;
//		String a;
//		String b;
		String s;
		
		System.out.println("Hit me with a word. Go wild with upper and lower case.");
		word = scnr.next();
		
		System.out.println("Abra Cadabra: " + StringLab2.capitalize(word));
		
		scnr.nextLine();
		System.out.println("Please give me a string (word or sentence).");
		s = scnr.nextLine();
		
		System.out.println("Your string in reverse: " + StringLab2.reverse(s));
		
		System.out.println("Please enter a new word");
		word = scnr.next();
		
		letterize(word);
		
		scnr.close();

	}

}
