package programming.Strings;
import java.util.*;
public class FirstWordinDictionary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        String s1 = sc.next();
	        String s2 = sc.next();

	        if(s1.compareTo(s2) < 0)
	        {
	            System.out.print(s1);
	        }
	        else if(s2.compareTo(s1) < 0)
	        {
	            System.out.print(s2);
	        }
	        else
	        {
	            System.out.print("Both are Same");
	        }
	}

}
