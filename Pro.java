import java.util.*;
public class Pro{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int product=m*n;
		if(product%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}

}
