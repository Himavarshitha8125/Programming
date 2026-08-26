//To count small letterrs in the string
package programming.Strings;
import java.util.Scanner;
public class CountSmallLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=0;
for(int i=0;i<s.length();i++)
		 {
	char c=s.charAt(i);
	if(c>='a' && c<='z')
	{
		count++;
	}
	
}
	if(count==0)
	{
		System.out.println("no small letters present in the string");
	}
		
	else
	{
		System.out.println(count);
	}
		
	}

}
