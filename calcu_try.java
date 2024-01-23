package ForPract;
import java.util.Scanner;
public class calcu_try {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num1;
		int num2;
		int result;
		
		System.out.print("Enter number (1) :");
		num1 = s.nextInt();
		System.out.print("Enter number (2) :");
		num2 = s.nextInt();
		
		System.out.print("Enter operator 1, Addition. 2, Subtraction. 3, Multiplication :");
		
		char total = s.next().charAt(0);
		
		switch(total) {
		case '1':
			result = num1 + num2;
			System.out.println("Total: " + result);
			break;
		case '2':
			result = num1 - num2;
			System.out.println("Total: " + result);
			break;
		case '3':
			result = num1 * num2;
			System.out.println("Total: " + result);
			break;
			
		default:
				System.out.println("Invalid token");
		}
		
		s.close();

	}

}
