import java.util.Scanner;

public class simplecal {

	public static void main(String[] args) {
		double num1 = 0.0;
		double num2 = 0.0;
		char Operator;
		double answer = 0.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your first number");
		num1 = scan.nextDouble();
		
		System.out.println("Please enter your second number");
		num2 = scan.nextDouble();
		
		System.out.println("Please enter your operator");
		Operator = scan.next().charAt(0);
		
		switch(Operator) {
		case '+' : 
			answer =num1 + num2;
			break;
			
		case '-' :
			answer = num1 - num2;
			break;
			
		case '/' :
			answer = num1 / num2;
			break;
			
		case '*' :
			answer = num1 * num2;
			break;
			
		default:
			System.out.println("Wrong operator");
			
		}
		System.out.println(num1+ " " +Operator+ " " +num2+ " = " +answer);
		  

	}

}
