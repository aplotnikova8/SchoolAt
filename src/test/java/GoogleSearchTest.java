import config.WebHooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.GoogleResultsPage;
import pages.GoogleSearchPage;

public class GoogleSearchTest extends WebHooks {

    private final GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    private final GoogleResultsPage googleResultsPage = new GoogleResultsPage();
    private final String searchRequest = "java";
    private final String resultLink = "https://www.java.com/ru/";

    @Test
    public void checkFirstResultWithJunitAssertionsTest() {
        googleSearchPage.findInfoAbout(searchRequest);
        Assertions.assertEquals(searchRequest, googleResultsPage.getFirstResultText());
    }


    @Test
    public void checkFirstResultLinkWithJunitAssertionsTest() {
        googleSearchPage.findInfoAbout(searchRequest);
        Assertions.assertEquals(resultLink, googleResultsPage.getFirstResultLink());
    }

    @Test
    public void checkFirstResultTest() {
        googleSearchPage
                .findInfoAboutUsingSelenideMethods(searchRequest)
                .checkFirstResultContainsText(searchRequest);
    }

    @Test
    public void checkFirstResultContainsLink() {
        googleSearchPage.findInfoAbout(searchRequest);
        googleResultsPage
                .checkFirstResultContainsText(searchRequest)
                .checkResultHasALink(resultLink);
    }

    @Test
    public void checkResultsLoaded() {
        googleSearchPage
                .findInfoAboutUsingSelenideMethods(searchRequest)
                .checkResultsLoaded()
                .checkFirstResultContainsText(searchRequest);
    }

}
