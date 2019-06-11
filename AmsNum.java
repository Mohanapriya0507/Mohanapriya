import java.util.*;
public class AmsNum{
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
          int sum=0;
         int n=sc.nextInt();
         int temp=n;
         while(n!=0){
         int rem=n%10;
        sum=sum+(rem*rem*rem);
        n=n/10;
         
    }
    System.out.println(sum);

if(temp==sum){
    System.out.println("it is an Amstrong number");
}
else{
    System.out.println("it is not an Amstrong number");
}
}
}

