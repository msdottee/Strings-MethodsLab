package stringandmethodslab;

public class StringLab2 {
	
	public static String capitalize(String word) {
		String newWord;
		
		newWord = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
		
		return newWord;
	}
	
	public static String reverse(String s) {
		StringBuilder s1 = new StringBuilder();
		
		s1.append(s);
		
		s1 = s1.reverse();
		
		return s1.toString();
	}

}
