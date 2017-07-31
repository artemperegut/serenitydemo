package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TvListPage {

    @FindBy(xpath = "//span[text()='Производитель']/ancestor::div[contains(@class, 'n-filter-block')]")
    WebElement producers;

    @FindBy(xpath = "//span[contains(@class,'input_price_from')]")
    WebElement priceFrom;

    @FindBy(xpath = "//span[contains(text(),'Применить')]")
    WebElement confirmButton;

    public void selectProducer(String itemName) {
        producers.findElement(By.xpath("//label[text()='" + itemName + "']")).click();
    }

    public void fillPriceFrom(String price) {
        priceFrom.sendKeys(price);
    }

    public void confirm() {
        confirmButton.click();
    }

    public void checkTvList() {
        Assert.assertEquals(ThucydidesWebDriverSupport.getDriver().findElements(By.xpath("//span[@class='snippet-card__header-text']")).size(), 12);
    }
}