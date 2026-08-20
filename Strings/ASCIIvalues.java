package programming.Strings;
import java.util.Scanner;
//4.	Write a Program to print the ASCII key values of a given String characters?
public class ASCIIvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		System.out.println("method-1");
		for(int i=0;i<b.length();i++)
		{
			//System.out.println(b.codePointAt(i));--------------->method1
			 if(b.charAt(i)!=' ')// spaces ni count cheyadhu anukunappudu
			    {
		System.out.println((int)b.charAt(i)+" ");
			    }
			
		}
		
		
		System.out.println("Method-2");	 
			 
			for(int i=0;i<b.length();i++)
			{
				char ch=b.charAt(i);
				
				
				if(b.charAt(i)!=' ') {
					
				
				System.out.println((int)ch);
				}
				
			}
			 
			 

	}

}
