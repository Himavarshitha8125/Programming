package programming.Strings;
//18.	Write a Program to understand equalsIgnoreCase method in strings?
import java.util.Scanner;
public class Equalsignorecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				String s=sc.next();
				String b=sc.next();
				if(s.equalsIgnoreCase(b))
				{
					System.out.println("yes");
				}

				else
				{
					System.out.println("No");
				}
	}

}
