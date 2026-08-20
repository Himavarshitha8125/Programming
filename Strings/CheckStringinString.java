package programming.Strings;
//12.	Write a Program to check the given character/String in a another given String?
import java.util.*;
public class CheckStringinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.contains(s2))
        {
            System.out.print("Found");
        }
        else
        {
            System.out.print("Not Found");
        }

	}

}
/* without predefined methods:
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char ch = sc.next().charAt(0);

        int count = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ch)
            {
                count++;
            }
        }

        if(count > 0)
        {
            System.out.print("Found");
        }
        else
        {
            System.out.print("Not Found");
        }
    }
}*/