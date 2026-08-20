package programming.Strings;
//5.	Write a Program to print the index of a given character in a given string?
import java.util.Scanner;
public class IndexofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
for(int i=0;i<s.length();i++)
{
	// char ch=s.charAt(i);
	 
	System.out.println(s.codePointAt(i));
}
	}

}
