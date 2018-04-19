import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int lonelyInteger(int[] a) {
        int i = 0;
        int j = 0;
        int arrayLength = a.length-1;
        int flag = 0;
        int uniqueInteger = a[0];
        
        while(i < arrayLength) {
            uniqueInteger = a[i];
            if(a[i] != 101){
                j = i + 1;
                while(j < a.length) {
                    if(a[i] == a[j]) {
                        a[i] = 101;
                        a[j] = 101;
                        flag = 1;
                        break;
                    }
                    j++;
                }
                if(flag == 0) break;
                
            } else if(a[i] == 101 && i == a.length-2){
                uniqueInteger = a[a.length-1];
                break;
            }
            flag = 0;
            i++;
        }
        return uniqueInteger;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
