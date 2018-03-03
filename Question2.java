
import java.util.*;

public class Question2
{
	public static void main(String [] args)
	{
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Type in a string: ");
			String input = sc.nextLine();
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Type in another string: ");
			String input1 = sc1.nextLine();
			anagram(input,input1);
    	}
	}

	public static void anagram (String input, String input1) {

		int flag1 = 0;
		if(input.length() != input1.length()) {
            System.out.println("Not anagram");
        } else {
			input = input.trim().toUpperCase();
			input1 = input1.trim().toUpperCase();
			int i = 0;
            while(i < input.length()){
				int j = 0;
				int flag = 0; //1 => a char from input does exist in input1.
				while(j < input1.length()){
					if(input.charAt(i) == input1.charAt(j) ){
						StringBuilder input1Builder = new StringBuilder(input1);
						input1Builder.setCharAt(j,' ');
						input1 = input1Builder.toString();
						flag = 1;
						break;
					}
					j++;
				}
				if(flag != 1){
					System.out.println("Not anagram");
					flag1 = 1;
					break;
				}
				i++;
			}
			if(flag1 == 0){
				System.out.println("anagram");
			}
        }
	}
}

/*
2) How to check if two Strings are anagrams of each other? (solution)
A simple coding problem based upon String, but could also be asked with numbers.
You need to write a Java program to check if two given strings are anagrams of Each other.
Two strings are anagrams if they are written using the same exact letters, ignoring space,
punctuation and capitalization. Each letter should have the same count in both strings.
For example, Army and Mary are anagram of each other.
*/
