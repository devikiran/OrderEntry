package com.oe.dto;

import java.io.Serializable;
import java.util.List;

public class PhoneNumbersData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> phoneNumbers;

	public PhoneNumbersData() {
	}

	public PhoneNumbersData(PhoneNumbersData recievedParam) {

		this.setPhoneNumbers(recievedParam.getPhoneNumbers());

	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;

		if (obj instanceof PhoneNumbersData) {
			PhoneNumbersData phonenumbersData = (PhoneNumbersData) obj;
			isEqual = phoneNumbers.equals(phonenumbersData.getPhoneNumbers());
		}
		return isEqual;
	}

	@Override
	public int hashCode() {
		return phoneNumbers.hashCode();
	}

	@Override
	public String toString() {
		return phoneNumbers.toString();
	}
}
