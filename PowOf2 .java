import java.util.*;
public class PowOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0){
while(n%2==0){
n=n/2;	
}
if(n==1){
	System.out.println("yes");
} else if(n==0 || n!=1){
	System.out.println("no");
}

	}

}
}
