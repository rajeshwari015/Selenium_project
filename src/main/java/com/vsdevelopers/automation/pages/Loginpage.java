package com.vsdevelopers.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;

public class Loginpage {
    private WebDriver driver;
    private ExtentTest test;

    public Loginpage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public void executeLoginTest() {
        try {
            // Navigate to the Venkys.io login page
            driver.get("https://venkys.io/login");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// Adjust the timeout as needed

            // Log test steps and results using Extent Reports
            test.info("Navigating to the Venkys.io login page");

            // Continue with the rest of your login page code

            WebElement homeLink = driver.findElement(By.linkText("Home"));
            homeLink.click();
            test.log(Status.PASS, "Clicked on Home link");

            // Use WebDriverWait to wait for the home page to load (adjust the URL and specific checks as needed)
            wait.until(ExpectedConditions.urlToBe("https://venkys.io/")); // Change URL as needed

            // Check if we are on the home page (you can add your specific checks here)
            if (driver.getCurrentUrl().equals("https://venkys.io/")) {
                test.log(Status.PASS, "Successfully navigated to the home page.");
            } else {
                test.log(Status.FAIL, "Failed to navigate to the home page.");
            }

            // Navigate back to the videos page
            driver.navigate().back();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Use WebDriverWait to wait for the "Sign Up" link to be clickable and then click it

            WebElement signUpLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/section/div/div/div/div/form/p/a")));
            WebElement signInWithGoogleButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'gSignInWrapper\']/a")));
            WebElement forgotPasswordLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/section/div/div/div/div/form/a")));
            WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/section/div/div/div/div/form/div[3]/button")));
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");

            Thread.sleep(2000);

            signUpLink.click();
            Thread.sleep(2000);

            // Use WebDriverWait to wait for the sign-up page to load
            wait.until(ExpectedConditions.urlContains("/register")); // Change URL as needed

            // Check if we are on the sign-up page (you can add your specific checks here)
            if (driver.getCurrentUrl().contains("/register")) {
                test.log(Status.PASS, "Successfully navigated to the sign-up page.");
            } else {
                test.log(Status.FAIL, "Failed to navigate to the sign-up page.");
            }

            // Navigate back to the login page
            driver.navigate().back();
            signInWithGoogleButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'gSignInWrapper\']/a")));

            // Wait for the elements to be clickable again (timeout: 10 seconds)
            signInWithGoogleButton.click();

            // Sleep for a moment to allow the Google Sign In page to load
            Thread.sleep(2000);
            test.log(Status.PASS, "Successfully opened the sign-in with Google page");
            driver.navigate().back();

            // Continue with the rest of your login page code
            // Find the email input field and enter the email

            WebElement emailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
            emailField.sendKeys("rajeshwaripavuluri@gmail.com");

            // Find the password input field and enter the password

            WebElement passwordField = wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
            passwordField.sendKeys("raji@016");

            Thread.sleep(5000);

            // Find the "Forgot Password" hyperlink and click it
            forgotPasswordLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/section/div/div/div/div/form/a")));
            forgotPasswordLink.click();
            Thread.sleep(2000);

            // Wait for the "Forgot Password" page to load
            wait.until(ExpectedConditions.urlContains("/reset")); // Change URL as needed

            // Check if we are on the "Forgot Password" page (add your specific checks if needed)
            if (driver.getCurrentUrl().contains("/reset")) {
                test.log(Status.PASS, "Successfully opened the forgot password page.");
            } else {
                test.log(Status.FAIL, "Failed to open the forgot password page.");
            }

            // Navigate back to the login page
            driver.navigate().back();

            // Wait for the elements to be clickable again (timeout: 10 seconds)

            // Find the Sign In button and click it
            signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/section/div/div/div/div/form/div[3]/button")));
            signInButton.click();
            Thread.sleep(2000);

            test.log(Status.PASS, "Successfully logged In ");
            
            

            // Continue with the rest of your code for sign-in interactions
        } catch (Exception e) {
            e.printStackTrace();
            test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
        } 
    }
}
