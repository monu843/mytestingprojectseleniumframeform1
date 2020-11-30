package Testnglistenrers;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Testnglistenrers.testlistenrs.class)

public class Testlistner1 {

	@Test
	public void test1() {
		System.out.println("test 1");
	}
	@Test
	public void test2() {
		System.out.println("test 2");
		Assert.assertEquals(true, false);
	}
	@Test
	public void test3() {
		System.out.println("test 3");
	}
	@Test
	public void test4() {
		System.out.println("test 4");
	}
	
	
}
