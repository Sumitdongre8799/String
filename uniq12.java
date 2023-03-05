
// Java program to illustrate string with
// unique characters using brute force technique
import java.util.*;

class uniq12 {
	boolean uniqueCharacters(String str) {
		// If at any time we encounter 2 same
		// characters, return false
		for (int i = 0; i < str.length(); i++)
			for (int j = i + 1; j < str.length(); j++)
				if (str.charAt(i) == str.charAt(j))
					return false;

		// If no duplicate characters encountered,
		// return true
		return true;
	}

	public static void main(String args[]) {
		uniq12 obj = new uniq12();
		String input = "GeeksforGeeks";

		if (obj.uniqueCharacters(input))
			System.out.println("The String " + input + " has all unique characters");
		else
			System.out.println("The String " + input + " has duplicate characters");
	}
}
