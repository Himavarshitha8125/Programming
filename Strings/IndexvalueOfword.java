//26.	Write a program to find the index values of a given word in a given String?
package programming.Strings;
import java.util.Scanner;
public class IndexvalueOfword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String word=sc.nextLine();
int index=s.indexOf(word);
if(index == -1)
{
	System.out.println("not found");
}
else
{
	System.out.println(index);
}
	
	}

}
