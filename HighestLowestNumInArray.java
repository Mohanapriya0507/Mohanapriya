import java.util.*;
public class HighestLowestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int[] arr=new int[]{4,9,5,1,7,3,2};
   for(int i=0;i<arr.length;i++){
          Arrays.sort(arr);
   }
   System.out.println(arr[0]);
   System.out.println(arr[arr.length-1]);
	}

}
