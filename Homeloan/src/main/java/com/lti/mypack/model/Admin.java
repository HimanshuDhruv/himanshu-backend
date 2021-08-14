package com.lti.mypack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="bankadmin")
public class Admin {
	
	@Id
//	@GenericGenerator(name = "sequence", strategy = "sequence", parameters = {
//            @org.hibernate.annotations.Parameter(name = "sequenceName", value = "sequence"),
//            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"),
//    })
//    @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
	private String ifsccode;
	private String adminname;
	private String adminpassword;
	private int applicationid;
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpassword() {
		return adminpassword;
	}
	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
	public int getApplicationid() {
		return applicationid;
	}
	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String ifsccode, String adminname, String adminpassword, int applicationid) {
		super();
		this.ifsccode = ifsccode;
		this.adminname = adminname;
		this.adminpassword = adminpassword;
		this.applicationid = applicationid;
	}
	@Override
	public String toString() {
		return "Admin [ifsccode=" + ifsccode + ", adminname=" + adminname + ", adminpassword=" + adminpassword
				+ ", applicationid=" + applicationid + "]";
	}
	
	
	
	

}