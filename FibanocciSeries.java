import java.util.*;
public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
    
       int a = 0,b=1;
       System.out.println(a);
       System.out.println(b);
       int sum;
       for(int i=2;i<n;i++){
      
    	  sum=a+b;
    	  
          System.out.println(sum);
    	  a=b;
    	  b=sum;
    	
	}
       
 
	}
}
