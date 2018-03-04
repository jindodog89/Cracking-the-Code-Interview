import java.util.*;

public class Question3
{
	public static void main(String [] args)
	{
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Type in a string: ");
			String input = sc.nextLine();
			uniqueChar(input);
    	}
	}
    public static void uniqueChar(String input) {
        //hashmap
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        int i = 0;
        while(i < input.length()){
            if(hmap.containsKey(input.charAt(i))){
                hmap.put(input.charAt(i), hmap.get(input.charAt(i)) + 1);
            } else {
                hmap.put(input.charAt(i),1);
            }
            i++;
        }

        for(int a = 0; a < input.length(); a++) {
            if(hmap.get(input.charAt(a)) == 1) {
                System.out.println(input.charAt(a));
				return;
            }
        }
    }
}

/*
One of the most common string interview questions: Find the first non-repeated
(unique) character in a given string. for Example if given String is "Morning"
then it should print "M". This question demonstrates efficient use of Hashtable.
We scan the string from left to right counting the number occurrences of each
character in a Hashtable. Then we perform a second pass and check the counts
of every character. Whenever we hit a count of 1 we return that character,
that’s the first unique letter. Be prepared for follow-up question for improving
memory efficiency, solving it without hash table as well.
*/
