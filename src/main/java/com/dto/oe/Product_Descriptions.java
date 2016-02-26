package com.dto.oe;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product_Descriptions")

public class Product_Descriptions {
	
	@Id
	public int PRODUCT_ID;
	public String LANGUAGE_ID;
	public String TRANSLATED_NAME;
	public String TRANSLATED_DESCRIPTION;
	
	public int getPRODUCT_ID() {
		return PRODUCT_ID;
	}
	public void setPRODUCT_ID(int pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}
	public String getLANGUAGE_ID() {
		return LANGUAGE_ID;
	}
	public void setLANGUAGE_ID(String lANGUAGE_ID) {
		LANGUAGE_ID = lANGUAGE_ID;
	}
	public String getTRANSLATED_NAME() {
		return TRANSLATED_NAME;
	}
	public void setTRANSLATED_NAME(String tRANSLATED_NAME) {
		TRANSLATED_NAME = tRANSLATED_NAME;
	}
	public String getTRANSLATED_DESCRIPTION() {
		return TRANSLATED_DESCRIPTION;
	}
	public void setTRANSLATED_DESCRIPTION(String tRANSLATED_DESCRIPTION) {
		TRANSLATED_DESCRIPTION = tRANSLATED_DESCRIPTION;
	}
	
}
