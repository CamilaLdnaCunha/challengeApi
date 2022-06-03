package com.challenge.passValidate.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.challenge.passValidate.model.ReturnValidate;
import com.challenge.passValidate.service.PassValidateService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = PassValidateServiceImpl.class)
public class PassValidateServiceImplTest {
	
     String pass1 = "AAAbbbCc" ;
     
	 String pass = "AbTp!9foK" ;
	 
     PassValidateService passValidateService = Mockito.mock(PassValidateService.class);
	   
	   @Test
	   public void passValidateTest() {
			boolean retValidate = true;
			
			retValidate = PassValidateServiceImpl.validCharacterQtde(pass);
			
			assertEquals(retValidate, true);
			
			if (retValidate) {
				retValidate =  PassValidateServiceImpl.validCharacterQtde(pass);
			}

			assertEquals(retValidate, true);
			
			ReturnValidate ret = new ReturnValidate();
			ret.setValidate(retValidate);

			assertEquals(ret.isValidate() , true);
	   }
		
	   @Test
	   public void passValidateTest2() {
			boolean retValidate = true;
			
			retValidate = PassValidateServiceImpl.validCharacterQtde(pass1);
			
			 assertEquals(retValidate, false);
			 
			if (retValidate) {
				retValidate =  PassValidateServiceImpl.validCharacterQtde(pass1);
			}

			assertEquals(retValidate, false);
				
			ReturnValidate ret = new ReturnValidate();
			ret.setValidate(retValidate);

			assertEquals(ret.isValidate() , false);
	   }
	
}
