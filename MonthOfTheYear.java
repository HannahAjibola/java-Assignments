import java.util.Scanner;

public class MonthOfTheYear{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number from 1 - 12: ");
		int month = input.nextInt();

		if(month == 1){
			System.out.println("Month is January");
		}
		if(month == 2){
			System.out.println("Month is February");
		}
		if(month == 3){
			System.out.println("Month is March");
		}
		if(month == 4){
			System.out.println("Month is April");
		}
		if(month == 5){
			System.out.println("Month is May");
		}
		if(month == 6){
			System.out.println("Month is June");
		}
		if(month == 7){
			System.out.println("Month is July");
		}
		if(month == 8){
			System.out.println("Month is August");
		}
		if(month == 9){
			System.out.println("Month is September");
		}
		if(month == 10){
			System.out.println("Month is October");
		}
		if(month == 11){
			System.out.println("Month is November");
		}
		if(month == 12){
			System.out.println("Month is December");
		}

		
	}
}