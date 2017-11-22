
public class PrivateVehicle extends Vehicle {
	String priv = null;
	public float tax = 0;
	public PrivateVehicle(String regno) {
		super(regno);
		System.out.println("Inside private vehicle constructor");
	}

	
	public float calctax(String type, String highway) {
			if(highway == "national"){
				tax = 90;
			}
			if(highway == "state"){
				tax = 60;
			}
			if(highway == "local"){
				tax = 30;
			}
			return tax;
		}

}