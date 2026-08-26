//reverse the string without changing the positions of the words
package programming.Strings;
import java.util.Scanner;
public class ReversewithoutchangingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String words[]=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				System.out.print(words[i].charAt(j));
			}
			System.out.println();
		}

	}

}
