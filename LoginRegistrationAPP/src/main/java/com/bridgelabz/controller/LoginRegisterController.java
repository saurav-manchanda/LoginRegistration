/********************************************************************************* *
 * Purpose: To do Login Registration with normal mysql connection
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 11/07/2018
 *********************************************************************************/
package com.bridgelabz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.model.User;
import com.bridgelabz.service.UserService;
import com.bridgelabz.util.Utility;

/**
 * @author Saurav:
 * Class LoginregisterController acts as a controller that has info about what method to run when access according to the url
 */
@RestController
@SuppressWarnings({ "rawtypes", "unchecked" })
public class LoginRegisterController {

	public static final Logger logger =  LoggerFactory.getLogger(LoginRegisterController.class);
	
	@Autowired
	@Qualifier("mysql")
	UserService userService ;
	//UserService userMongoService;
	
	//--------------------User Login-------------------------------
	
	
	@RequestMapping(value="/login", method =RequestMethod.POST)
	
	public ResponseEntity<String> login(@RequestBody User checkuser){
		logger.info("Logging User : {}",checkuser);
		
		User user = userService.login(checkuser.getEmail(), checkuser.getPassword());
		
		if(user==null) {
			logger.error("User with email {} not found.",checkuser.getEmail());
			
			return new ResponseEntity(new Utility("User with email"+ checkuser.getEmail()+"not Found"),HttpStatus.NOT_FOUND);
		}
		
		String message = "Hello "+ user.getUserName()+ "ID: "+ user.getUserId()+"Email: "+user.getEmail()+"Contact Number: "+ user.getContactNumber();
	
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
	//-------------------User Registration----------------------------
	@RequestMapping(value="/register",method = RequestMethod.POST)
	
	public ResponseEntity<String> register(@RequestBody User regUser){
		
		logger.info("Regster User : {}" ,regUser);
		
		boolean registered = userService.register(regUser);
		
		if(!registered) {
			logger.error("User with email {} already present"+ regUser.getEmail());
			return new ResponseEntity(new Utility("User with Email: "+ regUser.getEmail()+" already Present"),HttpStatus.CONFLICT);
		}
		
		logger.info("User registered with : {}",regUser.getEmail());
		String message = " Successfully Registered";
		
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
}