//print all small,Captials,numbers,special characters
package programming.Strings;
import java.util.Scanner;
public class AllsmallCapitalnumbersSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)>='A' && s.charAt(i)<='Z')
	{
	System.out.println("capital letters---"+s.charAt(i));	
	}
	
	if(s.charAt(i)>='a' && s.charAt(i)<='z') {
		System.out.println("small letters-----"+s.charAt(i));
	}
	if(s.charAt(i)>='0' && s.charAt(i)<='9')
	{
		System.out.println("numbers-----"+s.charAt(i));
	}
	if(!(s.charAt(i)>='A' && s.charAt(i)<='Z') && !(s.charAt(i)>='a' && s.charAt(i)<='z') && !(s.charAt(i)>='0' && s.charAt(i)<='9') && (s.charAt(i)!=' '))
	{
		System.out.println("specil characters----"+s.charAt(i));
	}
	
}
	}

}
