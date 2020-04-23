package stringandmethodslab;

import java.util.Scanner;

public class StringLab {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String word;
		String phrase;
		String a;
		String b;
		String s;
		
		System.out.println("Enter a word with random capitalization.");
		word = scnr.next();
		System.out.println("Abracadabra: " + StringMethods.capitalize(word));
		
		System.out.println();
		
		System.out.println("Enter a word");
		a = scnr.next();
		System.out.println("Enter another");
		b = scnr.next();
		System.out.println("The longer word is: ");
		soLong(a, b);
		
		System.out.println();
		
		System.out.println("Enter a word");
		a = scnr.next();
		System.out.println("Enter another word.");
		b = scnr.next();
		System.out.println("Here are the words in alphabetical order: " + StringMethods.firstThingsFirst(a, b) + " ");
		
		System.out.println();
		
		System.out.println("Please enter a word");
		word = scnr.next();
		
		letterize(word);
		
		System.out.println();
		
		scnr.nextLine();
		
		System.out.println("Enter a sentence with Waldo in it.");
		phrase = scnr.nextLine();
		System.out.println("Waldo is at index: " + StringMethods.wheresWaldo(phrase));
		
		System.out.println();
		
		System.out.println("Please give me a string (word or sentence).");
		s = scnr.nextLine();
		System.out.println("Your string in reverse: " + StringMethods.reverse(s));
		
		System.out.println();
		
		System.out.println("Enter a sentence with or without the word math.");
		phrase = scnr.nextLine();
		System.out.println("Your sentence after method afterMath: " + StringMethods.afterMath(phrase));
		
		System.out.println();
		
		System.out.println("Enter a phrase.");
		phrase = scnr.nextLine();
		System.out.println("Here is your sentence in camel case: " + StringMethods.camelCase(phrase));
		
		System.out.println();
		
		System.out.println("Thanks for spending some time with me! Goodbye!");
		
		scnr.close();

	}

}
