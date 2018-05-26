
package com.practice.java.testngEx.testNGPractice;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeGroups;

public class VerifiedGroupsTest {
	
	@Test(groups="sit")
	public void methodTest1() {
		System.out.println("VerifiedGroupsTest.methodTest1()");
	}
	@Test(groups="devint")
	public void methodTest2() {
		System.out.println("VerifiedGroupsTest.methodTest2()");
	}
	@Test(groups="default")
	public void methodTest3() {
		System.out.println("VerifiedGroupsTest.methodTest3()");
	}
	@Test(groups="sit")
	public void methodTest4() {
		System.out.println("VerifiedGroupsTest.methodTest4()");
	}
	@Test(groups="production")
	public void methodTest5() {
		System.out.println("VerifiedGroupsTest.methodTest5()");
	}
	
	@Test(groups="devint")
	public void methodTest6() {
		System.out.println("VerifiedGroupsTest.methodTest6()");
	}
	
	@BeforeGroups("devint")
	public void runBeforeGroup() {
		System.out.println("VerifiedGroupsTest.runBeforeGroup()");
	}

}
