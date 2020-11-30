package Testng;

import org.testng.annotations.Test;

public class Suitfileperiority {

	@Test
	public void login() {
		System.out.println("login page");
	}
	@Test 
	public void logout() {
		System.out.println("page logout");
	}
	@Test
	public void search() {
		System.out.println("search page");
	}
	@Test
	public void checkout() {
		System.out.println("checkout page");
	}
}
