package com.challenge.passValidate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.passValidate.model.ReturnValidate;
import com.challenge.passValidate.service.PassValidateService;

@RestController
@RequestMapping("/challenge")
public class PassValidateController {

    @Autowired
    private final PassValidateService service;

    public PassValidateController(PassValidateService service) {
        this.service = service;
    }
    
    @GetMapping("/{pass}")
    public ResponseEntity<ReturnValidate> passValidate(@PathVariable(value = "pass") String pass ) {
    	return ResponseEntity.ok(service.passValidate(pass));
    }
}
