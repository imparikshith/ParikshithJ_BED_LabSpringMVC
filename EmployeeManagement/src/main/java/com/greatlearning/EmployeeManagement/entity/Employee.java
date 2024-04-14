package com.greatlearning.EmployeeManagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Data

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //AUTO_INCREMENT
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;

//	public String getFirstName() {
//		// TODO Auto-generated method stub
//		return this.firstName;
//	}
//
//	public String getLastName() {
//		// TODO Auto-generated method stub
//		return this.lastName;
//	}
//
//	public String getEmail() {
//		// TODO Auto-generated method stub
//		return this.email;
//	}
//
//	public void setFirstName(String firstName2) {
//		// TODO Auto-generated method stub
//		this.firstName=firstName2;
//	}
//
//	public void setLastName(String lastName2) {
//		// TODO Auto-generated method stub
//		this.lastName=lastName2;
//	}
//
//	public void setEmail(String email2) {
//		// TODO Auto-generated method stub
//		this.email=email2;
//	}
	
}
