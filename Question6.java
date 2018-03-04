import java.util.*;

public class Question6 {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Type in a string: ");
			String input = sc.nextLine();
			onlyDigits(input);
		}
	}

	public static void onlyDigits(String input) {
		//if string is not digit or special character,
		if (!input.matches("[^a-zA-Z0-9 ]")) {
			int i = 0;
			int numConsonants = 0;
			int numVowels = 0;
			while (i < input.length()) {
				char x = input.charAt(i);
				if (!Character.isDigit(x)) {
					if(x == 'a' || x == 'e' || x == 'i'
							|| x == 'o' || x == 'u'){
						numVowels +=1;
					} else{
						numConsonants+=1;
					}
				}
				i++;
			}
			System.out.println("Number of consonants: " + numConsonants);
			System.out.println("Number of vowels: " + numVowels);
		} else {
			System.out.println("It has a special character.");
		}
	}
}

/*
* One of easiest String question you will ever see. You have to write a Java program which will take a String input
 * and print out number of vowels and consonants on that String. For example the if input is "Java" then your program
  * should print "2 vowels and 2 consonants". If you get this question on Interview, you should clarify that whether
   * String can contain numbers, special characters or not e.g. anything other than vowels and consonants.

* */