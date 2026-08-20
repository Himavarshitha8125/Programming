package programming.Strings;
import java.util.Scanner;
//7.	Write a Program to print the all the index’s of a  given character in a given string?
public class AllIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
char target=sc.next().charAt(0);
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==target)
	{
		System.out.print(i);
	}
}


	}

}
