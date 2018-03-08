import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        
        int i=0;
        int aLength = a.length;
        //how many times I am going to rotate
        while(i<k) {
            //one more loop to actually rotate
            int s = 0;
            int tempFirstIndex = a[0];
            while(s < aLength-1) {
                a[s]=a[s+1];    
                s++;
            }
            a[aLength-1]=tempFirstIndex;
            i++;
        }
        
        return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
