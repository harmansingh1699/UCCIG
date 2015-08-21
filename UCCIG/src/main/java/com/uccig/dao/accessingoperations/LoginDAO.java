package com.uccig.dao.accessingoperations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.uccig.util.DAOUtil;

public class LoginDAO {

	public LoginDAO() {
		try {
			Statement stmt = DAOUtil.getConnection().createStatement();
			stmt.executeUpdate(
					"CREATE TABLE IF NOT EXISTS \"UsersDetails\" (\"emailAddress\" character varying(4000) NOT NULL,  "
							+ "password character varying(4000),  "
							+ "active character varying(4000),  CONSTRAINT \"UsersDetails_pkey\" PRIMARY KEY (\"emailAddress\"))");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean emailAddressExists(String emailAddress) {
		boolean result = false;
		Connection connection = DAOUtil.getConnection();
		Statement statement = null;
		int count = -1;
		try {

			statement = connection.createStatement();

			String sql = "select count(1) FROM \"UsersDetails\" where \"emailAddress\" = '" + emailAddress
					+ "' and active ='Y'";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				count = rs.getInt(1);
			}

			if (count > 0)
				result = true;
			statement.close();
			connection.close();

		} catch (Exception e) {
			System.err.println(e);
		}

		return result;
	}

	public String getPassword(String emailAddress) {
		String result = null;
		Connection connection = DAOUtil.getConnection();
		Statement statement = null;

		try {

			statement = connection.createStatement();

			String sql = "select password FROM \"UsersDetails\" where \"emailAddress\" = '" + emailAddress
					+ "' and active ='Y'";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				result = rs.getString(1);
			}

			statement.close();
			connection.close();

		} catch (Exception e) {
			System.err.println(e);
		}

		return result;
	}

}
