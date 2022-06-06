package com.challenge.passValidate.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.challenge.passValidate.model.ReturnValidate;
import com.challenge.passValidate.service.PassValidateService;


public class PassValidateControllerTest {
	
	PassValidateController passValidateController;
    
	ReturnValidate retTrue = new ReturnValidate();
    
    ReturnValidate retFalse = new ReturnValidate();
    
    PassValidateService passValidateService = Mockito.mock(PassValidateService.class);
   
    @BeforeEach
    void setBefore() {

    	retTrue.setValidate(true);
    	retFalse.setValidate(false);

    	when(passValidateService.passValidate("AbTp9!fok")).thenReturn(retTrue);
        when(passValidateService.passValidate("AbTp9!foA")).thenReturn(retFalse);
        this.passValidateController = new PassValidateController(passValidateService);
    }

    @Test
    void valisPassTest() {
        assertEquals(retTrue, passValidateService.passValidate("AbTp9!fok"));
    }

    @Test
    void invalidPassTest() {
         assertEquals(retFalse, passValidateService.passValidate("AbTp9!foA"));
    }
}
