/********************************************************************************* *
 * Purpose: To do Login Registration with the help of MONGODB repository
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 11/07/2018
 *********************************************************************************/
package com.bridgelabz.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Saurav: Class to start the Spring boot application
 */
@SpringBootApplication
public class LogInMongoApplication {
	/**
	 * Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(LogInMongoApplication.class, args);
	}
}
