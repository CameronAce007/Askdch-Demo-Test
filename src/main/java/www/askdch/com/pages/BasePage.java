package www.askdch.com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    // Declaring Variables for all methods
    // WebDriver instance
    WebDriver driver;
    protected Select select;

    // Constructor to initialize the WebDriver
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click an element located by the given locator
    public void clickElement(By locator) {
        findElement(locator).click();
    }

    // Method to find an element using the given locator
    public WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    // Method to send keys to an element located by the given locator
    public void sendKeys(By locator, String text) {
        findElement(locator).sendKeys(text);
    }

    // Method to check if an element located by the given locator is displayed
    public boolean isDisplayed(By locator) {
        return findElement(locator).isDisplayed();
    }

    // Method to get the attribute of an element located by the given locator
    public String getAttribute(By locator, String attribute) {
        return findElement(locator).getAttribute(attribute);
    }

    // Method to get the text of an element located by the given locator
    public String getText(By locator) {
        return findElement(locator).getText();
    }

    // Method to validate and return the page title
    public String validatePageTitle() {
        return driver.getTitle();
    }
    public Select selectFromDropDown(By locator){
        select = new Select(findElement(locator));
        return select;
    }
    public Alert switchToAlert(){
        return driver.switchTo().alert();
    }

    public void clear(By locator){
        findElement(locator).clear();
    }
}
