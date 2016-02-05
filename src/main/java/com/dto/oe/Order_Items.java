package com.dto.oe;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Order_Items")
public class Order_Items {
	public int ORDER_ID;
	public int LINE_ITEM_ID;
	public int PRODUCT_ID;
	public int UNIT_PRICE;
	public int QUANTITY;
}
