package com.jakala.model;


import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import com.jakala.dao.ContractRespository;


@Entity
@Generated(value = { "" })

public class Contract {
	@Id
	
	private int customerid;

	private String customername;
	
	private String dateofscontract;
	private String typeofuser;
	
	private String typeofcontarct;

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getDateofscontract() {
		return dateofscontract;
	}

	public void setDateofscontract(String dateofscontract) {
		this.dateofscontract = dateofscontract;
	}

	public String getTypeofuser() {
		return typeofuser;
	}

	public void setTypeofuser(String typeofuser) {
		this.typeofuser = typeofuser;
	}

	public String getTypeofcontarct() {
		return typeofcontarct;
	}

	public void setTypeofcontarct(String typeofcontarct) {
		this.typeofcontarct = typeofcontarct;
	}

	@Override
	public String toString() {
		return "Alien [customerid=" + customerid + ", customername=" + customername + ", dateofscontract="
				+ dateofscontract + ", typeofuser=" + typeofuser + ", typeofcontarct=" + typeofcontarct + "]";
	}
	
	

}
