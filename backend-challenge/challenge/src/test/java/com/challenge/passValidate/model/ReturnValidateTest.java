package com.challenge.passValidate.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = ReturnValidate.class)
public class ReturnValidateTest {
	
	ReturnValidate ret;
	
	@BeforeEach
    public void setTest() {
		ReturnValidate ret = new ReturnValidate();
		ret.setValidate(false);
    }

   @Test
    public void testThis() {
		ReturnValidate ret = new ReturnValidate();
		ret.setValidate(true);
        assertThat(ret.isValidate()).isEqualTo(true);
    }
}
