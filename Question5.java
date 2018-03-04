import java.util.*;

public class Question5
{
	public static void main(String [] args)
	{
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Type in a string: ");
			String input = sc.nextLine();
			onlyDigits(input);
    	}
	}

    public static void onlyDigits(String input) {
        if(input.matches("[0-9]+")){
            System.out.println("Only digits are contained");
        } else {
            System.out.println("Letters are also contained");
        }
    }
}

/*
You need to write a program to check a String contains only numbers by using
Regular expression in Java. You can use Java API but a solution without using
Java API will be better because that is what interviewer can always ask.
*/
