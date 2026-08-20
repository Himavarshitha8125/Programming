package programming.Strings;
import java.util.Scanner;
public class CertainIndextoCertainIndex {
//10.	Write a Program to print the String value from certain index to certain index of  a given string?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int target1=sc.nextInt();
int target2=sc.nextInt();
for(int i=target1;i<target2;i++)
{
	System.out.print(s.charAt(i));
}

System.out.println(s.substring(1,5));
	}

}
