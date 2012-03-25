package br.com.maisha.wind.controller.validator;

import junit.framework.Assert;

import org.junit.Test;

import br.com.maisha.terra.lang.Property;

public class MaxLengthValidatorTest {

	@Test
	public void testValidate() {
		MaxLengthValidator o = new MaxLengthValidator();
		o.configure(new Property("max_length", "10"));
		Assert.assertFalse("O valor [12345678901] nao deve passar na validacao de max length(10)", o.validate("12345678901"));
	}

	@Test
	public void testValidate2() {
		MaxLengthValidator o = new MaxLengthValidator();
		o.configure(new Property("max_length", "10"));
		Assert.assertTrue(o.validate("1234567"));
	}

}
