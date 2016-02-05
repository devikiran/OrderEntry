package com.dto.oe;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Inventories")
public class Inventories {

	@Id
	@Column(name = "product_id")
	public int product_id;
	@Column(name = "warehouse_id")
	public int warehouse_id;
	@Column(name = "quantity_on_hand")
	public int quantity_on_hand;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getWarehouse_id() {
		return warehouse_id;
	}

	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	public int getQuantity_on_hand() {
		return quantity_on_hand;
	}

	public void setQuantity_on_hand(int quantity_on_hand) {
		this.quantity_on_hand = quantity_on_hand;
	}

}