package com.dto.oe;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Warehouses")
public class Warehouses {
	@Id
	public int WAREHOUSE_ID;
	public String WAREHOUSE_NAME;
	public int LOCATION_ID;
	/*WH_GEO_LOCATION;*/
	public int getWAREHOUSE_ID() {
		return WAREHOUSE_ID;
	}
	public void setWAREHOUSE_ID(int wAREHOUSE_ID) {
		WAREHOUSE_ID = wAREHOUSE_ID;
	}
	public String getWAREHOUSE_NAME() {
		return WAREHOUSE_NAME;
	}
	public void setWAREHOUSE_NAME(String wAREHOUSE_NAME) {
		WAREHOUSE_NAME = wAREHOUSE_NAME;
	}
	public int getLOCATION_ID() {
		return LOCATION_ID;
	}
	public void setLOCATION_ID(int lOCATION_ID) {
		LOCATION_ID = lOCATION_ID;
	}
}
