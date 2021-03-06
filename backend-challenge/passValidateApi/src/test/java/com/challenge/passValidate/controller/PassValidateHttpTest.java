package com.challenge.passValidate.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.challenge.passValidate.service.PassValidateService;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class PassValidateHttpTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PassValidateService passValidateService;
    
    @Test
    void badPassText() throws Exception {
           mockMvc.perform(get("http://localhost:8080/passsValidate/{pass}", "AbTp9!fok")
       	        .contentType("application/json")
       	        .param("pass", "true") )
       	        .andExpect(status().isNotFound());
    }
    
    @Test
    void OkPassText() throws Exception {
           mockMvc.perform(get("http://localhost:8080/passValidate/{pass}", "AbTp9!fok")
       	        .contentType("application/json")
       	        .param("pass", "true") )
       	        .andExpect(status().isOk());
    }
}
