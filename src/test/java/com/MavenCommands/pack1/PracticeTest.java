package com.MavenCommands.pack1;

import org.testng.annotations.Test;

public class PracticeTest {
	@Test(groups={"smoke","regression"})
	public void practice1Test()
	{
		System.out.println("---Test Script1 5---");
	}
	
	@Test(groups="regression")
	public void practice2Test()
	{
		System.out.println("---Test Script 6---");
	}
}
