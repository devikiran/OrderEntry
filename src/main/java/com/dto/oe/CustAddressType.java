package com.dto.oe;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

public class CustAddressType implements UserType {
	/**
	 * Returns the object from the 2 level cache
	 */
	public Object assemble(Serializable cached, Object owner)
			throws HibernateException {
		return cached;
	}

	/**
	 * Used to create Snapshots of the object
	 */
	public Object deepCopy(Object value) throws HibernateException {
		final Cust_addressData recievedParam = (Cust_addressData) value;
		final Cust_addressData addressData = new Cust_addressData(recievedParam);
		return addressData;
	}

	/**
	 * method called when Hibernate puts the data in a second level cache. The
	 * data is stored in a serializable form
	 */
	public Serializable disassemble(final Object value)
			throws HibernateException {
		return (Serializable) value;
	}

	public boolean equals(final Object o1, final Object o2)
			throws HibernateException {
		boolean isEqual = false;
		if (o1 == o2) {
			isEqual = true;
		}
		if (null == o1 || null == o2) {
			isEqual = false;
		} else {
			isEqual = o1.equals(o2);
		}
		return isEqual;
		// for this to work correctly the equals()
		// method must be implemented correctly by Cust_addressData class
	}

	public int hashCode(final Object arg0) throws HibernateException {
		return arg0.hashCode();
	}

	public boolean isMutable() {
		return true;
	}

	public Object nullSafeGet(final ResultSet resultSet, final String[] names,
			SessionImplementor sessionImp, final Object owner)
			throws HibernateException, SQLException {

		// owner here is class from where the call to retrieve data was made.
		// In this case the Test class

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
			System.out.println("street_address "+street_address +"  names  "+names[0]);
		} else {
			System.err.println("resultSet is null in CustAddressType");
		}
		return addresssData;
	}

	public void nullSafeSet(final PreparedStatement statement, final Object value, final int index,
			SessionImplementor arg3) throws HibernateException, SQLException {
		if (null == value) {
            statement.setNull(index, Types.VARCHAR);
            statement.setNull(index + 1, Types.VARCHAR);
            statement.setNull(index + 2, Types.VARCHAR);
            statement.setNull(index + 3,Types.VARCHAR);
            statement.setNull(index + 4,Types.VARCHAR);
        } else {
        	Cust_addressData addressData = (Cust_addressData) value;
            
            if (null != addressData.getStreet_address()) {
                String  street_address = new String(addressData.getStreet_address());
                statement.setString(index , street_address);
            } else {
                statement.setNull(index , Types.VARCHAR);
            }
            
            if (null != addressData.getPostal_code()) {
            	 String  postal_Code = new String(addressData.getPostal_code());
                 statement.setString(index+1 , postal_Code);
            } else {
                statement.setNull(index +1, Types.VARCHAR);
            }
            
            if (null != addressData.getCity()) {
           	 String  city = new String(addressData.getCity());
                statement.setString(index+2 , city);
           } else {
               statement.setNull(index +2, Types.VARCHAR);
           }
            
            if (null != addressData.getState_province()) {
           	 String  postal_Code = new String(addressData.getState_province());
                statement.setString(index+3 , postal_Code);
           } else {
               statement.setNull(index +3, Types.VARCHAR);
           }
            
            
            if (null != addressData.getCountry_id()) {
           	 String  postal_Code = new String(addressData.getCountry_id());
                statement.setString(index+4 , postal_Code);
           } else {
               statement.setNull(index +4, Types.VARCHAR);
           }

        }

	}

	public Object replace(final Object original, final Object target,
			final Object owner) throws HibernateException {
		return this.deepCopy(original);
	}

	@SuppressWarnings("rawtypes")
	public Class returnedClass() {
		return Cust_addressData.class;
	}

	public int[] sqlTypes() {
		return new int[] { Types.VARCHAR, Types.VARCHAR, Types.VARCHAR,
				Types.VARCHAR, Types.VARCHAR };
	}
}
