/********************************************************************************* *
 * Purpose: To do Login Registration with normal mysql connection
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 11/07/2018
 *********************************************************************************/
package com.bridgelabz.util;

/**
 * @author Saurav:
 * Class Utility just made to display the errorMessage
 */
public class Utility {

	private String errorMessage;
	 
    public Utility(String errorMessage){
        this.errorMessage = errorMessage;
    }
 
    public String getErrorMessage() {
        return errorMessage;
    }
	
}
