//44.	Write a program to print the words and count of the duplicate words in a given String? 


package programming.Strings;


import java.util.Scanner;
public class CountOfDuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String words[]=s.split(" ");
		int n=words.length;
		int freq[]=new int[n];
		
		
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					
				}
			}
			freq[i]=count;
			
		}
	
		  // Print duplicate words and their count
		
		for(int i=0;i<n;i++)
		{
			if(freq[i]>1)
			{
				int count1=0;
				for(int j=0;j<i;j++)
				{
					if(words[i].equals(words[j]))
					{
						count1++;
					}
				}
				if(count1==0)
				{
					System.out.println(words[i] +"-->"+freq[i]);
				}
			}
		}
		

	}

}
// sample input :java python java c java python java c bhujkljk
