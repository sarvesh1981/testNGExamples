package com.practice.java.testngEx.testNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationValidataion {
	
	@BeforeSuite
	public void beforesuitetest() {
		System.out.println("AnnotationValidataion.beforesuitetest()");
	}
	@AfterSuite
	public void afterSuiteTest() {
		System.out.println("AnnotationValidataion.afterSuiteTest()");
	}
	@BeforeTest
	public void beforeTestTest() {
		System.out.println("AnnotationValidataion.beforeTestTest()");
	}
	@AfterTest
	public void afterTestTest() {
		System.out.println("AnnotationValidataion.afterTestTest()");
	}
	@BeforeClass
	public void beforeClassTest() {
		System.out.println("AnnotationValidataion.beforeClassTest()");
	}
	@AfterClass
	public void afterClassTest() {
		System.out.println("AnnotationValidataion.afterClassTest()");
	}
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("AnnotationValidataion.beforeMethodTest()");
	}
	@AfterMethod
	public void afterMethodTest() {
		System.out.println("AnnotationValidataion.afterMethodTest()");
	}
	@BeforeGroups("check")
	public void beforeGroupTest() {
		System.out.println("AnnotationValidataion.beforeGroupTest()");
	}
	@AfterGroups("check")
	public void afterGroupTest() {
		System.out.println("AnnotationValidataion.afterGroupTest()");
	}
	@Test(groups="check")
	public void testGroupTest(){
		System.out.println("AnnotationValidataion.testGroupTest()");
	}
	
	@Test(dependsOnMethods="testGroupTest")
	public void testDummyTest(){
		System.out.println("AnnotationValidataion.testDummyTest()");
	}

}
