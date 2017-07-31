import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.BaseSteps;
import steps.MarketSteps;
import steps.TvListSteps;
import steps.YandexSteps;

@RunWith(SerenityRunner.class)
public class YandexMarketTest extends BaseSteps {

    @Steps
    MarketSteps marketSteps;

    @Steps
    TvListSteps tvListSteps;

    @Steps
    YandexSteps yandexSteps;

    @Title("Тестирование Яндекс.Маркет")
    @Test
    public void test() {

        yandexSteps.selectTabStep("Маркет");
        marketSteps.selectMenuItemStep("Электроника");
        marketSteps.selectCatalogMenuItemStep("Телевизоры");
        tvListSteps.fillPriceFromStep("20000");
        tvListSteps.selectProducerStep("Samsung");
        tvListSteps.selectProducerStep("LG");
        tvListSteps.confirmStep();
        tvListSteps.checkTvListStep(12);
        tvListSteps.rememberTvTitleStep(1);
        tvListSteps.findSavedValueStep();

    }
}