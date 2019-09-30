package web.jsp03.test;

public class MemberDTO {

	private String id;
	private String pw;
	private String name;
	private String email;
	private String gender;
	private String job;
	private String introduce;
	private String hobby[];
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {

		this.id=id.replaceAll(" ", "");
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw.replaceAll(" ", "");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.replaceAll(" ", "");
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email.replaceAll(" ", "");
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public boolean cheaknull() {
		if(id==null||id.equals(""))
			return false;
		if(pw==null||pw.equals(""))
			return false;
		if(name==null||name.equals(""))
			return false;
		if(email==null||email.equals(""))
			return false;
		return true;
	}
}
