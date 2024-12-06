//Copyright Nikhil Krishna 2024
/**
 * Class used to describe the tire type used by a street-legal consumer
 * or light-commerical vehicle.
 * 
 * IT MUST EXTEND PartGroup.
 */
public class Tire extends PartGroup{
	/**
	 * Enumeration of common tire types.
	 */
	enum Type{
		P, LT, ST;
	}

	/**
	 * Enumeration of common tire construction types.
	 */
	enum Construction{
		R, D;
	}

	/**
	 * Enumeration of common tire speed ratings.
	 */
	enum SpeedRating{
		M, N, P, Q, R, S, H;
	}
	//Attributes
	private Tire.Type type;
	private int width;
	private int aspectRatio;
	private Tire.Construction construction;
	private int diameter;
	private int loadindex;
	private Tire.SpeedRating speed;
	/**
	 * 
	 * FULL constructor METHOD (no default required)
	 * 
	 * @param id
	 * @param partNo
	 * @param price
	 * @param count
	 * @param type : Tire.Type
	 * @param width : int
	 * @param aspectRatio : int
	 * @param construction : Tire.Construction
	 * @param diameter : int
	 * @param loadIndex : int
	 * @param speed : Tire.SpeedRating
	 */
	public Tire (int id, String partNo, double price, int count, Type type, int width, int aspectRatio, Construction construction, int diameter, int loadindex, SpeedRating speed){
		super (id, partNo, price, count);
		this.type = type;
		this.width = width;
		this.aspectRatio = aspectRatio;
		this.construction = construction;
		this.diameter = diameter;
		this.loadindex = loadindex;
		this.speed = speed;
	}
	/**
	 * toString METHOD
	 * 
	 * See tests for description of string built by this method.
	 */
	public String toString() {
		return super.toString() + ", " + this.type + " " + this.width + "/" + this.aspectRatio + " " + this.construction + " " + this.diameter + " " + this.loadindex + " " + this.speed;
	}
}
