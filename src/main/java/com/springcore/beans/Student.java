package com.springcore.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="std")
public class Student {
	@Id
	@Column(name="stdId")
private int stdId;
	@Column(name="stdName")
private String stdName;
	@Column(name="stdCity")
private String stdCity;
	
	
	public Student(int stdId, String stdName, String stdCity) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdCity = stdCity;
	}
	
	
	public Student() {

	}


	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdCity() {
		return stdCity;
	}
	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}


	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdCity=" + stdCity + "]";
	}


}
