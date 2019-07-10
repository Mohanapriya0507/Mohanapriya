import java.util.*;
public class GreatestString {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        		 String s=sc.next();
                 String s1=sc.next();
             if(s.length()>s1.length()){
            	 System.out.println(s);
             } 
             else if(s.length()==s1.length()){
                	 System.out.println(s1);
             }
             else{
            	 System.out.println(s1);
             }
	}

}
