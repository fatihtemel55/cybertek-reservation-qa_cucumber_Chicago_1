package com.herokuapp.qa.tests;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.herokuapp.qa.utilities.ConfigurationReader;

public class JDBCConnection {

	String reservDbUrl = ConfigurationReader.getProperty("reservationDbUrl");
	String reservDbUsername = ConfigurationReader.getProperty("reservationDbUsername");
	String reservDbPassword = ConfigurationReader.getProperty("reservationDbPassword");

	@Test()
	public void oracleJDBC() throws SQLException {
		Connection connection = DriverManager.getConnection(reservDbUrl, reservDbUsername, reservDbPassword);
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet resultSet = statement.executeQuery("select * from countries");

		resultSet.close();
		statement.close();
		connection.close();
	}

}
