package com.challenge.passValidate.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.passValidate.model.ReturnValidate;

public interface PassValidateService {

	ReturnValidate passValidate(String pass);
}
