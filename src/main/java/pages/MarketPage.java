package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MarketPage extends BasePageObject {

    @FindBy(xpath = "//ul[@class='topmenu__list']")
    WebElement topMenuItems;

    @FindBy(xpath = "//div[@class='catalog-menu i-bem catalog-menu_js_inited']")
    WebElement catalogMenuItems;

    public void selectTopMenuItem(String itemName) {
        topMenuItems.findElement(By.xpath("//li[@data-department='" + itemName + "']")).click();
    }

    public void selectCatalogMenuItem(String itemName) {
        catalogMenuItems.findElement(By.xpath("//div[@class='catalog-menu__list']/a[contains(text(),'" + itemName + "')]")).click();
    }
}