package www.askdch.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    private By productField = By.xpath("//tbody//a/img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle(){
        return validatePageTitle();
    }


    public boolean isProductDisplayedInCart(){
        return isDisplayed(productField);
    }

}

