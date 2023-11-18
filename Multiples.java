import java.util.Scanner;

public class Multiples{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number1: ");	
		int number1 = input.nextInt();

		System.out.println("Enter number2: ");
		int number2 = input.nextInt();

		int numberTripple = number1 * 3;
		int numberDouble = number2 * 2;

 		if (numberTripple == numberDouble){
			System.out.print("it is Tripple");
		}else if numberDouble == numberTripple){
			System.out.print("it is Double");
		}
	}
}