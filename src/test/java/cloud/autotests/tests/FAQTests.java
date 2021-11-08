package cloud.autotests.tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


@Feature("FAQ")
public class FAQTests extends TestBase {

    @Test
    @AllureId("5709")
    @Description("Test for empty request on FAQ page")
    @DisplayName("Test for empty request on FAQ page")
    void emptyRequestTest() {
        step("Open url 'https://www.sberbank.ru/ru/person/help'", () ->
                open("https://www.sberbank.ru/ru/person/help"));


        step("Find Search field", () -> {
            $("#ya-site-form0").click();
        });

        step("Press Find button", () -> {
            $x("//*[@id=\"ya-site-form0\"]//td[2]").click();
            $x("//*[@id=\"ya-site-results\"]").shouldHave(Condition.text("Задан пустой поисковый запрос"));
        });

    }

    @Test
    @AllureId("5708")
    @Description("Test for Debit card request on FAQ page")
    @DisplayName("Test for Debit card request on FAQ page")
    void debitCardRequestTest() {
        step("Open url 'https://www.sberbank.ru/ru/person/help'", () ->
                open("https://www.sberbank.ru/ru/person/help"));


        step("Find Search field", () -> {
            $("#ya-site-form0").click();
        });

        step("Enter search request Debit card", () -> {
            $x("//*[@id=\"ya-site-form0\"]//input").sendKeys("дебетовая карта");
        });


        step("Press Find button", () -> {
            $x("//*[@id=\"ya-site-form0\"]//td[2]").click();
            $x("//*[@id=\"ya-site-results\"]").shouldHave(Condition.text("Популярные вопросы о дебетовых картах"));
        });

    }

    @Test
    @AllureId("5729")
    @Description("Test for Credit card request on FAQ page")
    @DisplayName("Test for Credit card request on FAQ page")
    void creditCardRequestTest() {
        step("Open url 'https://www.sberbank.ru/ru/person/help'", () ->
                open("https://www.sberbank.ru/ru/person/help"));


        step("Find Search field", () -> {
            $("#ya-site-form0").click();
        });

        step("Enter search request Credit card", () -> {
            $x("//*[@id=\"ya-site-form0\"]//input").sendKeys("кредитная карта");
        });


        step("Press Find button", () -> {
            $x("//*[@id=\"ya-site-form0\"]//td[2]").click();
            $x("//*[@id=\"ya-site-results\"]").shouldHave(Condition.text("Вопросы о кредитных картах"));
        });

    }
}