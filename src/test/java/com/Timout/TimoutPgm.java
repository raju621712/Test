package com.Timout;

import org.testng.annotations.Test;

public class TimoutPgm {
	
	
	@Test
	private void loGin() {
		System.out.println("User Login");

	}
	
	@Test(timeOut = 5000)
	private void loGout() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("user Logout");

	}

}
