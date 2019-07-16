import java.util.*;
public class SumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0,sum1=0;
while(a>0)
{
	sum=a%10;
	sum1=sum1+sum;
	a=a/10;
}
System.out.println(sum1);
	}
}
