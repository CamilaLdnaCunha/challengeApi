package com.challenge.passValidate.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateRules {

	public boolean validCharacterTypes(String pass) {
		boolean returnValidate = true;

		String regex = "^(?=.*[0-9])" 
		                          + "(?=.*[a-z])(?=.*[A-Z])" 
		                          + "(?=.*[!@#$%^&*()-+])"
		                          + "(?=\\S+$).{9,}$";

		Pattern p = Pattern.compile(regex);

		returnValidate = pass.matches("\\A\\p{ASCII}*\\z");
		
		if (returnValidate) {
			// executa a verificação regex
			Matcher m = p.matcher(pass);
			returnValidate = m.matches();
		}
		
		return returnValidate;
	}

	public boolean validCharacterQtde(String pass) throws ExceptionInInitializerError {
		boolean returnValidate = true;
		int repeatedCharQtde = 0;
		int l = 0;

		pass = pass.toUpperCase();

		// verifica letras repetidas
		char repeatedChar[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@',
				'#', '$', '%', '^', '&', '*', '(', ')', '-', '+' };

		forCaracteres: for (l = 0; l < repeatedChar.length; l++) {
			repeatedCharQtde = 0; 
			
			for (int q = 0; q < pass.length(); q++) {
				if (pass.charAt(q) == repeatedChar[l]) {
					repeatedCharQtde++;

					if (repeatedCharQtde >= 2) {
						returnValidate = false;
						break forCaracteres;
					}
				}
			}
		}

		return returnValidate;
	}
}
