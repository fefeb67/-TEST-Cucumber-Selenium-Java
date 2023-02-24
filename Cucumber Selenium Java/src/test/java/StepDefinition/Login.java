package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver;
    @Given("User open URL {string}")
    public void userOpenURL(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }
    @When("User click login in Dashboard Page")
    public void userClickLoginInDashboardPage() {
        driver.findElement(By.xpath("//div[@id='navbarText']/ul/li/a")).click();
    }
    @When("User redirect to Login Page")
    public void userRedirectToLoginPage() {
        driver.findElement(By.xpath("//button[@type='submit ']")).isDisplayed();
    }
    @When("User input email {string}")
    public void user_input_email(String email) {
        driver.findElement(By.id("exampleInputEmail1")).sendKeys(email);
    }
    @When("User input password {string}")
    public void user_input_password(String password) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
    }
    @When("User click login")
    public void user_click_login() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[@type='submit ']")).click();
    }
    @Then("User redirect to homepage")
    public void user_redirect_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
//    @And("User input value of email with {string}")
//    public void userInputValueOfEmailWith(String email) {
//        driver.findElement(By.id("exampleInputEmail1")).sendKeys(email);
//    }
//    @And("User input value of password with {string}")
//    public void userInputValueOfPasswordWith(String password) {
//        driver.findElement(By.id("exampleInputPassword1 ")).sendKeys(password);
//    }

//    @When("User click login button")
//    public void userClickLoginButton() {
//        driver.findElement(By.xpath("//button[@type='submit ']")).click();
//    }

//    @Then("User successfully login")
//    public void userSuccessfullyLogin() {
//        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='products']")).isDisplayed());
//    }
//
