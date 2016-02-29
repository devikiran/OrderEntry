package com.oe.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_Items")
public class Order_Items {
	@Id
	public int ORDER_ID;
	public int LINE_ITEM_ID;
	public int PRODUCT_ID;
	public int UNIT_PRICE;
	public int QUANTITY;
	public int getORDER_ID() {
		return ORDER_ID;
	}
	public void setORDER_ID(int oRDER_ID) {
		ORDER_ID = oRDER_ID;
	}
	public int getLINE_ITEM_ID() {
		return LINE_ITEM_ID;
	}
	public void setLINE_ITEM_ID(int lINE_ITEM_ID) {
		LINE_ITEM_ID = lINE_ITEM_ID;
	}
	public int getPRODUCT_ID() {
		return PRODUCT_ID;
	}
	public void setPRODUCT_ID(int pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}
	public int getUNIT_PRICE() {
		return UNIT_PRICE;
	}
	public void setUNIT_PRICE(int uNIT_PRICE) {
		UNIT_PRICE = uNIT_PRICE;
	}
	public int getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(int qUANTITY) {
		QUANTITY = qUANTITY;
	}
}
