import java.util.*;
public class MaxiAmng10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] arr=new int[n];
for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
	Arrays.sort(arr);
}
System.out.println(arr[n-1]);
	}

}
