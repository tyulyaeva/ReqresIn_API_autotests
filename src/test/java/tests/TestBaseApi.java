package tests;

import com.codeborne.selenide.Configuration;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;
import java.util.UUID;

public class TestBaseApi extends TestData{

    @BeforeAll
    static void setupConfig() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.of(
                "enableVNC", true,
                "enableVideo", true,
                "name", "Test: " + UUID.randomUUID()
        ));
        Configuration.browserCapabilities = capabilities;
    }
}
