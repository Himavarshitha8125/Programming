package programming.Strings;
//20.	Write a Program to check which is first word in dictionary order of given two words by ignoring Case?
import java.util.*;
import java.util.Scanner;
public class FirstwordDictionaryignoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        String s1 = sc.next();
	        String s2 = sc.next();

	        if(s1.compareToIgnoreCase(s2) < 0)
	        {
	            System.out.print(s1);
	        }
	        else if(s2.compareToIgnoreCase(s1) < 0)
	        {
	            System.out.print(s2);
	        }
	        else
	        {
	            System.out.print("Both are Same");
	        }
		
		
	}

}
