package www.askdch.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Text;

public class AccountPage extends BasePage{
    // Locators for elements on the HomePage
    By username = By.cssSelector("#reg_username");
    By emailAddress = By.xpath("//input[@id='reg_email']");
    By password = By.cssSelector("#reg_password");
    By registerField = By.cssSelector("[name='register']");
    By userNameOrEmailAddressField = By.cssSelector("#username");
    By passwordField = By.cssSelector("#password");
    By loginField = By.cssSelector("[value='Log in']");
    By logoutField = By.xpath("//li//a[contains(text(),'Logout')]");
    By ordersField = By.xpath("//li//a[contains(text(), 'Orders')]");
    By browserProductField = By.xpath("//div//a[contains(text(), 'Browse products')]");
    By addressField = By.xpath("//li//a[contains(text(), 'Addresses')]");
    By addShippingAddressField = By.xpath("//div[@class='u-column2 col-2 woocommerce-Address']//header//a[@class='edit']");
    By firstNameField = By.cssSelector("#shipping_first_name");
    By lastNameField = By.cssSelector("#shipping_last_name");
    By companyNameField = By.cssSelector("#shipping_company");
    By countryField = By.cssSelector("[name='shipping_country']");
    By streetAddressField = By.cssSelector("[name='shipping_address_1']");
    By cityField = By.cssSelector("[name='shipping_city']");
    By stateField = By.cssSelector("[name='shipping_state']");
    By zipCodeField = By.cssSelector("[name='shipping_postcode']");
    By saveAddressField = By.name("save_address");
    By successfulAddressField = By.xpath("//div[@class='woocommerce-message']");
    // Constructor to initialize the WebDriver
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    // Method to click on the username field
    public void setUsername(String text) {
        sendKeys(username,text);

    }
    // Method to click on the email address field
    public void setEmailAddress(String text) {
        sendKeys(emailAddress,text);

    }
    // Method to click on the password field
    public void setPassword(String text) {
        sendKeys(password,text);

    }
    public void clickRegister() {
        clickElement(registerField);

    }
    public String getLogoutText(){
        return getText(logoutField);

    }

    public StorePage clickBrowserProduct(){
        clickElement(ordersField);
        clickElement(browserProductField);
        return new StorePage(driver);
    }

    public String getStoreTitle(){
        return validatePageTitle();
    }
    private void clickAddresses(){
        clickElement(addressField);
        clickElement(addShippingAddressField);
    }

    public boolean successMessageDisplayed(){
        return isDisplayed(successfulAddressField);
    }

    public void  setShippingAddress(String firstName,  String lastName, String companyName, String value, String streetAddress, String city, String state, String zipCode ) throws InterruptedException {
        clickAddresses();
        sendKeys(firstNameField, firstName);
        sendKeys(lastNameField, lastName);
        sendKeys(companyNameField, companyName);
        selectFromDropDown(countryField).selectByValue(value);
        sendKeys(streetAddressField, streetAddress);
        sendKeys(cityField, city);
        selectFromDropDown(stateField).selectByValue(state);
        sendKeys(zipCodeField, zipCode);
        clickElement(saveAddressField);
    }
    public void login(String emailAddress, String password){
        sendKeys(userNameOrEmailAddressField, emailAddress);
        sendKeys(passwordField, password);
        clickElement(loginField);
    }

}


