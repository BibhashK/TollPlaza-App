import java.util.Scanner;


public class TollData  {
	public int Totalprivatecount= 0,totalcommercialcount=0;
	public   float totalcommercialtax=0,totalprivatetax = 0;
	public  static float pv_tax,cv_tax;
	
public static void main(String[] args){ //throws IOException {
		// TODO Auto-generated method stub
		Scanner br = new Scanner(System.in);
		System.out.println("Enter the type of vehicle: ");
		String type = br.nextLine();                            //try to take all the values from user
		System.out.println("given type is:" +type);
		System.out.println("Enter the highway type of vehicle: ");
		String highway = br.nextLine();
		System.out.println("Enter the regno of the vehicle: ");
		String regno = br.nextLine();
		PrivateVehicle pv = new PrivateVehicle("TS09AB1111"); 
		CommercialVehicle cv = new CommercialVehicle("TS09UA1111"); //TS09UA1111 take from user store in regno
		if (type.equalsIgnoreCase("private"))//execute this loop next 2 lines
			//PrivateVehicle pv = new PrivateVehicle("TS09AB1111");
			pv_tax = pv.calctax("priv", "national");	
			
		if (type.equalsIgnoreCase("commercial")) //is commercial execute next 2 lines
			//CommercialVehicle cv = new CommercialVehicle("TS09UA1111"); //TS09UA1111
			cv_tax=cv.calctax("com", "local");
	
		
		TollData td = new TollData();
		td.makeentry(pv, "private", "national");
		System.out.println("Total private count is :" +td.gettotalprivatecount());
		System.out.println("Total commercial count is :" +td.gettotalcommercialcount());
		System.out.println("Total private tax is: "+td.getTotalPrivatetax());
		System.out.println("Total commercial tax is: "+td.getTotalCommercialtax());
	}
	 public void makeentry(Vehicle v, String type, String highway){
		 System.out.println("Entry made:" +type +"and" +highway);
	 }
	 public int gettotalprivatecount() 
	 {
		  Totalprivatecount = Totalprivatecount + 1;
		  return Totalprivatecount;
		 
	 }
	 public int gettotalcommercialcount()
	 {
		 totalcommercialcount = totalcommercialcount + 1;
		 return totalcommercialcount;
	 }
	 public float getTotalPrivatetax()
	 {
		 totalprivatetax = totalprivatetax + pv_tax;
		 return totalprivatetax;
	 }
	 public float getTotalCommercialtax()
	 {
		 totalcommercialtax = totalcommercialtax + cv_tax; 
		 return totalcommercialtax;
	 }
}
