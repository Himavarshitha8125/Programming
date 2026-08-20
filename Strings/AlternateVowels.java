package programming.Strings;
//2.	Write a Program to print the alternative vowels in a given string?
import java.util.Scanner;

public class AlternateVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
		//f(c=='" || c=="E" || c=="I" || c=="O" || c=="U" |  c=="e"|| c=="i"|| c=="o" ||c=="u" || c=="a")
			if(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
			
		
		if(count%2==1)

				{
			System.out.println(c);
			
			
			
				}
			}
			
		}
	}

}
