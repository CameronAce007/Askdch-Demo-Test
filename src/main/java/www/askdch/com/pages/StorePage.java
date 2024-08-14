package www.askdch.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage extends BasePage {
    private By addCartField = By.xpath("//div//button[@name='add-to-cart']");
    private By searchBarField = By.cssSelector("[class='search-field']");
    private By searchButtonField = By.cssSelector("[value=\"Search\"]");
    private By viewCartField = By.xpath("//div[@class='woocommerce-message']//a[@class='button wc-forward']");

    private By searchButton = By.cssSelector("[value=\"Search\"]");

    private By searchField = By.cssSelector("[class='search-field']");

    private By productName = By.cssSelector("[class='woocommerce-product-gallery__wrapper']");

    public StorePage(WebDriver driver) {
        super(driver);

    }
    public void addToCart(String text) throws InterruptedException {
        searchProduct(text);
        Thread.sleep(3000);
        clickElement(addCartField);
        Thread.sleep(5000);
    }

    public CartPage viewCart(){
        clickElement(viewCartField);
        return new CartPage(driver);

    }

    public void searchProduct(String text) {
        sendKeys(searchField, text);
        clickSearchButton();
    }
    public void clickSearchButton(){
        clickElement(searchButton);
    }
    public boolean isProductDisplayed(){
        return isDisplayed(productName);
    }

}
