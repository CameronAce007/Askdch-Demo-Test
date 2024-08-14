package CartTest;

import Base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import www.askdch.com.pages.AccountPage;
import www.askdch.com.pages.CartPage;
import www.askdch.com.pages.StorePage;

public class CartTest extends BaseTest {

    @Test
    public void validate_CartPageTitle() throws InterruptedException {
        AccountPage accountPage = homePage.clickAccount();
        accountPage.login("cam5266@gmail.com","123456789");
        StorePage storePage = accountPage.clickBrowserProduct();
        storePage.addToCart("Blue Shoes");
        CartPage cartPage = storePage.viewCart();
        Assertions.assertEquals("Cart – AskOmDch", cartPage.getPageTitle());
    }

    @Test
    public void validate_ProductAddedInCartPage() throws InterruptedException {
        AccountPage accountPage = homePage.clickAccount();
        accountPage.login("cam5266@gmail.com", "123456789");
        StorePage storePage = accountPage.clickBrowserProduct();
        storePage.addToCart("Blue Shoes");
        CartPage cartPage = storePage.viewCart();
        Assertions.assertTrue(cartPage.isProductDisplayedInCart(), "Product not displayed");
    }
}

