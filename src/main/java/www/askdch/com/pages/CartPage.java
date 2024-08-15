package www.askdch.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    private By productField = By.xpath("//tbody//a/img[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']");
    private By checkoutField = By.cssSelector("[class='wc-proceed-to-checkout']");
    private By quanityField = By.cssSelector("[name='cart[a4d2f0d23dcc84ce983ff9157f8b7f88][qty]']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle(){
        return validatePageTitle();
    }

    public boolean isProductDisplayedInCart(){
        return isDisplayed(productField);
    }

    public void setQuantity(String text){
        clear(quanityField);
        sendKeys(quanityField, text);
    }
    public CheckoutPage clickCheckoutButton() {
        clickElement(checkoutField);
        return new CheckoutPage(driver);
    }


}

