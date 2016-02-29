package com.oe.dto;

import java.io.Serializable;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Struct;
import java.sql.Types;
import java.util.Arrays;

import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.usertype.UserType;

public class PhoneNumbersType implements UserType {
	private static final int SQL_TYPE = Types.STRUCT;
	private static final String OBJECT_TYPE = "PHONE_LIST_TYP";

	public int[] sqlTypes() {
		return new int[] { SQL_TYPE };
	}

	public Class returnedClass() {
		return PhoneNumbersType.class;
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
	}

	public int hashCode(final Object arg0) throws HibernateException {
		return arg0.hashCode();
	}

	public Object nullSafeGet(final ResultSet resultSet, final String[] names,
			SessionImplementor sessionImp, final Object owner)
			throws HibernateException, SQLException {
		final PhoneNumbersData phoneNumnberData = new PhoneNumbersData();
		System.out.println(resultSet.getObject(names[0])+"resultSet.getObject(names[0])");
		
		Array array = resultSet.getArray(names[0]);
	    String[] phonenumberarray = (String[]) array.getArray();
	    System.out.println(phonenumberarray[0]);
	    

		if (resultSet.wasNull()) {

			return null;

		}

		if (phonenumberarray.length > 0) {
			phoneNumnberData.setPhoneNumbers(Arrays.asList(phonenumberarray));
		}

		return phoneNumnberData;

	}

	public void nullSafeSet(final PreparedStatement statement,
			final Object value, final int index, SessionImplementor arg3)
			throws HibernateException, SQLException {
		if (value == null) {
			statement.setNull(index, SQL_TYPE, OBJECT_TYPE);
		} else {
			final PhoneNumbersData phoneNumnberData = (PhoneNumbersData) value;
			final Object[] values = new Object[] { phoneNumnberData
					.getPhoneNumbers() };
			final Connection connection = statement.getConnection();
			final STRUCT struct = new STRUCT(StructDescriptor.createDescriptor(
					OBJECT_TYPE, connection), connection, values);
			statement.setObject(index, struct, SQL_TYPE);
		}
	}

	public Object deepCopy(Object value) throws HibernateException {
		if (value == null) {

			return null;

		}
		final PhoneNumbersData recievedParam = (PhoneNumbersData) value;
		final PhoneNumbersData phonenumnberData = new PhoneNumbersData(
				recievedParam);

		return phonenumnberData;
	}

	public boolean isMutable() {
		return true;
	}

	public Serializable disassemble(final Object value)
			throws HibernateException {
		return (Serializable) value;
	}

	public Object assemble(Serializable cached, Object owner)
			throws HibernateException {
		return cached;
	}

	public Object replace(final Object original, final Object target,
			final Object owner) throws HibernateException {
		return this.deepCopy(original);
	}

}
