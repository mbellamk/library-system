package com.bellinfo.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="ADMIN")
public class Admin {
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ADMIN_ID")
	private int adminId;
	
	@NotNull
	@NotBlank
	@Size(min=2, max=20)
	@Column(name="ADMIN_USERNAME", nullable=false)
	private String adminUsername;
	
	@NotNull
	@NotBlank
	@Size(min=2, max=20)
	@Column(name="ADMIN_PASSWORD", nullable=false)
	private String adminPassword ;

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminUsername=" + adminUsername
				+ ", adminPassword=" + adminPassword + "]";
	}
	

}