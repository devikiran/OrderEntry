package com.dto.oe;

import java.io.Serializable;


@SuppressWarnings("serial")
public class Cust_addressData implements Serializable {
	/**
	 * 
	 */
	private String street_address;
	private String postal_code;
	private String city;
	private String state_province;
	private String country_id;
	

	public Cust_addressData() {
	}

	public Cust_addressData(Cust_addressData other) {
		this.setCity(other.getCity());
		this.setCountry_id(other.getCountry_id());
		this.setPostal_code(other.getPostal_code());
		this.setStreet_address(other.getStreet_address());
		this.setState_province(other.getState_province());

	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_province() {
		return state_province;
	}

	public void setState_province(String state_province) {
		this.state_province = state_province;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	@Override
	public boolean equals(Object obj) {

		boolean isEqual = false;
		if (obj instanceof Cust_addressData) {
			Cust_addressData addressData = (Cust_addressData) obj;

			isEqual = addressData.getCity().equals(this.getCity())
					&& addressData.getState_province().equals(
							this.getState_province())
					&& addressData.getCountry_id().equals(this.getCountry_id())
					&& addressData.getPostal_code().equals(
							this.getPostal_code())
					&& addressData.getStreet_address().equals(
							this.getStreet_address());
		}
		return isEqual;
	}

	@Override
	public int hashCode() {
		int hash = this.getCountry_id().hashCode();
		hash = hash * 17 + this.getPostal_code().hashCode();
		hash = hash * 31 + this.getStreet_address().hashCode();
		hash = hash * 13 + this.getState_province().hashCode();
		hash = hash * 14 + this.getCity().hashCode();
		return hash;
	}

	@Override
	public String toString() {

		return "[ " + this.getClass() + " { city : " + city
				+ ", street_address: " + street_address + ", postal_code: "
				+ postal_code + ", state_province: " + state_province + ""
				+ ",country_id :" + country_id + "}]";
	}
}
