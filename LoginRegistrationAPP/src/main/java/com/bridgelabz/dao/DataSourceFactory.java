
/********************************************************************************* *
 * Purpose: To make a Data Source Factory that returns the datasource as requested
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 20/06/2018
 *********************************************************************************/
package com.bridgelabz.dao;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * @author Saurav:
 * Class Data Source Factory that returns a datasource
 */
public class DataSourceFactory {
	public static DataSource getMySQLDataSource() {
		Properties props = new Properties();
		FileInputStream fis = null;
		MysqlDataSource mysqlDS = null;
		try {
			fis = new FileInputStream("/home/bridgelabz/TodoAppWorkspace/LoginRegistrationAPP/src/main/resources/application.properties");
			props.load(fis);
			mysqlDS = new MysqlDataSource();
			mysqlDS.setURL(props.getProperty("MYSQL_DB_URL"));
			mysqlDS.setUser(props.getProperty("MYSQL_DB_USERNAME"));
			mysqlDS.setPassword(props.getProperty("MYSQL_DB_PASSWORD"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mysqlDS;
	}
}
