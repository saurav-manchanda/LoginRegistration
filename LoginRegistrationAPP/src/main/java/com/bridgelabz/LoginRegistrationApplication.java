/********************************************************************************* *
 * Purpose: To do Login Registration with normal mysql connection
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 11/07/2018
 *********************************************************************************/
package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Saurav:
 * Class to perform LoginRegistrationApplication which is a SpringBootApplication Starter 
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
@EnableAutoConfiguration
public class LoginRegistrationApplication {
	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
	SpringApplication.run(LoginRegistrationApplication.class, args);
	}

}
