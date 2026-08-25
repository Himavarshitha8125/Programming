package programming.Strings;
import java.util.Scanner;
public class VehicleValidation {

	
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        String s = sc.nextLine();

	        if(s.matches("[A-Z]{2}-?[0-9]{1,2}-?[A-Z]{1,3}-?[0-9]{4}"))
	        {
	            System.out.print("Valid Vehicle Registration Number");
	        }
	        else
	        {
	            System.out.print("Not a Valid Vehicle Registration Number");
	        }
	    }
	}
