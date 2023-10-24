package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	
	@Test
	public void testlogin1()
	{
		App m1=new App();
		Assert.assertEquals(0, m1.userLogin("null", "9890"));
	}
	
	@Test
	
	public void testlogin2()
	{
		App m2=new App();
		Assert.assertEquals(1, m2.userLogin("abc", "abc@123"));
	}
	
	
	

}
