//Copyright Nikhil Krishna 2024
import java.util.ArrayList;

/**
 * Class representing a vehicle. It consists of vehicle-specific
 * attributes as well as a list of parts. You MUST store that data
 * as a Part instance - consider using an ArrayList.
 */
public class Vehicle{
	private ArrayList<Part> Part;
	protected String make;
	protected String model;
	protected int doors;

	/**
	 * FULL constructor METHOD (no defaults needed)
	 * 
	 * @param make : String
	 * @param model : String
	 * @param doors : int
	 */
	public Vehicle (String make, String model, int doors) {
		this.make = make;
		this.model = model;
		this.doors = doors;
		Part = new ArrayList<>();

	}

	/**
	 * Mutator method addPart
	 * 
	 * Adds a new part to the list of parts making up a vehicle.
	 * 
	 * @param addMe
	 * @return 
	 */
	public void addPart (Part part) {
		Part.add(part);
	}
	/**
	 * toString METHOD
	 * 
	 * When doors > 0, begin string with #-door where # is the number of doors, follow
	 *   with the string "Part List:" and a list of each part of stored by the vehicle,
	 *   delimited by newline characters (\n).
	 *   
	 * See tests for more thorough description of return string.
	 */
	public String toString() {
		String output = this.doors + "-door " + this.make + " " + this.model + "\nPart List:\n ";
		for (int i = 0; i < Part.size(); ++i) {
			output +=Part.get(i).toString();
			//adds newline if necessary
			if (i < Part.size() - 1) {
				output += "\n ";
			}
		}
		return output;
	}
}
