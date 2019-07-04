import java.util.*;
import java.util.regex.*; 
public class CountNumericInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=0;
char[]ch=s.toCharArray();
     for(int i=0;i<s.length();i++){
   if(ch[i]>='0' && ch[i]<='9'){
	   count++;
	
   }
  
                       }
     System.out.println(count);

	}

}
