package com.oe.dto;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;
import org.hibernate.usertype.CompositeUserType;

public class CompositeAddressType implements CompositeUserType {

	public String[] getPropertyNames() {
		// TODO Auto-generated method stub
		return new String[] { "street_address", "postal_code", "city",
				"state_province", "country_id" };
	}

	public Type[] getPropertyTypes() {
		// TODO Auto-generated method stub
		return new Type[] { StandardBasicTypes.STRING,
				StandardBasicTypes.STRING, StandardBasicTypes.STRING,
				StandardBasicTypes.STRING, StandardBasicTypes.STRING };
	}

	public Object getPropertyValue(Object component, int property)
			throws HibernateException {
		Object returnValue = null;
		final Cust_addressData auditData = (Cust_addressData) component;
		if (0 == property) {
			returnValue = auditData.getStreet_address();
		} else if (1 == property) {
			returnValue = auditData.getPostal_code();
		} else if (2 == property) {
			returnValue = auditData.getCity();
		} else if (3 == property) {
			returnValue = auditData.getState_province();
		} else if (4 == property) {
			returnValue = auditData.getCountry_id();
		}
		return returnValue;

	}

	public void setPropertyValue(Object component, int property, Object setValue)
			throws HibernateException {
		final Cust_addressData auditData = (Cust_addressData) component;
		if (0 == property) {
			final String Street_address = (String) setValue;
			auditData.setStreet_address(Street_address);
		} else if (1 == property) {
			final String createdDate = (String) setValue;
			auditData.setPostal_code(createdDate);
		} else if (2 == property) {
			final String modifiedBy = (String) setValue;
			auditData.setCity(modifiedBy);
		} else if (3 == property) {
			final String State_province = (String) setValue;
			auditData.setState_province(State_province);
		} else if (4 == property) {
			final String Country_id = (String) setValue;
			auditData.setCountry_id(Country_id);
		}
	}

	public Class returnedClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean equals(Object x, Object y) throws HibernateException {
		// TODO Auto-generated method stub
		return false;
	}

	public int hashCode(Object x) throws HibernateException {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object nullSafeGet(ResultSet resultSet, String[] names,
			SessionImplementor session, Object owner)
			throws HibernateException, SQLException {
		Cust_addressData addresssData = new Cust_addressData();
		// Order of columns is given by sqlTypes() method
		if (!resultSet.wasNull()) {
			final String street_address = resultSet.getString(names[0]);
			final String postal_code = resultSet.getString(names[1]);
			final String city = resultSet.getString(names[2]);
			final String state_province = resultSet.getString(names[3]);
			final String country_id = resultSet.getString(names[4]);

			addresssData.setCity(city);
			addresssData.setCountry_id(country_id);
			addresssData.setPostal_code(postal_code);
			addresssData.setState_province(state_province);
			addresssData.setStreet_address(street_address);
			System.out.println("street_address " + street_address + "  names  "
					+ names[0]);
		} else {
			System.err.println("resultSet is null in CustAddressType");
		}
		return addresssData;
	}

	public void nullSafeSet(PreparedStatement statement, Object value,
			int index, SessionImplementor session) throws HibernateException,
			SQLException {
		if (null == value) {
			statement.setNull(index, Types.VARCHAR);
			statement.setNull(index + 1, Types.VARCHAR);
			statement.setNull(index + 2, Types.VARCHAR);
			statement.setNull(index + 3, Types.VARCHAR);
			statement.setNull(index + 4, Types.VARCHAR);
		} else {
			Cust_addressData addressData = (Cust_addressData) value;

			if (null != addressData.getStreet_address()) {
				String street_address = new String(
						addressData.getStreet_address());
				statement.setString(index, street_address);
			} else {
				statement.setNull(index, Types.VARCHAR);
			}

			if (null != addressData.getPostal_code()) {
				String postal_Code = new String(addressData.getPostal_code());
				statement.setString(index + 1, postal_Code);
			} else {
				statement.setNull(index + 1, Types.VARCHAR);
			}

			if (null != addressData.getCity()) {
				String city = new String(addressData.getCity());
				statement.setString(index + 2, city);
			} else {
				statement.setNull(index + 2, Types.VARCHAR);
			}

			if (null != addressData.getState_province()) {
				String postal_Code = new String(addressData.getState_province());
				statement.setString(index + 3, postal_Code);
			} else {
				statement.setNull(index + 3, Types.VARCHAR);
			}

			if (null != addressData.getCountry_id()) {
				String postal_Code = new String(addressData.getCountry_id());
				statement.setString(index + 4, postal_Code);
			} else {
				statement.setNull(index + 4, Types.VARCHAR);
			}

		}

	}

	public Object deepCopy(Object value) throws HibernateException {
		final Cust_addressData recievedParam = (Cust_addressData) value;
		System.out.println("recievedParam "+recievedParam.getPostal_code());
		final Cust_addressData addressData = new Cust_addressData(recievedParam);
		return addressData;
	}

	public boolean isMutable() {
		return true;
	}

	public Serializable disassemble(Object value, SessionImplementor session)
			throws HibernateException {
		return (Serializable) value;
	}

	public Object assemble(Serializable cached, SessionImplementor session,
			Object owner) throws HibernateException {
		return cached;
	}

	public Object replace(Object original, Object target,
			SessionImplementor session, Object owner) throws HibernateException {
		return this.deepCopy(original);
	}

}
