package Account;

import Base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import www.askdch.com.pages.AccountPage;

public class AccountTest extends BaseTest {
    @Test
    public void validate_RegisteringUser() throws InterruptedException {

        AccountPage accountPage = homePage.clickAccount();
        accountPage.setUsername("Cam10");
        accountPage.setEmailAddress("cam14@gmail.com");
        accountPage.setPassword("123456789");
        accountPage.clickRegister();
        Thread.sleep(5000);
        Assertions.assertEquals("Logout",accountPage.getLogoutText());
        }
    @Test
    public void validate_BrowserProduct() throws InterruptedException {
        AccountPage accountPage = homePage.clickAccount();
        accountPage.login("cam5266@gmail.com","123456789");
        accountPage.clickBrowserProduct();
        Assertions.assertEquals("Products – AskOmDch",accountPage.getStoreTitle());
    }
    @Test
    public void validate_ShippingAddress() throws InterruptedException{
        AccountPage accountPage = homePage.clickAccount();
        accountPage.login("cam5266@gmail.com","123456789");
        accountPage.setShippingAddress("Cameron","John", "Inspired",
                "ZA", "1019 Kretzschmar street", "JHB", "GP", "2093" );
        Assertions.assertTrue(accountPage.successMessageDisplayed(), "The message is not displayed");

    }
    @Test
    public void validate_loginDetails() throws InterruptedException{
        AccountPage accountPage = homePage.clickAccount();
        accountPage.login("cam5266@gmail.com","123456789");
        Assertions.assertEquals("Logout",accountPage.getLogoutText());
    }
}


