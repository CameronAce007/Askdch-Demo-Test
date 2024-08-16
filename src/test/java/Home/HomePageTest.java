package homePage;

import Base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomePageTest extends BaseTest {
    @Test

    public void validate_HomeTitle(){
        Assertions.assertEquals("AskOmDch – Become a Selenium automation expert!",homePage.getHomeTitle());
    }

}
