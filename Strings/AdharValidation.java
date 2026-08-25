package programming.Strings;
import java.util.Scanner;
public class AdharValidation {

	
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        String s = sc.nextLine();

	        if(s.matches("[0-9]{4} [0-9]{4} [0-9]{4}"))
	        {
	            System.out.print("Valid Aadhar Number");
	        }
	        else
	        {
	            System.out.print("Not a Valid Aadhar Number");
	        }
	    }
	}