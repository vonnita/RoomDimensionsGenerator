import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		String userInput;
	//	String userChoice = "yes";
	//	String latte;
	//	String espresso;
	//	String no;
		
		Scanner Scan1 = new Scanner(System.in);
		
		System.out.println("Welcome! What is your name? (enter your name):");
		name = Scan1.nextLine();

		System.out.println("Would like to go to the Grand Circus Coffee Shop? (enter \"yes\" or \"no\"):");
		userInput = Scan1.nextLine();
//		if (userInput.equals("yes")) {
	boolean play = true;
		while(play){		
			
			switch (userInput) {
			case "yes":
				System.out.println("What would you like to order a latte or espresso?");
				userInput = Scan1.nextLine();	
				if(userInput.equals("latte")){
					System.out.println("youve entered latte");	
					userInput = "latte";
					}
				if(userInput.equals("espresso")){
					System.out.println("you've entered espresso");	
					userInput = "espresso";
					}
						
				break;
				
			case "latte":
				System.out.println("That will be $4");
				play = false;
				break;
				
			case "espresso":
			System.out.println("That will be $3");
			play = false;
             break;
             
			default :
				System.out.println("Goodbye!");
				break;
			}
			
	}
			
			
		//	userChoice = Scan1.nextLine();
/*
			if (userChoice.equals("latte")) {
				System.out.println("That will cost $4");
			}

			else if (userChoice.equals("espresso")) {
				System.out.println("That will cost $3");
			}

		} else if (userInput.equals("no"))
			System.out.println("Goodbye");
		{
	*/		

		}

	}


