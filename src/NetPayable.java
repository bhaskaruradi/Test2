import java.util.Scanner;

public class NetPayable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  double salary = sc.nextDouble();
    salary = salary+((0.5)*salary)+((0.25)*salary)-((0.12)*salary);
    System.out.println("net payable salary"+salary);
	}

}
