package com.practice.java.testngEx.testNGPractice;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

@Test(groups="group1")
public class PartialGroupTest {
	
	String str;
	@Parameters("paramValueFromXML")
	PartialGroupTest(String paramValueFromXML){
		str=paramValueFromXML;
		
	}
//partial group means methodTest1() belowng to both group 
//i.e. group1 & group2 while methodTest2() belongs to Group1 only
	@Test(groups="group2")
	public void methodTest1() {
		System.out.println("PartialGroupTest.methodTest1()");
	}
	
	public void methodTest2() {
		System.out.println("PartialGroupTest.methodTest2()="+str);
	}
}
