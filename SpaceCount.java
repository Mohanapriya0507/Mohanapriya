
     import java.util.*;
public class SpaceCount{
    public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
      String s=sc.NextLine();
 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') )
			{
				count++;
 
			}
		}
 		System.out.println("Number of spaces in a string = " + count-1);
	}
}
