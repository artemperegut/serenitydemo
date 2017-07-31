package steps;

import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Maria on 29.07.2017.
 */

public class BaseSteps {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void beforeMethod(){
        driver.get(System.getProperty("app.url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @After
    public void afterMethod(){
        driver.quit();
    }

}
