package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("beforetest");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("beforemethod");
	}
	@Test(priority = 4,invocationCount = 3,groups = {"smoke"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority = 3,dependsOnMethods = {"test1"},groups = {"smoke","sanity"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority = 2,groups = {"sanity"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(priority = 1,groups = {"regression"})
	public void test4()
	{
		System.out.println("test4");
	}
	@Test(priority = 5,groups = {"regression"})
	public void test5()
	{
		System.out.println("test5");
	}
	
	@AfterMethod
	public void aftrmthd()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void tearDown()
	{
		System.out.println("aftretest");
	}
	
	

}
