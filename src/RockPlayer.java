public class RockPlayer extends Player {

	// Instance variables
	final int roshamboValue = 0; // Overrides Player
	final String name = "Ronald";

	@Override
	public int getRoshamboValue() {
		return this.roshamboValue;
	}

	@Override
	public String toString() {

		return "Ronald chooses rock.";
	}

}