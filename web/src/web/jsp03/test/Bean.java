package web.jsp03.test;

public class Bean implements java.io.Serializable{

	//변수
	private String id;
	private String pw;
	// 기본생성자
	public Bean(){

	}
	//setter
	public void setId(String id) {
		this.id=id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	//getter

	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
}
