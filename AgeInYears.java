import java.util.Scanner;

public class AgeInYears{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter Your Age:");
		int age = input.nextInt();

		int ageInDays = age * 365;
		System.out.print(ageInDays);

	}
}