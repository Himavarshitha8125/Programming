package programming.Strings;
import java.util.Scanner;
//6.	Write a Program to print the last index of a given character in a given string?
public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String b=sc.next();
		char ch=sc.next().charAt(0);
		System.out.println(b.lastIndexOf(ch));
		}

}
