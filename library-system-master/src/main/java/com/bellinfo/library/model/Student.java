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
@Table(name="STUDENT")
public class Student {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="STUDENT_ID")	
private int studentId;

@NotNull
@NotBlank
@Size(min=2, max=20)
@Column(name="STUDENT_USERNAME", nullable=false)
private String studentUsername;

@Column(name="STUDENT_PASSWORD ", nullable=false)
private String studentPassword ;

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentUsername() {
	return studentUsername;
}

public void setStudentUsername(String studentUsername) {
	this.studentUsername = studentUsername;
}

public String getStudentPassword() {
	return studentPassword;
}

public void setStudentPassword(String studentPassword) {
	this.studentPassword = studentPassword;
}

@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentUsername="
			+ studentUsername + ", studentPassword=" + studentPassword + "]";
}



}
