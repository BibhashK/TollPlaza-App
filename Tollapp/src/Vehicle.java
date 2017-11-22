public abstract class Vehicle {
	public String regno;
	public Vehicle(String regno)
	{
		System.out.println("Inside Vehicle constructor");
		System.out.println("Regno of the vehicle is:" +regno);
	}
	public abstract float calctax(String type, String highway);
}
	


