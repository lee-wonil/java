package java0822;
/*
	main()메소드를 실행하였을때 예시와 같이 출력되도록 TvClass클래스를 작성하세요. 
	콘솔출력예 >> LG에서 만든 2018년형 32인치 TV
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
		System.out.println(company+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
}
public class ClassTest34Ex {
	public static void main(String[] args) {
		TvClass myTV = new TvClass("LG", 2018, 32);
		myTV.show();
	}
}
