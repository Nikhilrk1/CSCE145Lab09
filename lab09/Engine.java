//Copyright Nikhil Krishna 2024
/**
 * Class used to describe a consumer or light-commerical grade engine.
 */
public class Engine extends UniquePart{
	/**
	 * Layout
	 * 
	 * + Public enum of common engine layouts.
	 */
	public enum Layout{
		Inline, Flat, V;
	}

	/**
	 * Configuration
	 * 
	 * + Public enum of common engine cylinder configurations.
	 */
	public enum Configuration{
		Twin, Four, Six, Eight;
	}

	/**
	 * Fuel
	 * 
	 * Public enum of common engine fuel types.
	 */
	public enum Fuel{
		Petrol, Diesel, Alternative;
	}
	//attributes
	private double displacement;
	private Engine.Layout layout;
	private Engine.Configuration configuration;
	private Engine.Fuel fuel;
	/**
	 * FULL constructor METHOD (no default required)
	 * 
	 * @param displacement : double 
	 * @param layout : Engine.Layout
	 * @param configuration : Engine.ConfigurationType
	 * @param fuel : Engine.Fuel
	 */
	public Engine (int id, String partNo, double price, String uuid, double displacement, Engine.Layout layout, Engine.Configuration configuration, Engine.Fuel fuel){
		super(id, partNo, price, uuid);
		this.displacement = displacement;
		this.layout = layout;
		this.configuration = configuration;
		this.fuel = fuel;
	}
	/**
	 * toString METHOD
	 * 
	 * Engines have colloquial descriptions that are used by mechanics and the like. Use
	 * their terminology to "name" your engine instances as follows.
	 * 
	 * Displacement is added as a floating point with one decimal place followed by
	 *   the letter "L" for liters.
	 * Layout and configuration are handled as follows:
	 *   - Inline and Flat configuations:
	 *       Inline Twin, Inline Four, Inline Six, Inline Eight
	 *       Flat Twin, Flat Four, Flat Six, Flat Eight
	 *   - V configurations:
	 *       V Twin, Four Cylinder, Six Cylinder, V8
	 * Only add fuel type if not petrol. Do so by adding fuel type in parenthesis at
	 *   the end, e.g. (diesel).
	 */
	//I reused some of the toString from Lab08
	public String toString() {
		String output ="";
		if (this.layout == Layout.Inline || this.layout == Layout.Flat) {
			output = String.format("%.1f", this.displacement) + "L" + " " + this.layout + " " + this.configuration;
			if (this.fuel != Fuel.Petrol ) {
				output += " " + "(" + this.fuel.toString().toLowerCase() + ")";
			}
		}
		else if (this.layout == Layout.V) {
			output = String.format("%.1f", displacement) + "L";
			if (this.configuration == Configuration.Twin || this.configuration == Configuration.Eight) {
				output += " " + "V";
				if (this.configuration == Configuration.Twin) {
					output += " " + this.configuration;
				}
				else if (this.configuration == Configuration.Eight) {
					output += "8";
				}
				if (this.fuel != Fuel.Petrol ) {
					output+= " " + "(" + this.fuel.toString().toLowerCase() + ")";
				}
				return super.toString()+ ", "  + output;
			}
			else if (this.configuration == Configuration.Four || this.configuration == Configuration.Six){
				output += " " + this.configuration + " " + "cylinder";
				if (this.fuel != Fuel.Petrol ) {
					output+= " " + "(" + this.fuel.toString().toLowerCase() + ")";
				}
			}
			return super.toString()+ ", "  + output;

		}
		return super.toString()+ ", " + output;
	}
}
