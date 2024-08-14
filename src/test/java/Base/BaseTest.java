package Base;

// Importing necessary libraries and classes
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import www.askdch.com.pages.HomePage;

public class BaseTest {
    protected static HomePage homePage;
    // URL of the website to be tested
    static String url = "https://askomdch.com/";

    // WebDriver instance
    static WebDriver driver;

    // Method annotated with @BeforeAll to set up the WebDriver before any tests run
    @BeforeAll
    public static void setUpDriver() {
        // Setting up the ChromeDriver using WebDriverManager
        WebDriverManager.edgedriver().setup();

        // Initializing the WebDriver with a new instance of ChromeDriver
        driver = new EdgeDriver();

        // Navigating to the specified URL
        driver.get(url);
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
    }
    @AfterAll
    public static void closeBrowser(){
//        driver.close();
    }
}

