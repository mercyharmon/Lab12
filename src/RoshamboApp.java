import java.util.Random;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Variables
		UserPlayer player1 = new UserPlayer();
		int userChoice;
		int compChoice;
		char userCont = 'y';

		System.out.println("Thank you for playing Rock, Paper, Scissors");
		System.out.println();

		while (userCont == 'y') {
			Random random = new Random();
			int compPlayer = random.nextInt(8);
			if (compPlayer == 4) {
				RockPlayer rocky = new RockPlayer();
				System.out.println();
				System.out.println("Your opponient is Ronald. Do your best");
				System.out.println();
				player1.setRoshamboValue();
				userChoice = player1.getRoshamboValue();
				System.out.println(rocky.toString());
				System.out.println(player1.toString());
				System.out.println();
				System.out.println(theDecider(userChoice, 0));

			} else {
				RandomPlayer computer = new RandomPlayer();
				computer.giveName();
				System.out.println("Your opponent  is " + computer.getName() + " Good Luck!");
				System.out.println();
				player1.setRoshamboValue();
				userChoice = player1.getRoshamboValue();
				computer.setRoshamboValue();
				compChoice = computer.getRoshamboValue();
				System.out.println(computer.toString());
				System.out.println(player1.toString());
				System.out.println();

				System.out.println(theDecider(userChoice, compChoice));
			}

			userCont = Validator.getChar(scan, "Would you like to continue? (y/n)");

		}
		System.out.println();
		System.out.println("Thank you for playing!");
		scan.close();
	}

	public static String theDecider(int player, int computer) {

		String returnText = "Sorry";
		if (player == computer) {
			returnText = "Tie. Try again.";
		}
		switch (player) {
		case 0:
			if (computer == 1) {
				returnText = "Paper covers Rock. You lose.";
			}
			if (computer == 2) {
				returnText = "Rock crushes Scissors, You win.";
			}
			if (computer == 3) {
				returnText = "Scissors cuts Paper. You win.";
			}
			if (computer == 4) {
				returnText = "Paper covers Rock. You lose.";
			}
			break;
		case 1:
			if (computer == 0) {
				returnText = "Scissors cuts Paper. You win.";
			}
			if (computer == 2) {
				returnText = "Rock crushes Scissors, You loose.";
			}
			if (computer == 3) {
				returnText = "Paper covers Rock. You win.";
			}
			if (computer == 4) {
				returnText = "Rock crushes Scissors, You loose.";
			}
			break;
		case 2:
			if (computer == 0) {
				returnText = "Rock crushes Scissors. You win.";
			}
			if (computer == 1) {
				returnText = "Scissors cut Paper. You win.";
			}
			if (computer == 3) {
				returnText = "Rock crushes Scissors, You loose.";
			}
			if (computer == 4) {
				returnText = "Paper covers Rock. You lose.";
			}
			break;
		case 3:
			if (computer == 0) {
				returnText = "Scissors cut Paper. You lose.";
			}
			if (computer == 1) {
				returnText = "Paper covers Rock You win.";
			}
			if (computer == 2) {
				returnText = "Rock crushes Scissors, You win.";
			}
			if (computer == 4) {
				returnText = "Scissors cut Paper. You win.";
			}
			break;
	
		default:
			break;
		}

		return returnText;
	}

}