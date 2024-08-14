package www.askdch.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By accountField = By.cssSelector("#menu-item-1237");
    public HomePage(WebDriver driver) {
        super(driver);
    }
        public String getHomeTitle () {
            return driver.getTitle();
        }
    public AccountPage clickAccount() {
        clickElement(accountField);
        return new AccountPage(driver);
    }

}

