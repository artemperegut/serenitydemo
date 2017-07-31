package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by Maria on 06.05.2017.
 */
public class DMSPage extends BasePageObject{


    @FindBy(xpath = "//*[@class='page-header']/*")
    public WebElement title;

    @FindBy(xpath = "//*[contains(text(),'Отправить заявку')][contains(@class,'btn')]")
    public WebElement sendAppBtn;
}
