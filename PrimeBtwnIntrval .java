import java.util.*;
public class PrimeBtwnIntrval {
    public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            int count=0;
            for(int j=i;j>=1;j--){
                if(i%j==0){
                    count++;
                }
            }
             if(count==2){
                    System.out.println(i);
                }
              
                }
            }
        }
    
