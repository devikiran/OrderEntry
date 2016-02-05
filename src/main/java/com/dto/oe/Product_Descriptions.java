package com.dto.oe;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@Table(name="Product_Descriptions")

public class Product_Descriptions {
	public int PRODUCT_ID;
	public String LANGUAGE_ID;
	public String TRANSLATED_NAME;
	public String TRANSLATED_DESCRIPTION;
}
