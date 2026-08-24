package programming.Strings;

import java.util.Scanner;

class Mostrepeateddescending
{

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

	        // Remove repeated words logically
	        for(int i = 0; i < n; i++)
	        {
	            int count = 0;

	            for(int j = 0; j < i; j++)
	            {
	                if(words[i].equals(words[j]))
	                {
	                    count++;
	                }
	            }

	            if(count > 0)
	            {
	                freq[i] = 0;
	            }
	        }

	        // Sort according to frequency in decreasing order
	        for(int i = 0; i < n - 1; i++)
	        {
	            for(int j = i + 1; j < n; j++)
	            {
	                if(freq[i] < freq[j])
	                {
	                    int temp = freq[i];
	                    freq[i] = freq[j];
	                    freq[j] = temp;

	                    String temp1 = words[i];
	                    words[i] = words[j];
	                    words[j] = temp1;
	                }
	            }
	        }

	        // Print
	        for(int i = 0; i < n; i++)
	        {
	            if(freq[i] > 0)
	            {
	                System.out.println(words[i] + " -> " + freq[i]);
	            }
	        }
	    }
	}