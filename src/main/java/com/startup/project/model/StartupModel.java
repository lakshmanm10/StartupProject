package com.startup.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "STARTUP_FORM")
public class StartupModel {

	@Id	
	@Column(name = "ID")
	private String id;

	@Column(name = "CREATE_AT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdat;

	@Column(name = "MODIFY_AT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedat;

	@Column(name = "APP_DATE")
	private String appdate;

	@Column(name = "APP_TIME")
	private String apptime;	

	@Column(name = "JOB_NATURE")
	private String jobnature;

	@Column(name = "EMP_DETAIL")
	private String empdetails;

	@Column(name = "ENG_NAME1")
	private String engname1;

	@Column(name = "ENG_NAME2")
	private String engname2;
	
	@Column(name = "SEX")
	private String sex;
	
	@Column(name = "NATION")
	private String nation;

	@Column(name = "DOB")
	private String dob;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}

	public Date getModifiedat() {
		return modifiedat;
	}

	public void setModifiedat(Date modifiedat) {
		this.modifiedat = modifiedat;
	}

	public String getAppdate() {
		return appdate;
	}

	public void setAppdate(String appdate) {
		this.appdate = appdate;
	}

	public String getApptime() {
		return apptime;
	}

	public void setApptime(String apptime) {
		this.apptime = apptime;
	}

	public String getJobnature() {
		return jobnature;
	}

	public void setJobnature(String jobnature) {
		this.jobnature = jobnature;
	}

	public String getEmpdetails() {
		return empdetails;
	}

	public void setEmpdetails(String empdetails) {
		this.empdetails = empdetails;
	}

	public String getEngname1() {
		return engname1;
	}

	public void setEngname1(String engname1) {
		this.engname1 = engname1;
	}

	public String getEngname2() {
		return engname2;
	}

	public void setEngname2(String engname2) {
		this.engname2 = engname2;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
