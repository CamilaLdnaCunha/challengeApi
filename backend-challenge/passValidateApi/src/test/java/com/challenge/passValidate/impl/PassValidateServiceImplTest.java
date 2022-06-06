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
	
	
	  PassValidateService passValidateService = Mockito.mock(PassValidateService.class);
	  PassValidateServiceImpl impl = Mockito.mock(PassValidateServiceImpl.class);
	  
	   @Test
	   public void passValidateTest() {
		   PassValidateServiceImpl impl = new PassValidateServiceImpl();
		   
		   String pass = "AbTp!9foK" ;
		   ReturnValidate ret = new ReturnValidate();
		   
		   ret =  impl.passValidate(pass);
		  
		   assertEquals(ret.isValidate(), true);			
   }
		
	   @Test
	   public void passValidateTest2() {
		   PassValidateServiceImpl impl = new PassValidateServiceImpl();
		   
		   String pass = "AAAbbbCc" ;
		   ReturnValidate ret = new ReturnValidate();
		   
		   ret =  impl.passValidate(pass);
		  
		   assertEquals(ret.isValidate(), false);		
	   }
	
}
