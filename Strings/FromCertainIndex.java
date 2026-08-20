package programming.Strings;
import java.util.Scanner;
public class FromCertainIndex {
//9.	Write a Program to print the string value from certain index to the end of the given String?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
/*String s=sc.nextLine();
String s1=s.substring(3);
System.out.println(s1);


System.out.println("without predefined method");*/
String s2=sc.nextLine();
int target=sc.nextInt();
for(int i=target;i<s2.length();i++)
{
	System.out.print(s2.charAt(i));
}








	}

}
