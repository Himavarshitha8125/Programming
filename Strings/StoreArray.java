package programming.Strings;
import java.util.*;
//11.	Write a Program to store the given String in character array and then print that character array?
public class StoreArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.next();
char ch[]=s.toCharArray();
for(int i=0;i<s.length();i++)
{
	System.out.println((ch[i]));
}


System.out.println(Arrays.toString(ch));



	}

}
