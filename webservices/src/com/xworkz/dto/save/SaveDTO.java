package com.xworkz.dto.save;

public class SaveDTO {

	private String userName;
	private String email;
	private String cNumber;

	public SaveDTO() {
		System.out.println("created : " + this.getClass().getSimpleName());
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getcNumber() {
		return cNumber;
	}

	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}

}
