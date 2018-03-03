
import java.util.*;

public class Question1
{
	public static void main(String [] args)
	{
		//take string scanner infinite loop.
		String input1 = "";
		//Scanner sc = new Scanner(System.in);
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Type in a string: ");
			String input = sc.nextLine();
            //do work
			duplicate(input);
    	}
	}

	public static void duplicate (String input) {
		char[] charArray = input.toCharArray();
		int i = 0;
		while(i < charArray.length-1) {
			char currentChar = charArray[i];
			int j = i+1;
			int flag = 1; // 0 = duplicate => print // 1 = no duplicate => not print
			int flag1 = 1; //1 = unlock // 0 = locked
			while(j < charArray.length) {
				if(currentChar == charArray[j]) {
					if(flag1 == 1) {
						flag = 0;
						//flag1 is locked now.
						flag1 = 0;
					}
					charArray[j] = ' ';
				}
				j++;
			}
			if(flag == 0 && currentChar != ' '){
				System.out.println("Duplicate letter: " + currentChar);
			}
			i++;
		}
	}
}

/*
1) How to Print duplicate characters from String? (solution)
You need to write a program in C, C++, Java or Python to print duplicate characters
from a given String, for example if String is "Java" then program should print "a".
Bonus points if your program is robust and handle different kinds of input e.g.
String without duplicate, null or empty String etc.
Bonus points if you also write unit tests for normal and edge cases.
*/
