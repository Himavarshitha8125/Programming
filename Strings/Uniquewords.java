//41.	Write a program to print the unique words in a given string?
package programming.Strings;
import java.util.Scanner;
public class Uniquewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String words[]=s.split(" ");
int n=words.length;
int freq[]=new int[n];
//--------------------->to find the frequency
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
for(int i=0;i<n;i++)
{
	if(freq[i]==1)
	{
		System.out.print(words[i]+"->"+freq[i]);
	}
}



	}

}
