package programming.Strings;
import java.util.*;
public class CountEachCharacterinaString {


	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        String s = sc.nextLine();

	        int n = s.length();

	        int freq[] = new int[n];

	        // Find frequency of every character
	        for(int i = 0; i < n; i++)
	        {
	            int count = 0;

	            for(int j = 0; j < n; j++)
	            {
	                if(s.charAt(i) == s.charAt(j))
	                {
	                    count++;
	                }
	            }

	            freq[i] = count;
	        }

	        // Print every character and its frequency
	        for(int i = 0; i < n; i++)
	        {
	            System.out.println(s.charAt(i) + " -> " + freq[i]);
	        }
	    }
	}