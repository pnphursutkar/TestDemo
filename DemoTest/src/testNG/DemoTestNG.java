package testNG;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNG {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	
	
	@Test
	public void test()
	{
		System.out.println("test");
	}
	
	
	
	
}
