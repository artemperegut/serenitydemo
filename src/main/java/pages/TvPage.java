package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TvPage {

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
}