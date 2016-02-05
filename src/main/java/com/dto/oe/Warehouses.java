package com.dto.oe;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Warehouses")
public class Warehouses {
	public int WAREHOUSE_ID;
	public String WAREHOUSE_NAME;
	public int LOCATION_ID;
	/*WH_GEO_LOCATION;*/
}
