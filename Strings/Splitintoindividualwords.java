package programming.Strings;
import java.util.*;
//15.	Write a Program to split the given String into individual words?
public class Splitintoindividualwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String h[]=s.split(" ");
		for(int i=0;i<h.length;i++)
		{
			System.out.println(h[i]);
		}
		
	}

}
