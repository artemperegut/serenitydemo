import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.BaseSteps;
import steps.DMSSteps;
import steps.MainPageSteps;
import steps.SendAppSteps;


import java.util.HashMap;

/**
 * Created by Maria on 29.07.2017.
 */

@RunWith(SerenityRunner.class)
public class InsuranceTest extends BaseSteps {
    @Steps
    MainPageSteps mainPageSteps;

    @Steps
    DMSSteps dmsSteps;

    @Steps
    SendAppSteps sendAppSteps;

    HashMap<String, String> testData = new HashMap<>();


    @Title("Заявка на ДМС")
    @Test
    public void Test(){
        testData.put("Имя","Иван");
        testData.put("Фамилия","Иванов");
        testData.put("Отчество","Иванович");
        testData.put("Регион","Москва");
        testData.put("Телефон","9191111112");
        testData.put("Эл. почта","teststststs");
        testData.put("Дата контакта","10.10.2017");
        testData.put("Комментарии","Autotest");

        mainPageSteps.selectMenuItem("Страхование");
        mainPageSteps.selectMenuInsurance("ДМС");
        dmsSteps.checkPageTitle("Добровольное медицинское страхование");
        dmsSteps.goToSendAppPage();
        sendAppSteps.checkPageTitle("Заявка на добровольное медицинское страхование");

        sendAppSteps.fillFields(testData);

        testData.put("Телефон","+7 (919) 111-11-12");
        sendAppSteps.checkFillFields(testData);
        sendAppSteps.checkErrorMessageField("Эл. почта", "Введите адрес электронной почты");
    }
}
