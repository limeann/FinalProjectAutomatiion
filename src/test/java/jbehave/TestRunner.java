package jbehave;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Driver;




public class TestRunner extends SerenityStories {


    private WebDriver driver;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    private String browser;


    @BeforeStory
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        Driver.setDriver(driver);
    }

    @AfterStory
    public void afterHook() {
        Driver.getDriver().quit();
    }
}
