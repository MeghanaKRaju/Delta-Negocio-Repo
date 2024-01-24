package com.MavenCommands.pack1;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(groups={"smoke","regression"})
	public void Demo1Test()
	{
		System.out.println("---Test Script1 3---");
	}
	
	@Test(groups="smoke")
	public void Demo2Test()
	{
		System.out.println("---Test Script 4---");
	}

}
