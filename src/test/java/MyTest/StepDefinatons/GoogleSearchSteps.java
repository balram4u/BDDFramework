package MyTest.StepDefinatons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {
    WebDriver driver=null;
    @Given("Browser is open")
    public void browser_is_open() throws InterruptedException {
        System.out.println("Browser is open");
        System.setProperty("webdriver.chrome.driver" ,"/Users/balarambera/Documents/Test/BDDFramework/src/Drivers/chromedriver");
        Thread.sleep(2000);
        System.out.println("Loading of browser");
        driver=new ChromeDriver();
        System.out.println("Maximise  browser");
        driver.manage().window().maximize();
    }

    @When("we navigate to the MakeMyTrip homepage")
    public void we_navigate_to_the_make_my_trip_homepage() {
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
    }

    @Then("validating the title of the page")
    public void validating_the_title_of_the_page() {

    }


}
