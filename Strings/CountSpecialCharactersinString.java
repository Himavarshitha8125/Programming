//28.	Write a program to count the number of Special keys in a given String?
package programming.Strings;
import java.util.Scanner;
public class CountSpecialCharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=0;
for(int i=0;i<s.length();i++)
{
	char c=s.charAt(i);
	if(!(c>='A' && c<='Z') && !(c>='a' && c<='z') && !(c>=0 && c<=9) && (c!=' '))
	{
		count++;
	}
}
if(count==0)
{
	System.out.println("No Special characters present in the String");
}
else
{
	System.out.println(count);
}
	}

}
