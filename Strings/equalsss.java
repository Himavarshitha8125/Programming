package programming.Strings;
//17.	Write a Program to understand that where we have to use == and equals Method  in strings?
import java.util.Scanner;
public class equalsss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		  String s1 = "Java";
	        String s2 = "Java";

	        String s3 = new String("Java");
	        String s4 = new String("Java");

	        System.out.println(s1 == s2);
	        System.out.println(s1.equals(s2));

	        System.out.println(s3 == s4);
	        System.out.println(s3.equals(s4));
	}

}
