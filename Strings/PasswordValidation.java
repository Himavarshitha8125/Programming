package programming.Strings;
import java.util.Scanner;
public class PasswordValidation {

	
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        String s = sc.nextLine();

	        if(s.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^A-Za-z0-9\\s])[A-Za-z0-9\\S]{9}"))
	        {
	            System.out.print("Valid Password");
	        }
	        else
	        {
	            System.out.print("Invalid Password");
	        }
	    }
	}