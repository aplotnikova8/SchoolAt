package config;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;

public class WebHooks {

    @BeforeEach
    public void initBrowser() {
        Selenide.open("https://www.google.ru/?hl=ru");
    }


}
