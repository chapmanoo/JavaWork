
public class Tank extends Vehicle {

	boolean isBattleActive;

	public Tank(String make, String model, int yearMade, boolean hasWheels, boolean isBattleActive) {

		super(make, model, yearMade, false, "Tank");
		this.isBattleActive = isBattleActive;

	}

}