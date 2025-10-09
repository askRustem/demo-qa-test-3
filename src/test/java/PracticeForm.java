import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {

    @BeforeAll
    static void congiguration() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";

    }

    @Test
    void positiveTest() {

        open("/automation-practice-form");
        executeJavaScript("document.body.style.zoom='50%'");
        $("#firstName").setValue("Rustem");
        $("#lastName").setValue("Askerov");
        $("#userEmail").setValue("example@exaple.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("3312390123");

        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("1997");
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("November");
        $(".react-datepicker__day.react-datepicker__day--025").click();


        $("#subjectsInput")
                .setValue("A")
                .pressEnter();
        $("#hobbiesWrapper")
                .$(byText("Sports"))
                .click();
        $("#uploadPicture").uploadFromClasspath("test.png");
        $("#currentAddress").setValue("MyCurrentAddress");
        $("#state").click();
        $("#react-select-3-input")
                .setValue("NCR")
                .pressEnter();
        $("#city").click();
        $("#react-select-4-input")
                .setValue("Delhi")
                .pressEnter();
        $("#submit").click();


        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $("div.table-responsive").shouldHave(text("Rustem Askerov"));
        $("div.table-responsive").shouldHave(text("example@exaple.com"));
        $("div.table-responsive").shouldHave(text("Male"));
        $("div.table-responsive").shouldHave(text("3312390123"));
        $("div.table-responsive").shouldHave(text("25 November,1997"));
        $("div.table-responsive").shouldHave(text("Maths"));
        $("div.table-responsive").shouldHave(text("Sports"));
        $("div.table-responsive").shouldHave(text("test.png"));
        $("div.table-responsive").shouldHave(text("MyCurrentAddress"));
        $("div.table-responsive").shouldHave(text("NCR Delhi"));


    }
}
