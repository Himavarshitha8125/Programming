package programming.Strings;
import java.util.*;
public class Replacecomma {
//13.	Write a Program to replace the all comma’s by space in a given string?
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String f=s.replace(",", " ");
		System.out.println(f);
	}

}
