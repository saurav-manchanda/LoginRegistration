/********************************************************************************* *
 * Purpose: To Perform and learn Spring Boot via an example. Creating a controller class.
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 11/07/2018
 *********************************************************************************/
package com.bridgelabz.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Saurav:
 * Class to make a rest controller that has info about what url calls which method to access
 */
@RestController
public class Controller {
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hello";
	}
}
