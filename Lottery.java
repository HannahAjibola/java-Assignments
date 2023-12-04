import java.util.Scanner;
public class Lottery{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int lottery = (int)(Math.random() * 1000 );

	System.out.print("Enter a number: ");
	int guess = input.nextInt();

	int lotteryDigit1 = lottery / 100;
	int remainingDigit = lottery % 100;
	int lotteryDigit2 = remainingDigit2 / 10;
	int lotteryDigit3 = remainingDigit3 % 10;

	int guessDigit1 = guess / 100;
	int remainingDigit1 = guess % 100;
	int guessDigit2 = remainingDigit2 / 10;
	int guessDigit3 = remainingDigit3 % 10;

	System.out.print("The lottery number is " + lottery);

	if (guess == lottery)
	System.out.print("Enter match: you win $10,000");

	if (guessDigit1 == lotteryDigit2);
	
	}
}