package stepDefinations;

import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefination {
    public WebDriver driver;
    public LoginPage Ip;


    @Given("User Launch chrome browser")
    public void user_launch_chrome_browser() {
        System.out.println("The starting of browser");
        System.setProperty("webdriver.chrome.driver" ,"/Users/balarambera/Documents/Test/BDDFramework/src/Drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver" ,"/Users/balarambera/Documents/Test/BDDFramework/src/Drivers/chromedriver");
        System.out.println("Loading of browser");
        driver=new ChromeDriver();
        driver.get("http://10.10.0.197:8080/admin");
        System.out.println("Maximise  browser");
        driver.manage().window().maximize();
        Ip=new LoginPage(driver);
    }

    @When("User opens URL {string}")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
        Ip.setUserName(email);
        Ip.setPassword(password);
    }

    @When("Click on Login")
    public void click_on_login() {
        Ip.clickLogin();
    }

    @Then("Page title Should be\"Dashboard \\/ nopCommerce administration\"")
    public void page_title_should_be_dashboard_nop_commerce_administration() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String title) {
        if(driver.getPageSource().contains("Login was Unsuccessfully."))
        {
            driver.close();
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertEquals(title,driver.getTitle());
        }
    }
    @When("User click on Log out link")
    public void user_click_on_log_out_link() throws InterruptedException {
        Ip.clickLogout();
    }
    @Then("close browser")
    public void close_browser() {
        driver.quit();
    }

}
