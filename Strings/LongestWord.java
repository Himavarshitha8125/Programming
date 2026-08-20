package programming.Strings;
import java.util.Scanner;
public class LongestWord {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();  // it reads the com[plete line
		String b[]=s.split(" ");
		String big=b[0];
for(int i=1;i<b.length;i++)
{
	if(b[i].length()>big.length())
	{
		big=b[i];
	}
}
System.out.println(big);
	}

}


//method-2 -without using Split()
/* String s = sc.nextLine();

String word = "";
String big = "";

for(int i=0; i<s.length(); i++)
{
    char ch = s.charAt(i);

    if(ch!=' ')
    {
        word = word + ch;
    }
    else
    {
        if(word.length() > big.length())
        {
            big = word;
        }

        word = "";
    }
}

if(word.length() > big.length())
{
    big = word;
}

System.out.print(big);
}*/