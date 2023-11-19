package testng_attributes;

import org.testng.annotations.Test;

// How can you prioritize test cases in testNG?
public class Priority {

	@Test()
	public void loginTest() {
		// Test case logic for user login
		System.out.println("Executing Login Test");
	}

	@Test(priority = 1)
	public void searchProductTest() {
		// Test case logic for searching a product
		System.out.println("Executing Search Product Test");
	}

	@Test(priority = 1)
	public void addToCartTest() {
		// Test case logic for adding a product to the cart
		System.out.println("Executing Add to Cart Test");
	}

	@Test(priority = 2)
	public void checkoutTest() {
		// Test case logic for the checkout process
		System.out.println("Executing Checkout Test");
	}
}
