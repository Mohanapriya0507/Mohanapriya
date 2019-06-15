import java.util.*;
public class HourM{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        //int h=sc.nextInt();
       // int m=sc.nextInt();
        int [] arr=new int[2];
        int [] arr1=new int[2];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
     int total=Math.abs(arr[0]-arr1[0]);
       // System.out.println(total);
        int hr=total/60;
        int min=total%60;
        
        System.out.println(min+" "+hr);
    }
}
