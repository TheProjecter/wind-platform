package br.com.maisha.wind.controller.validator;

import junit.framework.Assert;

import org.junit.Test;

import br.com.maisha.terra.lang.Property;

public class MinLengthValidatorTest {

	@Test
	public void testValidate() {
		MinLengthValidator o = new MinLengthValidator();
		o.configure(new Property("min_length", "3"));
		Assert.assertFalse("O valor [12] nao deve passar na validacao de min length(3)", o.validate("12"));
	}

	@Test
	public void testValidate2() {
		MinLengthValidator o = new MinLengthValidator();
		o.configure(new Property("min_length", "3"));
		Assert.assertTrue("O valor [123] deve passar na validacao de min length(3)", o.validate("123"));
	}

}
