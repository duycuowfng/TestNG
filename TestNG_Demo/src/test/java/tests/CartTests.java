package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;

public class CartTests extends BaseTest {
	
	@Test
	public void testEmptyCart() {
		CartPage cart = basePage.clickCheckoutLink();
		Assert.assertEquals(0, cart.getNumberOfProductsInCart());
	}
}