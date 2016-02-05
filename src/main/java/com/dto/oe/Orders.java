package com.dto.oe;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Orders {
	
	public int ORDER_ID;
	public Date ORDER_DATE;
	public String ORDER_MODE;
	public int CUSTOMER_ID;
	public int ORDER_STATUS;
	public int ORDER_TOTAL;
	public int SALES_REP_ID;
	public int PROMOTION_ID;
}
