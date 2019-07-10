import java.util.*;
public class PrintNInSameOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
  String n=sc.next();

char[]ch=n.toCharArray();

for(int i=0;i<n.length();i++){
	System.out.print(ch[i]+" ");
}
	}

}
