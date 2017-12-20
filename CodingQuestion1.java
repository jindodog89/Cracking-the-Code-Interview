/*
Cracking the Code Interview Page-48
1.1 Implement an algorithm to determine if a string has all unique characters. What if you
can not use additional data structures?
*/

/*
Plan:

1. Create a for loop to go through the entire string
2. Grab each chracter and compare it to all the rest in string (another for loop)
3. If it appears to be a duplicated character, return false.
4. Repeat the same process on every character.
5. If finish the for-loop without running across a duplicate, return true.
*/

import java.util.*;

public class CodingQuestion1
{
	public static void main(String [] args)
	{
     String input = getInputfromUser();
     System.out.println(checkUniqueChar(input));
	}

  private static String getInputfromUser() {
      System.out.print("Type in a string:");
      Scanner scanner = new Scanner( System.in );
      String input = scanner.nextLine();
      return input;
  }

  private static boolean checkUniqueChar(String inputString) {
      int inputStringLength = inputString.length();
      for(int i = 0; i < inputStringLength-1; i++) {
          char tempChar = inputString.charAt(i);
          for(int j = i+1; j < inputStringLength; j++){
              if(tempChar == inputString.charAt(j)) {
                  System.out.println("The given string is not unique");
                  return false;
              }
          }
      }
      System.out.println("The given string is unique");
      return true;
  }

}
