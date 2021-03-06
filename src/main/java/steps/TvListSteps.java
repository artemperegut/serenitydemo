package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.TvListPage;

public class TvListSteps extends ScenarioSteps {

    TvListPage tvListPage;

    @Step("выбран производитель {0}")
    public void selectProducerStep(String producer) {
        tvListPage.selectProducer(producer);
    }

    @Step("выбрана цена от {0}")
    public void fillPriceFromStep(String priceFrom) {
        tvListPage.fillPriceFrom(priceFrom);
    }

    @Step("нажата кнопка \"Применить\"")
    public void confirmStep() {
        tvListPage.confirm();
    }

    @Step("количество найденных товаров равно {0}")
    public void checkTvListStep(int number) {
        tvListPage.checkTvList(number);
    }

    @Step("запоминает {0} элемент списка")
    public void rememberTvTitleStep(int elementNumber) {
        tvListPage.rememberTvTitle(elementNumber);
    }

    @Step("ищет запомненный элемент из списка")
    public void findSavedValueStep() {
        tvListPage.findSavedValue();
    }

    @Step("проверяет, что наименование товара соответствует запомненному значению")
    public void checkElementTitleEqualsSavedValueStep() {
        tvListPage.checkElementTitleEqualsSavedValue();
    }
}
