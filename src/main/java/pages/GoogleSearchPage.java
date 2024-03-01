package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class GoogleSearchPage {

    private final SelenideElement searchInput = $x("//textarea[@title='Поиск']");
    private final SelenideElement searchButton = $x("//input[contains(@value,'Поиск в ')]");

    public void findInfoAbout(String searchRequest) {
        searchInput.shouldBe(Condition.visible)
                .sendKeys(searchRequest);
        searchButton.click();
    }

    public GoogleResultsPage findInfoAboutUsingSelenideMethods(String searchRequest) {
        searchInput.shouldBe(Condition.visible)
                .sendKeys(searchRequest);
        searchButton.click();
        return page(GoogleResultsPage.class);
    }

}
