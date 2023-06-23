package com.example.entity;


import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;



@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cid;
	@Column
	
	private String cname;
	@Column
	
	private String ccity;
	@Column
	@Digits(message="Number should contain 10 digits.", fraction = 0, integer = 10)
	private long cmobile;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public long getCmobile() {
		return cmobile;
	}
	public void setCmobile(long cmobile) {
		this.cmobile = cmobile;
	}
	public Customer(Integer cid, String cname, String ccity, long cmobile) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccity = ccity;
		this.cmobile = cmobile;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", ccity=" + ccity + ", cmobile=" + cmobile + "]";
	}
}
