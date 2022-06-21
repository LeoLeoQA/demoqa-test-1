import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestBox {
    @BeforeAll
    static void BeforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successfulTest(){
        open ("/text-box");
        $("[id=userName").setValue("LeoQA");
        $("[id=userEmail").setValue("zotkinly99@mail.ru");
        $("[id=currentAddress").setValue("Some address 1");
        $("[id=permanentAddress").setValue("Another address");
        $("[id=submit").click();

        $("id=userName").shouldHave(text("LeoQA"));
        $("id=userEmail").shouldHave(text("zotkinly99@mail.ru"));
        $("id=currentAddress").shouldHave(text("Some address 1"));
        $("id=permanentAddress").shouldHave(text("Another address"));

    }
}
