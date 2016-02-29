package com.oe.dto;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class Orders {

	@Id
	public int ORDER_ID;
	@Column
	public Timestamp ORDER_DATE;
	public String ORDER_MODE;
	public int CUSTOMER_ID;
	public int ORDER_STATUS;
	public int ORDER_TOTAL;
	@Column(nullable = true)
	public Integer SALES_REP_ID;
	@Column(nullable = true)
	public Integer PROMOTION_ID;

	public int getORDER_ID() {
		return ORDER_ID;
	}

	public void setORDER_ID(int oRDER_ID) {
		ORDER_ID = oRDER_ID;
	}

	public Date getORDER_DATE() {
		return ORDER_DATE;
	}

	public void setORDER_DATE(Timestamp oRDER_DATE) {

		ORDER_DATE = oRDER_DATE;
	}

	public String getORDER_MODE() {
		return ORDER_MODE;
	}

	public void setORDER_MODE(String oRDER_MODE) {
		ORDER_MODE = oRDER_MODE;
	}

	public int getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public int getORDER_STATUS() {
		return ORDER_STATUS;
	}

	public void setORDER_STATUS(int oRDER_STATUS) {
		ORDER_STATUS = oRDER_STATUS;
	}

	public int getORDER_TOTAL() {
		return ORDER_TOTAL;
	}

	public void setORDER_TOTAL(int oRDER_TOTAL) {
		ORDER_TOTAL = oRDER_TOTAL;
	}

	public int getSALES_REP_ID() {
		return SALES_REP_ID;
	}

	public void setSALES_REP_ID(int sALES_REP_ID) {
		SALES_REP_ID = sALES_REP_ID;
	}

	public Integer getPROMOTION_ID() {
		return PROMOTION_ID;
	}

	public void setPROMOTION_ID(Integer pROMOTION_ID) {
		PROMOTION_ID = pROMOTION_ID;
	}
}
