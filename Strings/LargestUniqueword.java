//43.	Write a program to print the largest Unique word in a given String
package programming.Strings;
import java.util.Scanner;
public class LargestUniqueword {

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

int max=0;
String result=" ";
int count=0;
for(int i=0;i<n;i++)

	{
	if(freq[i]==1)
	{
		count++;
		if(count==1 || words[i].length()>max)
		{
			max=words[i].length();
			result=words[i];
		}
	}
	}
if(max == 0)
{
    System.out.print("No Unique Words");
}
else
{
    System.out.print(result +"->"+max);
}
	}

}
