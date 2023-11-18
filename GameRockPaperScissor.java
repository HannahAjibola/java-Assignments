import java.util.Scanner;

public class GameRockPaperScissor{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

		System.out.print("Enter a User Name1:");
		String Player1Name = input.nextLine();
		System.out.print("Enter User Name 2:");
		String Player2Name = input.nextLine();

		System.out.print(Player1Name+" enter a number 0,1 or 2:");
		int Player1 = input.nextInt();
		System.out.print(Player2Name +" enter a number 0,1 or 2:");
		int Player2 = input.nextInt();

		if(Player1 == 1 && Player2 == 2){
		System.out.print(Player1Name +" Won " + Player2Name);
			
		}
               
                if(Player1 == 0 && Player2 == 1){
		System.out.print(Player2Name +" Won " + Player1Name);
		}
		if (Player1 == 1 && Player2 == 0){
		System.out.print(Player1Name +" Won " + Player2Name);
		}
		if(Player1 == 2 && Player2 == 1){
		System.out.print(Player1Name + " Won " +Player2Name);
		}
		if(Player1 == 2 && Player2 == 0){
		System.out.print(Player2Name + " Won " +Player1Name);
		}
		if(Player1 == 0 && Player2 == 2){
		System.out.print(Player1Name + " Won " +Player2Name);
		}
	}
}