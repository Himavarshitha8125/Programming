//32.	Write a program to convert all small characters into capital characters and all capitals characters into small characters of alternative places?
package programming.Strings;
import java.util.Scanner;
public class Aiternatesmalltobigvicereverse {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=0;i<s.length();i++)
{
	char c=s.charAt(i);
	if(i%2==0)
	{
		if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
			System.out.print((char)(c+32));
		}
		else if(c>='a' && c<='z')
		{
			System.out.print((char)(c-32));
		}
		else
		{
			System.out.print(c);
		}
	}
	else
	{
		System.out.print(c);
	}
}
	}

}
