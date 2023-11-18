import java.util.Scanner;

public class LargeAndSmallNumbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter 2nd integer: ");
		int number2 = input.nextInt();

		System.out.print("Enter 3rd integer: ");
		int number3 = input.nextInt();

		System.out.print("Enter 4th integer: ");
		int number4 = input.nextInt();

		System.out.print("Enter 5th integer: ");
		int number5 = input.nextInt();

		int largest;
		int smallest;

		largest = number1;
		if(number2 > largest){
			largest = number2;
		}
		if(number3 > largest){
			largest = number3;
		}
		if(number4 > largest){
			largest = number4;
		}
		if(number5 > largest){
			largest = number5;
		}



		smallest = number1;
		if(number2 < smallest){
			smallest = number2;
		}
		if(number3 < smallest){
			smallest = number3;
		}
		if(number4 < smallest){
			smallest = number4;
		}
		if(number5 < smallest){
			smallest = number5;
		}

		
		System.out.println(largest);
		System.out.println(smallest);
		

	}
}