package programming.Strings;
import java.util.Scanner;
public class PanCardValidation {
	
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        String s = sc.nextLine();

	        if(s.matches("[A-Z]{3}[PCFAHT][A-Z][0-9]{4}[A-Z]"))
	        {
	            System.out.print("Valid Pan Number");
	        }
	        else
	        {
	            System.out.print("Not a Valid Pan Number");
	        }
	    }
	}