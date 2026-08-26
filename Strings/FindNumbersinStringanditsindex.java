//27.	Write a program to find the numbers in a given String and print there index values?
package programming.Strings;
import java.util.Scanner;
public class FindNumbersinStringanditsindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=0;
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(ch>='0' && ch<='9')
	{
		System.out.println(ch+"-------->"+i);
		count++;
	}
	
}
if(count==0)
{
	System.out.println("No numbers in the given String");
}

			
		
	}

}
