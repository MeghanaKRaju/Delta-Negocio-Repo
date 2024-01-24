package com.MavenCommands.pack1;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(groups={"smoke","regression"})
	public void sample1Test()
	{
		System.out.println("---Test Script1 1---");
	}
	
	@Test(groups="smoke")
	public void sample2Test()
	{
		System.out.println("---Test Script 2---");
	}
}
