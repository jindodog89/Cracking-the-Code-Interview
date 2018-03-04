/**
 * Created by choi on 3/3/18.
 */
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Type in a string: ");
            String input = sc.nextLine();
            System.out.print("Type in a character: ");
            char c = sc.nextLine().charAt(0);
            replaceCharacter(input,c);
        }
    }

    public static void replaceCharacter(String input, char c){
        int i = 0;
        StringBuilder sb=new StringBuilder("");
        while(i < input.length()) {
            char temp = input.charAt(i);
            if(temp == c){
                sb.append("%20");
            } else{
                sb.append(temp);
            }
            i++;
        }
        System.out.println(sb.toString());
    }
}

/*
* Write a Java program to replace a given character in a String to other provided character, for example if you are asked to replace each blank
 * in a String with %20, similar to URL encoding done by the browser, so that Server can read all request parameters.
 * For example if the input is "Java is Great" and asked to replace space with %20 then it should be "Java%20is%20Great".
*/
