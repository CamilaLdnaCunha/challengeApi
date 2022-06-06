package com.challenge.passValidate.impl;

import org.springframework.stereotype.Service;

import com.challenge.passValidate.model.ReturnValidate;
import com.challenge.passValidate.service.PassValidateService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PassValidateServiceImpl implements PassValidateService {

	ValidateRules validateRules = new ValidateRules();
	
	@Override
	public ReturnValidate passValidate(String pass) {
		boolean retValidate = true;

		retValidate = validateRules.validCharacterTypes(pass);

		if (retValidate) {
			retValidate = validateRules.validCharacterQtde(pass);
		}

		ReturnValidate ret = new ReturnValidate();
		ret.setValidate(retValidate);

		return ret;
	}
}
