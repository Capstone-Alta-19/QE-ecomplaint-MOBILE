package starter.stepdefinitions;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static starter.stepdefinitions.DriverHook.driver;

public class StepDefinitions {
    @Given("Aplikasi Wikipedia terbuka")
    public void openWikipediaApp() {
        assertEquals("org.wikipedia", driver.getCurrentPackage());
    }

    @And("Skip pemilihan bahasa")
    public void skipLanguageChoser() {
        WebElement skipButton = driver.findElement(AppiumBy.id("org.wikipedia:id/fragment_onboarding_skip_button"));
        skipButton.click();
    }

    @And("Klik search bar")
    public void clickSearchBar() {
        WebElement searchField = driver.findElement(AppiumBy.id("org.wikipedia:id/search_container"));
        searchField.click();
    }

    @And("Ketik {string} dan tekan enter")
    public void inputSearchKeyword(String keyword) {
        WebElement searchFieldInput = driver.findElement(AppiumBy.id("org.wikipedia:id/search_src_text"));
        searchFieldInput.sendKeys(keyword);
    }

    @And("Pilih hasil yang pertama")
    public void chooseFirstResult() {
        WebElement firstResult = driver.findElement(AppiumBy.xpath("(//*[@resource-id='org.wikipedia:id/page_list_item_title'])[1]"));
        firstResult.click();
    }

    @Then("Artikel tentang {string} sudah muncul")
    public void cucumberArticleShowedUp(String keyword) {
        WebElement articleDescription = driver.findElement(AppiumBy.xpath("//*[@resource-id='pcs-edit-section-title-description']"));
        String judulArtikel = articleDescription.getText();
        switch (keyword.toUpperCase()) {
            case "QUALITY ASSURANCE ENGINEER":
                assertEquals("Ways of ensuring the quality of a service or product", judulArtikel);
                break;
            case "YOGYAKARTA":
                assertEquals("Capital of the Special Region of Yogyakarta, Indonesia", judulArtikel);
                break;
            default:
                break;
        }

    }
}
