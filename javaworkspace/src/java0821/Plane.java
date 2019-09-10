package java0821;

public class Plane {
	private String company;
	private String model;
	private int maxPassenger;
	private static int planes=0;
	Plane(){
		this("", "", 0);	
	}
	Plane(int maxPassenger){
		this("","",maxPassenger);	
	}
	Plane(String model){
		this("",model,0);		
	}
	Plane(String company,String model){
		this(company,model,0);	
	}
	Plane(String company, String model,int maxPassenger){
		this.company=company;
		this.model=model;
		this.maxPassenger=maxPassenger;
		planes++;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxPassenger() {
		return maxPassenger;
	}
	public void setMaxPassenger(int maxPassenger) {
		this.maxPassenger = maxPassenger;
	}
	@Override
	public String toString() {
		return "Á¦Á¶»ç: "+company+" ¸ðµ¨: "+model+" ÃÖ´ë ½Â°´¼ö: "+maxPassenger;
	}
	public static int getPlanes() {
		return planes;
	}
}
