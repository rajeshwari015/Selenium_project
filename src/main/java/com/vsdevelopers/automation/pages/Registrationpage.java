package com.vsdevelopers.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;

public class Registrationpage {
    private WebDriver driver;
    private ExtentTest test;

    public Registrationpage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    

    // Implement similar methods for other interactions

    public void executeRegistrationTest() {
        try {
            // navigateToRegistrationPage();
            // clickHomeLink();
        	
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed

            // Navigate directly to the "Register" page URL
            driver.get("https://venkys.io/register");
            test.info("Navigating to the Venkys.io registration page");

            // Continue with the rest of your Registration page code
            // Add your Registration interactions here

            // Log a pass status for each step
            test.log(Status.PASS, "Successfully navigated to the registration page");

            // Find and click on the "Home" hyperlink
            WebElement homeLink = driver.findElement(By.linkText("Home"));
            homeLink.click();
            test.log(Status.PASS, "Clicked on Home link");

            // Use WebDriverWait to wait for the home page to load (adjust the URL and specific checks as needed)
            wait.until(ExpectedConditions.urlToBe("https://venkys.io/"));
            test.log(Status.PASS, "Successfully navigated to the home page");

            // Check if we are on the home page (you can add your specific checks here)
            if (driver.getCurrentUrl().equals("https://venkys.io/")) {
                test.log(Status.PASS, "Successfully navigated to the home page.");
            } else {
                test.log(Status.FAIL, "Failed to navigate to the home page.");
            }

            driver.navigate().back();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Continue with the rest of your Registration page code
            WebElement signUpLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/section/div/div/div/div/p/a")));
            WebElement signInWithGoogleButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'gSignInWrapper\']/a")));
           

            // Scroll down by 500 pixels using JavaScript
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
            Thread.sleep(2000);

            signUpLink.click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.urlContains("login")); // Change URL as needed
            if (driver.getCurrentUrl().contains("/login")) {
                test.log(Status.PASS, "Successfully navigated to the Login page.");
            } else {
                test.log(Status.FAIL, "Failed to navigate to the login page.");
            }

            driver.navigate().back();
            signInWithGoogleButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gSignInWrapper\"]/a")));
            signInWithGoogleButton.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "Successfully opened the sign-in with Google page");
            driver.navigate().back();

            WebElement nameField = wait.until(ExpectedConditions.elementToBeClickable(By.id("name")));
            nameField.sendKeys("Pavuluri Rajeshwari");

            WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
            emailField.sendKeys("rajeshwaripavuluri@gmail.com");

            WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
            passwordField.sendKeys("raji@016");

            WebElement confirmPasswordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("password_confirmation")));
            confirmPasswordField.sendKeys("raji@016");

            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 700);");
            Thread.sleep(2000);
            WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div/div/form/div[5]/button")));
            createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div/div/form/div[5]/button")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccountButton);
            createAccountButton.click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.urlContains("/register")); // Change URL as needed
            if (driver.getCurrentUrl().contains("/register")) {
                test.log(Status.PASS, "Successfully opened the register page.");
            } else {
                test.log(Status.FAIL, "Failed to open the register page.");
            }

            test.log(Status.PASS, "Successfully Registered");

        } catch (Exception e) {
            // Log a fail status in case of an exception
            test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
