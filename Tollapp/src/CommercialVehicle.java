
public class CommercialVehicle extends Vehicle {
	String com = null;
	float tax = 0;
	public CommercialVehicle(String regno) {
		super(regno);
		// TODO Auto-generated constructor stub
	}

	
	public float calctax(String type, String highway) {
		
		  if(highway == "national"){
			tax = 150;
		}
		  if(highway == "state"){
			tax = 100;
		}
		  if(highway == "local"){
			tax = 50;
		}
		return tax;
	}
}
