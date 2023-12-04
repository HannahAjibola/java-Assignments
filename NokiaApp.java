import java.util.Scanner;
public class NokiaApp{
private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
	mainMenu();
	
	System.out.print("Select an option:");
	int option = scanner.nextInt();
	switch(option) {
		case 1 -> phoneBook();
		case 2 -> message();
		case 3 -> chat();
		case 4 -> callRegister();
		case 5 -> tones(); 
		case 6 -> settings();
		case 7 -> callDivert();
		case 8 -> games();
		case 9 -> calculators();
		case 10 -> reminders();
		case 11 -> clock();
		case 12 -> profiles();
		case 13 -> simServices();
		case 99 -> mainMenu();
		default -> mainMenu();
		}
	}
	public static void mainMenu(){
	System.out.println("""
			    Nokia 3310 Menu:
			1. PhoneBook
			2. Message
			3. Chat
			4. Call Register
			5. Tones
			6. Setting
			7. Call Divert
			8. Games
			9. Calculator
			10. Reminders
			11. Clock
			12. profiles
			13. SIM services
			99. Exit""");	
	}
	
	public static void phoneBook(){

	System.out.println("""
				1. search
				2. service Nos
				3. add Name
				4. erase
				5. edit
				6. Assign tone
				7. Send B'Card
				8. options
				9. Speed Dials
				10. Voice Tags""");

	}

	public static void message(){
	
	System.out.println("""
				1. Write message 
				2. Inbox 
				3. Outbox
				4. Picture message
				5. Templates
				6. Smileys
				7. message Settings  
				8. Info service 
				9. Voice mailbox number 
				10. Service command editor""");
	}

	public static void chat(){

	System.out.println("Back");
	}

	public static void callRegister(){

	System.out.println("""
				1. Missed  Calls
				2. Recieved calls
				3. Dailled numbers
				4. Erase recent call lists
				5. Show Call Duration
				6. Show All Costs
				7. Call Cost Settings
				8. Prepaid credit""");
	}

	public static void tones(){

	System.out.println("""
				1. Ringing tone
				2. Ringing volume
				3. Incoming call alert
				4. Composer
				5. Message alert tone
				6. Keypad tones
				7. Warning and game tones 
				8. Vibrating alert
				9. Screen saver
						""");
	}
	
	public static void settings(){

	System.out.println("""
				1. Call settings 
				2. Phone settings 
				3. Security settings 
				4. Restore factory setting """);
	}

	public static void callDivert(){

	System.out.println("Exit");
	}

	public static void games(){

	System.out.println("Back");
	}

	public static void calculators(){

	System.out.println("Exit");
	}

	public static void reminders(){

	System.out.println("Back");
	}

	public static void clock(){

	System.out.println("""
				1. Alarm clock
				2. Clock setting
				3. Date setting
				4. Stopwatch
				5. Countdown timer
				6. Auto update of Date and Time""");
	}

	public static void profiles(){

	System.out.println("Back");
	}

	public static void simServices(){

	System.out.println("99. Exit");
	}

	public static void options(){

	System.out.println("""
				1. Type of view 
				2. Memory status""");
	}

	public static void messageSettings(){

	System.out.println("1. set 1");
	}

	public static void messageSetting(){

	System.out.print("2. common");
	}
	
	public static void set1(){

	System.out.println("""
				1. Message centre number
				2. Message sent as 
				3. Message validity""");
	}

	public static void common(){

	System.out.print("""
				1. Delivery reports 
				2. Reply via same cantre
				3. Character support """);
	}

	public static void showCallDuration(){

	System.out.println("""
				1. Last call duration
				2. All calls duration
				3. Recieved calls duration 
				4. Dialled calls duration
				5. Clear counters""");
	}
	
	public static void showAllCosts(){

	System.out.print("""
				1. Last call cost
				2. All calls cost
				3. Clear counters""");
	}

	public static void callCostSetting(){

	System.out.println("""
				1. Call cost call
				2. Show costs in""");
	} 

	public static void callSettings(){
	
	System.out.println("""
				1. Automatic redial
				2. Speed dialling
				3. Call waiting options 
				4. Own number sending 
				5. Phone line in use 
				6. Automatic answer""");
	}

	public static void phoneSetting(){

	System.out.println("""
				1. Language
				2. Cell info display
				3. Welcome note
				4. Network selection
				5. Lights
				6. Confirm SIM service actions""");
	}

	public static void search(){

	System.out.println("Back");
	}

	public static void serviceNos(){

	System.out.print("Exit");
	}

	


}
