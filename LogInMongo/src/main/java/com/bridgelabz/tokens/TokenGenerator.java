/********************************************************************************* *
 * Purpose: To do Login Registration with the help of MONGODB repository. Creating a Token Generator Class that generates the token.
 * 
 * @author Saurav Manchanda
 * @version 1.0
 * @since 11/07/2018
 *********************************************************************************/
package com.bridgelabz.tokens;

import java.util.Date;

import javax.xml.bind.DatatypeConverter;

import org.springframework.stereotype.Service;

import com.bridgelabz.login.model.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
/**
 * @author Saurav:
 * Class TokenGenerator that has a token gerator
 */
@Service
public class TokenGenerator {

	final static String KEY = "Saurav";
/**
 * Method to generate a token
 * @param user
 * @return
 */
	public String generator(User user) {
		String email = user.getEmail();
		String passkey = user.getPassword();
		long time = System.currentTimeMillis();
		long nowMillis = System.currentTimeMillis() + (20 * 60 * 60 * 1000);
		Date now = new Date(nowMillis);
		JwtBuilder builder = Jwts.builder().setId(passkey).setIssuedAt(now).setSubject(email)
				.signWith(SignatureAlgorithm.HS256, KEY);
		if(time>=0) {
			
		}
		return builder.compact();
	}
/**
 * Method to parse the JWT token necessary for assigning 
 * @param jwt
 */
	public void parseJWT(String jwt) {

		Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(KEY)).parseClaimsJws(jwt)
				.getBody();
		System.out.println("ID: " + claims.getId());
		System.out.println("Subject: " + claims.getSubject());
	}
}
