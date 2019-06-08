import java.util.*;
public class PalindromNum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int temp=n;
        while(n>0){
            int r=n%10;
         sum=(sum*10)+r;
            n=n/10;
        }
        System.out.println(sum);
        if(temp==sum){
            System.out.println("it is a palindrom");
        }
        else{
            System.out.println("it is not a  palindrome");
    }
    }
}
