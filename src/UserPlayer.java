import java.util.Scanner;

public class UserPlayer extends Player {

	Scanner scan = new Scanner(System.in);
	
	// Instance Variables
	String name;
	int roshamboValue;
	
	@Override
	public int getRoshamboValue() {
		// TODO Auto-generated method stub
		return this.roshamboValue;
	}
	
	public void setRoshamboValue() {
		char weapon = Validator.getChar(scan, "Choose your weapon:\n(R)ock, (P)aper, (S)cissors.");
		switch (weapon) {
		case 'r':
			this.roshamboValue = 0;
			break;
		case 'p':
			this.roshamboValue = 1;
			break;
		case 's':
			this.roshamboValue = 2;
			break;
		
		default:
			this.roshamboValue = 0;
			System.out.println("Invalid Choice. You get sissors.");
			break;
		
		}
		
	}

	@Override
	public String toString() {
		Roshambo[] choices = Roshambo.values();
		String choice = choices[this.getRoshamboValue()].toString();
		return ("You chose " + choice + ".");
	}

}
