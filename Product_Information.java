package com.dto.oe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.TypeDef;
import org.joda.time.Interval;

@Entity
@Table(name = "Product_Information")
@TypeDef(name = "interval", typeClass = Interval.class)
public class Product_Information {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "PRODUCT_ID")
	public Integer PRODUCT_ID;

	@Column(name = "PRODUCT_NAME")
	public String PRODUCT_NAME;

	@Column(name = "PRODUCT_DESCRIPTION")
	public String PRODUCT_DESCRIPTION;

	@Column(name = "CATEGORY_ID")
	public Integer CATEGORY_ID;

	@Column(name = "WEIGHT_CLASS")
	public Integer WEIGHT_CLASS;

	/*
	 * @Column(name = "WARRANTY_PERIOD", nullable = false) //@Type(type =
	 * "org.jadira.usertype.dateandtime.joda.PersistentInterval")
	 * 
	 * @Type(type = "interval") public Interval WARRANTY_PERIOD;
	 */

	@Column(name = "SUPPLIER_ID")
	public Integer SUPPLIER_ID;

	@Column(name = "PRODUCT_STATUS")
	public String PRODUCT_STATUS;

	@Column(name = "LIST_PRICE")
	public Integer LIST_PRICE;

	@Column(name = "MIN_PRICE")
	public Integer MIN_PRICE;

	@Column(name = "CATALOG_URL")
	public String CATALOG_URL;

	public Integer getPRODUCT_ID() {
		return PRODUCT_ID;
	}

	public void setPRODUCT_ID(Integer pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}

	public String getPRODUCT_NAME() {
		return PRODUCT_NAME;
	}

	public void setPRODUCT_NAME(String pRODUCT_NAME) {
		PRODUCT_NAME = pRODUCT_NAME;
	}

	public String getPRODUCT_DESCRIPTION() {
		return PRODUCT_DESCRIPTION;
	}

	public void setPRODUCT_DESCRIPTION(String pRODUCT_DESCRIPTION) {
		PRODUCT_DESCRIPTION = pRODUCT_DESCRIPTION;
	}

	public Integer getCATEGORY_ID() {
		return CATEGORY_ID;
	}

	public void setCATEGORY_ID(Integer cATEGORY_ID) {
		CATEGORY_ID = cATEGORY_ID;
	}

	public Integer getWEIGHT_CLASS() {
		return WEIGHT_CLASS;
	}

	public void setWEIGHT_CLASS(Integer wEIGHT_CLASS) {
		WEIGHT_CLASS = wEIGHT_CLASS;
	}

	/*
	 * public Interval getWARRANTY_PERIOD() { return WARRANTY_PERIOD; } public
	 * void setWARRANTY_PERIOD(Interval wARRANTY_PERIOD) { WARRANTY_PERIOD =
	 * wARRANTY_PERIOD; }
	 */
	public Integer getSUPPLIER_ID() {
		return SUPPLIER_ID;
	}

	public void setSUPPLIER_ID(Integer sUPPLIER_ID) {
		SUPPLIER_ID = sUPPLIER_ID;
	}

	public String getPRODUCT_STATUS() {
		return PRODUCT_STATUS;
	}

	public void setPRODUCT_STATUS(String pRODUCT_STATUS) {
		PRODUCT_STATUS = pRODUCT_STATUS;
	}

	public Integer getLIST_PRICE() {
		return LIST_PRICE;
	}

	public void setLIST_PRICE(Integer lIST_PRICE) {
		LIST_PRICE = lIST_PRICE;
	}

	public int getMIN_PRICE() {
		return MIN_PRICE;
	}

	public void setMIN_PRICE(Integer mIN_PRICE) {
		MIN_PRICE = mIN_PRICE;
	}

	public String getCATALOG_URL() {
		return CATALOG_URL;
	}

	public void setCATALOG_URL(String cATALOG_URL) {
		CATALOG_URL = cATALOG_URL;
	}
}
