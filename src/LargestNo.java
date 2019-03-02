import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc =new Scanner(System.in);
 System.out.println("enter the num");
 int n = sc.nextInt();
 System.out.println("enter the digit");
 int d = sc.nextInt();
 int rem = 0;
 int temp = n;
		 while(temp!=0) {
			 rem = temp%10;
			 if(rem==d) {
				 n--;
				 temp=n;
				 continue;
			 }
			 temp=temp/10;
		 }
		 System.out.println("largest num"+n);
	}

}
