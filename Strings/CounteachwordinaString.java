package programming.Strings;
import java.util.*;
public class CounteachwordinaString {


	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        String s = sc.nextLine();

	        String words[] = s.split(" ");

	        int n = words.length;

	        int freq[] = new int[n];

	        // Find frequency of every word
	        for(int i = 0; i < n; i++)
	        {
	            int count = 0;

	            for(int j = 0; j < n; j++)
	            {
	                if(words[i].equals(words[j]))
	                {
	                    count++;
	                }
	            }

	            freq[i] = count;
	        }

	        // Print every word and its frequency
	        for(int i = 0; i < n; i++)
	        {
	            System.out.println(words[i] + " -> " + freq[i]);
	        }
	    }
	}
