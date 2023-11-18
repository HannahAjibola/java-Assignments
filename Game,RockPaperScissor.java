import java.util.scanner;

public class GameRockPaperScissor{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter a User Name1:");
		String PlayerName = input.nextLine();
		System.out.println("Enter User Name 2:");
		String PlayerName2 = input.nextLine();

		System.out.print(PlayerName+"enter a number 0,1 or 2");
		int Player1 = input.nextInt();
		System.out.print(PlayerName2+"enter a number 0,1 or 2");
		int Player2 = input.nextLine();
	}
}