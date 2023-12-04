import java.util.Scanner;
	public class HeadOrTail{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int coin = (int)(Math.random() * 2);

	System.out.print("Enter 0 for head or 1 for tail: ");
	int guess  = input.nextInt();

	if(guess == coin){
	System.out.print("Correct guess");	
	}else 	
	System.out.print("InCorrect guess");
	
	}
}