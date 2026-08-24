package programming.Strings;
import java.util.Scanner;
public class Smallestuniqueword {

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
//----------------> to find the least unique word
	int min=0;
	String result=" ";

for(int i=0;i<n;i++)
{
	if(freq[i]==1)
	{
		if(min==0 || words[i].length()<min)
		{
			min= words[i].length();
			result=words[i];
		}
	}
}
System.out.println(result+"--->"+min);
	}

}
