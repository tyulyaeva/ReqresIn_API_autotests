package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.Keys.BACK_SPACE;
import static org.openqa.selenium.Keys.SPACE;

public class SearchTests {

    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.pageLoadStrategy ="eager";
    }

    @AfterEach
    void closeWebDriver(){
        Selenide.closeWebDriver();
    }

    @Test
    void fillFormTest() {
        open("automation-practice-form");
        $("#firstName").setValue("Инна");
        $("#lastName").setValue("Тюляева");
        $("#userEmail").setValue("tyulyaeva.inna@yandex.ru");
        $("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label").click();
        $("#userNumber").setValue("9178332203");
        $("[id=dateOfBirthInput]").sendKeys(Keys.CONTROL + "A");
        $("[id=dateOfBirthInput]").sendKeys(SPACE);
        $("#dateOfBirthInput").setValue("20 Jul 1991").pressEnter();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $("#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(2) > label").click();

        $("#uploadPicture").uploadFromClasspath("retouch.jpg");
        $("#currentAddress").setValue("Санкт-Петербург, п. Парглово").pressEnter();
        $("#react-select-3-input").setValue("Uttar Pradesh").pressEnter();
        $("#react-select-4-input").setValue("Agra").pressEnter();
        $("#submit").click();

        sleep(5000);
    }
}