package programming.Strings;
import java.util.Scanner;


//1.	Write a Program to print the alternative characters in a given String input?
public class Alternatechar {
	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
for(int i=0;i<s.length();i=i+2)
		
	System.out.println(s.charAt(i));
	
	}

}*/
//method-2

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++)
				
			if(i%2==0)
			{
			System.out.println(s.charAt(i));
			}
			
			}

		}