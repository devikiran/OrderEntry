package com.dto.oe;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;


@Entity
@Table(name = "Customers")
public class Customers {
	@Id
	@Column(name = "CUSTOMER_ID")
	public int CUSTOMER_ID;
	
	@Column(name = "CUST_FIRST_NAME")
	public String CUST_FIRST_NAME;
	
	@Column(name = "CUST_LAST_NAME")
	public String CUST_LAST_NAME;

	@Type(type = "com.dto.oe.CustAddressType")
	@Column(name = "CUST_ADDRESS")
	public Cust_addressData cust_addressData;

	@Column(name = "NLS_LANGUAGE")
	public String NLS_LANGUAGE;

	@Column(name = "NLS_TERRITORY")
	public String NLS_TERRITORY;

	@Column(name = "CREDIT_LIMIT")
	public int CREDIT_LIMIT;

	@Column(name = "CUST_EMAIL")
	public String CUST_EMAIL;

	@Column(name = "ACCOUNT_MGR_ID")
	public int ACCOUNT_MGR_ID;

/*	@Column(name = "CUST_GEO_LOCATION", columnDefinition = "MDSYS.SDO_GEOMETRY", nullable = false)
	@Type(type = "org.hibernate.spatial.GeometryType")
	public Point CUST_GEO_LOCATION;*/

	@Column(name = "DATE_OF_BIRTH")
	public Date DATE_OF_BIRTH;

	@Column(name = "MARITAL_STATUS")
	public char MARITAL_STATUS;

	@Column(name = "INCOME_LEVEL")
	public String INCOME_LEVEL;
	
	/*@Column(name="Phone_numbers")
	public Object Phone_numbers;*/

	public int getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public String getCUST_FIRST_NAME() {
		return CUST_FIRST_NAME;
	}

	public void setCUST_FIRST_NAME(String cUST_FIRST_NAME) {
		CUST_FIRST_NAME = cUST_FIRST_NAME;
	}

	public String getCUST_LAST_NAME() {
		return CUST_LAST_NAME;
	}

	public void setCUST_LAST_NAME(String cUST_LAST_NAME) {
		CUST_LAST_NAME = cUST_LAST_NAME;
	}

	public Cust_addressData getCust_addressData() {
		return cust_addressData;
	}

	public void setCust_addressData(Cust_addressData cust_addressData) {
		this.cust_addressData = cust_addressData;
	}

	public String getNLS_LANGUAGE() {
		return NLS_LANGUAGE;
	}

	public void setNLS_LANGUAGE(String nLS_LANGUAGE) {
		NLS_LANGUAGE = nLS_LANGUAGE;
	}

	public String getNLS_TERRITORY() {
		return NLS_TERRITORY;
	}

	public void setNLS_TERRITORY(String nLS_TERRITORY) {
		NLS_TERRITORY = nLS_TERRITORY;
	}

	public int getCREDIT_LIMIT() {
		return CREDIT_LIMIT;
	}

	public void setCREDIT_LIMIT(int cREDIT_LIMIT) {
		CREDIT_LIMIT = cREDIT_LIMIT;
	}

	public String getCUST_EMAIL() {
		return CUST_EMAIL;
	}

	public void setCUST_EMAIL(String cUST_EMAIL) {
		CUST_EMAIL = cUST_EMAIL;
	}

	public int getACCOUNT_MGR_ID() {
		return ACCOUNT_MGR_ID;
	}

	public void setACCOUNT_MGR_ID(int aCCOUNT_MGR_ID) {
		ACCOUNT_MGR_ID = aCCOUNT_MGR_ID;
	}

/*	public Point getCUST_GEO_LOCATION() {
		return CUST_GEO_LOCATION;
	}

	public void setCUST_GEO_LOCATION(Point cUST_GEO_LOCATION) {
		CUST_GEO_LOCATION = cUST_GEO_LOCATION;
	}*/

	public Date getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}

	public void setDATE_OF_BIRTH(Date dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}

	public char getMARITAL_STATUS() {
		return MARITAL_STATUS;
	}

	public void setMARITAL_STATUS(char mARITAL_STATUS) {
		MARITAL_STATUS = mARITAL_STATUS;
	}

	public String getINCOME_LEVEL() {
		return INCOME_LEVEL;
	}

	public void setINCOME_LEVEL(String iNCOME_LEVEL) {
		INCOME_LEVEL = iNCOME_LEVEL;
	}

/*	public Object getPhone_numbers() {
		return Phone_numbers;
	}

	public void setPhone_numbers(Object phone_numbers) {
		Phone_numbers = phone_numbers;
	}*/

}
