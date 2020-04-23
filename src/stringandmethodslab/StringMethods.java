package stringandmethodslab;

public class StringMethods {
	
	public static String capitalize(String word) {
		String newWord;
		
		newWord = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
		
		return newWord;
	}
	
	public static int wheresWaldo(String phrase) {
		int stringIndex;
		
		stringIndex = phrase.indexOf("Waldo");
		return stringIndex;
		
	}
	
	public static String firstThingsFirst(String a, String b) {
		
		if (a.compareToIgnoreCase(b) < 1) {
			return a + " " + b;
		} else if (a.compareToIgnoreCase(b) > 1) {
			return b + " " + a;
		} else {
			return a + " " + b;
		}
	}
	
	public static String reverse(String s) {
		StringBuilder s1 = new StringBuilder();
		
		s1.append(s);
		
		s1 = s1.reverse();
		
		return s1.toString();
	}
	
	public static String afterMath(String phrase) {
		int mathIndex;
		String newPhrase;
		
		if (phrase.toLowerCase().contains("math")) {
			mathIndex = phrase.indexOf("math");
			newPhrase = phrase.substring(mathIndex);
		} else {
			newPhrase = "dud";
		}
		
		return newPhrase;
	}
	
	public static String camelCase(String phrase) {
		StringBuilder result = new StringBuilder();
		
		String[] splitString = phrase.split(" ");
		
		result.append(splitString[0]);
		
		for(int i = 1; i < splitString.length; i++) {
			
			result.append(Character.toUpperCase(splitString[i].charAt(0)) + 
					splitString[i].substring(1));
		}
		
		return result.toString();
	}
	
	public static void soLong(String a, String b) {
		
		if(a.length() > b.length()) {
			System.out.println(a);
		} else if (a.length() < b.length()) {
			System.out.println(b);
		} else {
			System.out.println(a + " " + b);
		}
		
	}
	
	public static void letterize(String word) {
		String newWord = StringMethods.capitalize(word);
		
		for (int i = 0; i < newWord.length(); i++) {
			System.out.println(newWord.charAt(i));
		}
	}
	


}
