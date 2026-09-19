import java.util.Scanner;
	public class Nokia5510MenuMap{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);

String menuFunctions = """ 


Welcome to the Nokia 5510 phone

To access any of the menu functions: 

Press 

1. For Phonebook
2. For Messages
3. For Chat
4. For Call register
5. For Tones
6. For Settings
7. For Call divert
8. For Music
9. For Games
10. For Calculator
11. For Reminders
12. For Clock
13. For Profiles
14. For Services
15. For SIM Services 


 """;



System.out.println(menuFunctions);
int menuChoice = input.nextInt();

		
	switch(menuChoice){
	case 1 -> {

String phonebookMenu = """

Press

1. To Search
2. For Service Nos.
3. To Add name
4. To Erase
5. To Edit
6. To Copy
7. To Assign Tone
8. To Send b'card
9. To see Options
10. For Speed dials
11. For Voice tags 


""";


		System.out.println(phonebookMenu);
		int functionsUnderPhonebookMenu = input.nextInt();

			switch(functionsUnderPhonebookMenu){
			case 9 -> {
		String optionsMenu = """

Press

1. For Memory in use
2. For Type of view
3. For Memory status  

""";

		System.out.println(optionsMenu);

		}
	}
}





	case 2 -> {
String messageMenu = """

Press 

1. To write messages
2. To go to inbox
3. To go to outbox
4. To go to picture messages
5. To go to templates
6. To go to Smileys
7. To go to Message settings
8. To go to Info service
9. For Voice mailbox number
10. For Serve command editor

""";

		System.out.println(messageMenu);
		int functionsUnderMessageMenu = input.nextInt();

			switch(functionsUnderMessageMenu){
			case 7 -> {
String messageSettingsMenu = """

Press

1. For Set 1
2. For Common

""";

		System.out.println(messageSettingsMenu);
		int optionsUnderMessageSettingsMenu = input.nextInt();

			switch(optionsUnderMessageSettingsMenu){
			case 1 -> {
String optionsUnderSet1 = """

Press

1. For Message centre number
2. For Messages sent as
3. For Message validity

""";

		System.out.println(optionsUnderSet1);
}

			case 2 -> {
String optionsUnderCommon = """

Press
 
1. For Delivery reports
2. For Reply via same centre
3. For Character support

""";

		System.out.println(optionsUnderCommon);

}
			}
		}
	}

}


	case 3 -> {System.out.println("Welcome to Chat");}


	case 4 -> {
String callRegisterMenu = """

Press

1. For Missed calls
2. For Received calls
3. For Dialled numbers
4. To Erase recent call lists
5. To show call duration
6. To show call costs
7. To go to Call cost settings
8. For prepaid credit

""";

		System.out.println(callRegisterMenu);
		int functionsUnderCallRegisterMenu = input.nextInt();

			switch(functionsUnderCallRegisterMenu){
			case 5 -> {
String optionsUnderCallDuration = """

Press
1. For Last call duration
2. For All calls' duration
3. For Received calls' duration
4. For Dialled calls' duration
5. To clear timers

""";

		System.out.println(optionsUnderCallDuration);		
}

			case 6 -> {
String optionsUnderCallCosts = """

Press
1. For Last call cost
2. For All calls' cost
3. To clear counters

""";

		System.out.println(optionsUnderCallCosts);		

}

			case 7 -> {
String optionsUnderCallCostSettings = """

Press
1. For Call cost limit
2. To show costs in

""";

		System.out.println(optionsUnderCallCostSettings);		

}	
	}


}
	case 5 -> {
String tonesMenu = """

Press

1. For Ringing tone
2. For Ringing volume
3. For Incoming call alert
4. For message alert tone
5. For Keypad tones
6. For Warning tones
7. For Vibrating alert
8. For Screen saver

""";

		System.out.println(tonesMenu);	

}
	case 6 -> {
String settingsMenu = """

Press

1. To go to Call settings
2. To go to Phone settings
3. To go to Security settings
4. To go to Restore factory settings

""";

		System.out.println(settingsMenu);	
		int functionsUnderSettingsMenu = input.nextInt();

			switch(functionsUnderSettingsMenu){
			case 1 -> {
String optionsUnderCallSettings = """

Press

1. For automatic redial
2. For Speed dialling
3. For Call waiting options
4. For Own number sending
5. For Phone line in use
6. For Automatic answer

""";

		System.out.println(optionsUnderCallSettings);	

}

			case 2 -> {
String optionsUnderPhoneSettings = """

Press

1. For Language
2. For Cell info display
3. For Welcome note
4. For Network selection
5. To Confirm SIM service actions

""";

		System.out.println(optionsUnderPhoneSettings);	

}

			case 3 -> {
String optionsUnderSecuritySettings = """

Press

1. For PIN code request
2. For Call barring service
3. For Fixed dialling
4. For Closed user group
5. For Security level
6. To Change access codes

""";

		System.out.println(optionsUnderSecuritySettings);	

}

	}

}
	case 7 -> {System.out.println("Welcome to Call divert");}
	case 8 -> {
String musicMenu = """

Press

1. To go to Music player
2. To go to Radio
3. To go to Recorder
4. To go to Track list

""";

		System.out.println(musicMenu);	

}
	case 9 -> {System.out.println("Welcome to Games");}
	case 10 -> {System.out.println("Welcome to Calculator");}
	case 11 -> {System.out.println("Welcome to Reminders");}
	case 12 -> {
String clockMenu = """

Press

1. For Alarm clock
2. For Clock settings
3. For Date setting
4. For Stopwatch
5. For Countdown timer
6. For Auto update of date and time

""";

		System.out.println(clockMenu);	

}
	case 13 -> {System.out.println("Welcome to Profiles");}
	case 14 -> {System.out.println("Welcome to Services");}
	case 15 -> {System.out.println("Welcome to SIM Services");}






		}
	}
}