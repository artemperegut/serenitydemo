package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TvListPage extends BasePageObject {

    static String savedValue;

    @FindBy(xpath = "//span[text()='Производитель']/ancestor::div[contains(@class, 'n-filter-block')]")
    WebElement producers;

    @FindBy(id = "glf-pricefrom-var")
    WebElement priceFrom;

    @FindBy(xpath = "//span[contains(text(),'Применить')]/..")
    WebElement confirmButton;

    @FindBy(id = "header-search")
    WebElement searchInput;

    @FindBy(xpath = "//span[@class='search2__button']/button")
    WebElement searchButton;

    public void selectProducer(String itemName) {
        producers.findElement(By.xpath("//label[text()='" + itemName + "']")).click();
    }

    public void fillPriceFrom(String price) {
        priceFrom.sendKeys(price);
    }

    public void confirm() {
        confirmButton.click();
    }

    public void checkTvList(int number) {
        Assert.assertEquals(ThucydidesWebDriverSupport.getDriver().findElements(By.xpath("//span[@class='snippet-card__header-text']")).size(), number);
    }

    public void rememberTvTitle(int elementNumber) {
        savedValue = ThucydidesWebDriverSupport.getDriver().findElements(By.xpath("//span[@class='snippet-card__header-text']")).get(elementNumber - 1).getText();
    }

    public void findSavedValue() {
        searchInput.sendKeys(savedValue);
        searchButton.click();
    }
}