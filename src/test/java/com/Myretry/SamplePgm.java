package com.Myretry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SamplePgm {
	
	
	@Test(retryAnalyzer = MyretryPgm.class)
	private void usernameValidation() {
		
		Assert.assertEquals("Cool", "MSD");
		
		
	}
	
	
	@Test
	private void pwdVali() {
		
		Assert.assertEquals("Paul", "Palam");
		

	}

}
