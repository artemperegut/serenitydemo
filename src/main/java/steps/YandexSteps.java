package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.YandexPage;

public class YandexSteps extends ScenarioSteps {

    YandexPage yandexPage;

    @Step("выбран один из сервисов Яндекса: {0}")
    public void selectTabStep(String tabName) {
        yandexPage.selectTab(tabName);
    }
}