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

public class Videospage {
    private WebDriver driver;
    private ExtentTest test;

    public Videospage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public void executeVideoTest() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// Adjust the timeout as needed

            // Navigate to the target web page
            driver.get("https://venkys.io/videos");

            // Log test steps and results using Extent Reports
            test.info("Navigating to the Venkys.io videos page");

            // Continue with the rest of your video page code
            // Add your video interactions here

            // Log a pass status for each step
            test.log(Status.PASS, "Successfully navigated to the videos page");

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

            // Navigate back to the videos page
            driver.navigate().back();

            // Wait for the elements to be clickable again (timeout: 10 seconds)
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Continue with the rest of your code for video interactions

            // Find the video1 element to be clicked using an XPath locator
            WebElement elementToClick_vid1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/div[3]/div/div/div[1]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Find the video2 element to be clicked using an XPath locator
            WebElement elementToClick_vid2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/div[3]/div/div/div[2]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Find the video3 element to be clicked using an XPath locator
            WebElement elementToClick_vid3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/div[3]/div/div/div[3]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Find the video4 element to be clicked using an XPath locator
            WebElement elementToClick_vid4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/div[3]/div/div/div[4]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Find the video5 element to be clicked using an XPath locator
            WebElement elementToClick_vid5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/div[3]/div/div/div[5]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Scroll down by 500 pixels using JavaScript
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 700);");

            // Add a delay to allow the page to load (adjust as needed)
            Thread.sleep(2000);

            // Perform the click action on video1
            elementToClick_vid1.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            test.log(Status.PASS, "Successfully opened video1.");

            // Navigate back to the original page
            driver.navigate().back();

            // Wait for the video2 element to be clickable again
            elementToClick_vid2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/div[3]/div/div/div[2]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Perform the click action on video2
            elementToClick_vid2.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            test.log(Status.PASS, "Successfully opened video2.");

            // Navigate back to the original page
            driver.navigate().back();

            // Wait for the video3 element to be clickable again
            elementToClick_vid3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/div[3]/div/div/div[3]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Perform the click action on video3
            elementToClick_vid3.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            test.log(Status.PASS, "Successfully opened video3.");

            // Navigate back to the original page
            driver.navigate().back();

            // Wait for the video4 element to be clickable again (increase timeout if necessary)
            elementToClick_vid4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/div[3]/div/div/div[4]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Perform the click action on video4
            elementToClick_vid4.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            test.log(Status.PASS, "Successfully opened video4.");

            // Navigate back to the original page
            driver.navigate().back();

            // Wait for the video5 element to be clickable again (increase timeout if necessary)
            elementToClick_vid5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/div[3]/div/div/div[5]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Perform the click action on video5
            elementToClick_vid5.click();
            test.log(Status.PASS, "Successfully opened video5.");
            driver.navigate().back();

        } catch (Exception e) {
            // Log a fail status in case of an exception
            test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
        
    }

