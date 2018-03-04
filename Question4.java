import java.util.*;

public class Question4
{
	public static void main(String [] args)
	{
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Type in a string: ");
			String input = sc.nextLine();
			System.out.println(reverseStringRecursive(input));
    	}
	}

    public static void reverseString(String input) {
        StringBuilder sb=new StringBuilder("");
        for(int i = input.length()-1; i>=0; i--){
            sb.append(input.charAt(i));
        }
        System.out.println(sb.toString());
    }

    public static String reverseStringRecursive(String input) {
        if(input == null) {
            return input;
        }
        char inputChar = input.charAt(input.length()-1);
        input = input.substring(0,input.length()-1);
        return reverseStringRecursive(input)+inputChar;
    }
}

/*
Your task is to write a program to reverse String in Java without using
StringBuffer class. You also need to provide both iterative and recursive algorithm
for String reversal. You can use other String utility methods e.g. charAt(),
toCharArray() or substring() from java.lang.String class.
*/
