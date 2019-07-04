import java.util.*;
public class SwapUsingBitWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
          int m=sc.nextInt();
          int n=sc.nextInt();
          m=m^n;
          n=m^n;
          m=m^n;
          System.out.println(m);
          System.out.println(n);
	}

}
