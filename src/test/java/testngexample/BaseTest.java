package testngexample;

import com.qalabs.seleniumbasics.WebDriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver myDriver;
<<<<<<< HEAD
    @BeforeClass (alwaysRun= true)
    public void setUp(){
        //Define which browser to use
        String browser = "chrome";

        //Get correct driver for desire browser
        myDriver = WebDriverFactory.getDriver(browser);

    }
    @AfterClass(alwaysRun = true)
=======
    @BeforeClass (alwaysRun=true)
    public void setup(){
        //define which browser to use
        String browser= "chrome";
        //get corrent driver for disere browser
        myDriver= WebDriverFactory.getDriver(browser);
    }
    @AfterClass (alwaysRun=true)
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
    public void tearDown(){
        myDriver.close();
        myDriver.quit();
    }
}
