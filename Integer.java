import java.util.Scanner;

public class Integer{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first integer:");
	int number1 = input.nextInt();

	
	System.out.print("Enter second integer:");
	int number2 = input.nextInt();

	
	System.out.print("Enter third integer:");
	int number3 = input.nextInt();
	
	
	if(number1 < number2 && number1 < number3 && number2 < number3) 
		System.out.printf("%d %d %d", number1, number2, number3);
	
	if(number1 < number2 && number1 < number3 && number3 < number2) 
		System.out.printf("%d %d %d", number1, number3, number2);
			
	if(number2 < number1 && number2 < number3 && number1 < number3) 
		System.out.printf("%d %d %d", number1, number2, number3);

	if(number2 < number2 && number1 < number3 && number2 < number3) 
		System.out.printf("%d %d %d", number1, number2, number3);


	}
}