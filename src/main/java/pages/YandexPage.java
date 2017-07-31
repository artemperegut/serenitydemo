package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class YandexPage extends BasePageObject {

    @FindBy(xpath = "//div[@role='navigation']")
    WebElement navigationTabs;

    public void selectTab(String itemName) {
        navigationTabs.findElement(By.xpath("//a[text()='" + itemName + "']")).click();
    }
}