package com.insotech.springbootdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient_Tbl")
public class Patient {
	
	@Id
	@GeneratedValue
	@Column
	private int pid;
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String gender;
	@Column
	private String phone;
	@Column
	private String dob;
	@Column
	private String mstatus;
	@Column
	private String presentAddr;
	@Column
	private String comAddr;
	@Column
	private String medHistory;
	@Column
	private String otherDetails;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMstatus() {
		return mstatus;
	}
	public void setMstatus(String mstatus) {
		this.mstatus = mstatus;
	}
	public String getPresentAddr() {
		return presentAddr;
	}
	public void setPresentAddr(String presentAddr) {
		this.presentAddr = presentAddr;
	}
	public String getComAddr() {
		return comAddr;
	}
	public void setComAddr(String comAddr) {
		this.comAddr = comAddr;
	}
	public String getMedHistory() {
		return medHistory;
	}
	public void setMedHistory(String medHistory) {
		this.medHistory = medHistory;
	}
	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
	
	
	

}
