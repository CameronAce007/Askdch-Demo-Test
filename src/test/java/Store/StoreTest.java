package Store;

import Base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import www.askdch.com.pages.AccountPage;
import www.askdch.com.pages.StorePage;


public class StoreTest extends BaseTest {
    @Test
    public void validate_searchProduct(){
        AccountPage accountPage = homePage.clickAccount();
        accountPage.login("cam5266@gmail.com","123456789");
        StorePage storePage = accountPage.clickBrowserProduct();
        storePage.searchProduct("Blue Shoes");
        Assertions.assertTrue(storePage.isProductDisplayed(),"Product was not found");
    }

}
