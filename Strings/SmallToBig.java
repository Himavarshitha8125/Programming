//31.	Write a program to convert all small characters into capital characters and all capitals characters into small characters remaining characters don’t disturb any thing print Directly? 
package programming.Strings;
import java.util.Scanner;
public class SmallToBig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String b[]=s.split(" ");
for(int i=0;i<s.length();i++)
{
	char c=s.charAt(i);
if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
	System.out.print((char)(c+32));
	
}
else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
	System.out.print((char)(c-32));

}
else
{
	System.out.print(c);
}
}
	}

}
