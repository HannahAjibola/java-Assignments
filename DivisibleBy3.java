import java.util.Scanner;

	public class DivisibleBy3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("input a number: ");
		int number = input.nextInt();

		if(number % 3 == 0){
		System.out.print("number is divided by 3");
		}else{
		System.out.print("number is not divided by 3");
		}
	
	}
}



 