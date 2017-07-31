package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.MarketPage;

public class MarketSteps extends ScenarioSteps {

    MarketPage marketPage;

    @Step("выбран раздел {0}")
    public void selectMenuItemStep(String topMenuItem) {
        marketPage.selectTopMenuItem(topMenuItem);
    }

    @Step("выбран подраздел {0}")
    public void selectCatalogMenuItemStep(String catalogMenuItem) {
        marketPage.selectCatalogMenuItem(catalogMenuItem);
    }
}