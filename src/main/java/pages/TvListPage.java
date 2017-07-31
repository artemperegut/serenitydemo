package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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

    @FindBy(xpath = "//span[@class='snippet-card__header-text']")
    List<WebElement> tvList;

    @FindBy(xpath = "//h1[@itemprop='name']")
    WebElement tvTitle;

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
        Assert.assertEquals(tvList.size(), number);
    }

    public void rememberTvTitle(int elementNumber) {
        savedValue = tvList.get(elementNumber - 1).getText();
    }

    public void findSavedValue() {
        searchInput.sendKeys(savedValue);
        searchButton.click();
    }

    public void checkElementTitleEqualsSavedValue() {
        Assert.assertEquals(tvTitle.getText(), savedValue);
    }
}