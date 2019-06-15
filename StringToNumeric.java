import java.util.regex.*;
import java.util.*;
public class StringToNumeric{
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     System.out.println(Pattern.matches("[0-9]",s));
    
}
}
     
