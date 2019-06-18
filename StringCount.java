import java.util.*;
public class StringCount{
    public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
      String s=sc.NextLine();
 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}
