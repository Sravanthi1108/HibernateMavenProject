package com.edubridge.hibernate.model;

import javax.persistence.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Table;

@Entity
@Table(name= "emp200")
public class Employee1 {

@Id
@GeneratedValue
@Column(name="emp_id")
private int id;
@Column(name="firstName",length=20,unique=true)

private String firstName;
@Column(name="lastname",nullable=false)
private String lastName;
@Transient
private double salary;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
