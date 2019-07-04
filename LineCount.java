import java.util.*;
public class LineCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char[] ch=s.toCharArray();
            int count=0;
            for(int i=0;i<s.length();i++){
            	if(ch[i]=='.'){
            		count++;
            	}
            	
          
            }
            System.out.println(count);

	}

}
