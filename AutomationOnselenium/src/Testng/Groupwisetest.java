package Testng;

import org.testng.annotations.Test;

public class Groupwisetest {
	
	@Test(groups = {"smoke testing","functional testing"})
	public void login() {
		System.out.println("smoke and fuctional testing"+" login page");
	}
	@Test(groups= {"reggresion testing"})
	public void homepage() {
		System.out.println("Reggresion testing" + "Home page");
	}
	@Test(groups= {"sanity testing"})
	public void logout() {
		System.out.println("sanity testing, logout page");
	}
	@Test(groups= {"integration testing"})
	public void product() {
		System.out.println("integration testing, product search");
	}
	@Test(groups= {"smoke testing"})
	public void search() {
		System.out.println("smoke testing,  search page");
	}
}
