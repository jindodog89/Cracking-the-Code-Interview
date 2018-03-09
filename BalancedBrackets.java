import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stackBrackets = new Stack<Character>();
        int i = 0;
        int stringLength = expression.length();
        while(i < stringLength){
            char currChar = expression.charAt(i);
            if(currChar == '(' || currChar == '{' || currChar == '['){
                stackBrackets.push(currChar);
            } else if(currChar == ')' || currChar == '}' || currChar == ']'){
                if(stackBrackets.isEmpty()){
                    return false;
                } else {
                    char charFromStack = stackBrackets.pop();
                    if(!matchingAux(charFromStack,currChar)){
                        return false;
                    }
                }
            }
            i++;
        }
        if(!stackBrackets.isEmpty()){
            return false;
        }
        return true;
    }
    

    private static boolean matchingAux(char a, char b){
        if(a == '(' && b == ')'){
            return true;
        } else if(a == '[' && b == ']'){
            return true;
        } else if(a == '{' && b == '}'){
            return true;
        }
        return false;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
