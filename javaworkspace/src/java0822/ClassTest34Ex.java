package java0822;
/*
	main()�޼ҵ带 �����Ͽ����� ���ÿ� ���� ��µǵ��� TvClassŬ������ �ۼ��ϼ���. 
	�ܼ���¿� >> LG���� ���� 2018���� 32��ġ TV
*/
class TvClass{
	private String company;
	private int year;
	private int inch;
	TvClass(String company,int year,int inch){
		this.company=company;
		this.year=year;
		this.inch=inch;				
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public void show() {
		System.out.println(company+"���� ���� "+year+"���� "+inch+"��ġ TV");
	}
}
public class ClassTest34Ex {
	public static void main(String[] args) {
		TvClass myTV = new TvClass("LG", 2018, 32);
		myTV.show();
	}
}
