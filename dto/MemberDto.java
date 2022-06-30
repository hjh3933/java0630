package org.project.product.dto;

public class MemberDto {
	private int memberno;
	private String userName;
	private String userPhone;
	private String addr;
	private String inDay;
	private String grade;
	private String city;

	public MemberDto(int memberno, String userName, String userPhone, String addr, String inDay, String grade,
			String city) {
		super();
		this.memberno = memberno;
		this.userName = userName;
		this.userPhone = userPhone;
		this.addr = addr;
		this.inDay = inDay;
		this.grade = grade;
		this.city = city;
	}

	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getInDay() {
		return inDay;
	}

	public void setInDay(String inDay) {
		this.inDay = inDay;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
