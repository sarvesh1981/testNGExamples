package com.practice.java.testngEx.testNGPractice;

import org.testng.annotations.Test;

public class ClassCreatedByFactoryWithInputData {
	
	String user;
	String pwd;
	
	ClassCreatedByFactoryWithInputData(String user,String pwd){
		this.user=user;
		this.pwd=pwd;
	}
	@Test(alwaysRun=true)
	public void displayData() {		
		System.out.println("FExuser="+user+", FExpwd="+pwd);
	}
	
	@Test(dependsOnMethods="displayData")
	public void displayData1() {
		System.out.println("ClassCreatedByFactoryWithInputData.displayData1()"+user);
	}
	
	@Test(dependsOnMethods="displayData1")
	public void displayData2() {
		System.out.println("ClassCreatedByFactoryWithInputData.displayData2()"+user);
	}
	
	
	@Test(dependsOnMethods="displayData2")
	public void displayData3() {
		System.out.println("ClassCreatedByFactoryWithInputData.displayData3()"+user);
	}
}
