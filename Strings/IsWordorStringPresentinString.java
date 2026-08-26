////25.	Write a program to find the given word or a character is present or not in a given String?package programming.Strings;
package programming.Strings;
import java.util.Scanner;
public class IsWordorStringPresentinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String b=sc.nextLine();
if(s.contains(b))
{
	System.out.println("found");
}
else
{
	System.out.println("not found");
}
	}

}
