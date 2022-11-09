package implementation.stepDefinitions;

import implementation.utilities.ConfigurationReader;
import implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class EtsyVerification {

    @Given("User enter the Etsy page")
    public void user_enter_the_etsy_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Then("User should see Etsy title")
    public void user_should_see_etsy_title() {

        assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone",
                Driver.getDriver().getTitle());

        Driver.closeDriver();


    }



}
