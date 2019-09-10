package java0819;
class Tv1{
	private boolean power;
	private int ch,vol;
	Tv1(){
		ch=1;
		vol=0;
	}
	Tv1(int ch,int vol){
		this.ch=ch;
		this.vol=vol;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	@Override
	public String toString() {
		return "채널 : "+ch+"\t볼륨 : "+vol+"\t현재상태"+power;
	}
}
public class ClassEx03Test {
	public static void main(String[] args) {
		Tv1 t = new Tv1(5,10);
		Tv1 t1 = new Tv1();
		System.out.println(t);
		t1.setCh(50);
		t1.setVol(20);
		t1.setPower(true);
		System.out.println(t1);
	
	}
}
