package com.xworkz.entity.save;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user")
public class SaveEntity {

	// ID, USER_NAME, EMAIL, CONTACT_NUMBER
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "ID")
	private int id;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "CONTACT_NUMBER")
	private String cNumber;

	public SaveEntity() {
		System.out.println("created : " + this.getClass().getSimpleName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
