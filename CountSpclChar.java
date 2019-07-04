import java.util.*;
public class CountSpclChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		int count1=0;
		int count2=0;
		char[]ch=s.toCharArray();
		     for(int i=0;i<s.length();i++){
		   if(ch[i]>='0' && ch[i]<='9'){
			   count++;
		   }
			   else if(ch[i]>='a'&& ch[i]<='z' || ch[i]>='A'&& ch[i]<='Z'){
				   count1++;
				   
			   } else{
				   count2++;
			   }
		   
		  
		                       }
		     System.out.println(count2);

			}

		}

	


