package stringandmethodslab;

import java.util.Scanner;

public class StringLab {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a word with random capitalization.");
		String word = scnr.next();
		System.out.println("Abracadabra: " + StringMethods.capitalize(word));
		
		System.out.println();
		
		System.out.println("Enter a word of any length.");
		String a = scnr.next();
		System.out.println("Enter another of any length.");
		String b = scnr.next();
		System.out.println("The longer word is: ");
		StringMethods.soLong(a, b);
		
		System.out.println();
		
		System.out.println("Enter a word that satrts with any letter.");
		a = scnr.next();
		System.out.println("Enter another word that starts with a different letter.");
		b = scnr.next();
		System.out.println("Here are the words in alphabetical order: " + StringMethods.firstThingsFirst(a, b) + " ");
		
		System.out.println();
		
		System.out.println("Please enter a word of your choosing.");
		word = scnr.next();
		StringMethods.letterize(word);
		
		System.out.println();
		
		scnr.nextLine();
		
		System.out.println("Enter a sentence with Waldo in it.");
		String phrase = scnr.nextLine();
		System.out.println("Waldo is at index: " + StringMethods.wheresWaldo(phrase));
		
		System.out.println();
		
		System.out.println("Please enter a sentence you would like to see in reverse.");
		String s = scnr.nextLine();
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
