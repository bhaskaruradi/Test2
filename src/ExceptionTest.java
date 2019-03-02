import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the name");
     String name = sc.next();
     System.out.println("enter contact no");
     long mobile = sc.nextLong();
     System.out.println("enter age");
     int age =sc.nextInt();
     if(age<20 || age>55)
     
    	try {
    		
			throw new AgeNotSufficient();
		} 
    	catch (AgeNotSufficient e)
    	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
     
     
	}
	

}
