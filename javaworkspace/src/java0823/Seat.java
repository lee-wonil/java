package java0823;

public class Seat {
	private String name;
	private boolean resevation;
	Seat(){
		name="___";
		resevation=false;		
	}
	Seat(String name){
		this.name=name;
		resevation=true;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getResevation() {
		return resevation;
	}
	public void setResevation(boolean resevation) {
		this.resevation=resevation;
	}

}
