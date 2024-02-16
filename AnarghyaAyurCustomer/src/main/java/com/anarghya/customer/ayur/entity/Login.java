package com.anarghya.customer.ayur.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Login")
public class Login {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long loginId;
	private String emailId;
	private String password;
	private String otp;
	private String field;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}	
}
