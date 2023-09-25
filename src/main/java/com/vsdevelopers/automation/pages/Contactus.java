package com.vsdevelopers.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Contactus {
    private WebDriver driver;
    private ExtentTest test;

    public Contactus(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public void executeContactUsTest() {
        try {
            

            // Navigate to the Contact Us page URL
            driver.get("https://venkys.io/contact-us");

            // Log test steps and results using Extent Reports
            test.info("Navigating to the Venkys.io contact us page");

            // Continue with the rest of your Contact Us page code
            // Add your Contact Us interactions here

           ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");            

            // Log a pass status for each step
            test.log(Status.PASS, "Successfully navigated to the Contact Us page");

           WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));

            // Find and click on the "Home" hyperlink
            WebElement homeLink = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[2]/div/div/ul/li[1]/a")));
            homeLink.click();
            Thread.sleep(2000);

            // Log pass or fail based on the condition
            if (driver.getCurrentUrl().contains("/venkys.io")) {
                test.log(Status.PASS, "Successfully navigated to Home page.");
            } else {
                test.log(Status.FAIL, "Failed to navigate to the Home page.");
            }

            // Navigate back to the Contact Us page
            driver.navigate().back();
            Thread.sleep(2000);

            // Scroll to the bottom of the page using JavaScript
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1000);");

            // Log pass or fail based on the condition
            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            WebElement elementToClick_address = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[1]/div/div/div/div/div/div[2]/ul[1]/li[1]/p/a")));
            elementToClick_address.click();

            if (driver.getCurrentUrl().contains("/5th%20Floor,%20Mittis,%20Chaitanya%20Enclave,Khajaguda,%20Hyderabad,%20Telangana%20500089")) {
                test.log(Status.PASS, "Successfully navigated to Address page.");
            } else {
                test.log(Status.FAIL, "Failed to navigate to the Address page.");
            }
            Thread.sleep(2000);
            // Navigate back to the Contact Us page
            driver.navigate().back();

            // Wait for the elements to be clickable (timeout: 10 seconds)
            WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed

            // Find the Facebook element to be clicked using an XPath locator
            WebElement elementToClick_FaceBook = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[1]/div/div/div/div/div/div[2]/ul[2]/li[1]/a")));

            // Find the YouTube element to be clicked using an XPath locator
            WebElement elementToClick_YouTube = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[1]/div/div/div/div/div/div[2]/ul[2]/li[2]/a")));

            // Find the LinkedIn element to be clicked using an XPath locator
            WebElement elementToClick_Linkedin = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[1]/div/div/div/div/div/div[2]/ul[2]/li[3]/a")));

            // Find the fourth element to be clicked using an XPath locator
            WebElement elementToClick_Fourth = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[1]/div/div/div/div/div/div[2]/ul[2]/li[4]/a")));

            // Scroll down by 500 pixels using JavaScript
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
            Thread.sleep(2000);

            // Click Facebook
            elementToClick_FaceBook.click();

            // Log pass or fail based on the condition
            if (driver.getCurrentUrl().contains("/100090430163889")) {
                test.log(Status.PASS, "Successfully navigated to FaceBook page.");
            } else {
                test.log(Status.FAIL, "Failed to navigate to the FaceBook page.");
            }
            Thread.sleep(2000);
            // Navigate back to the Contact Us page
            driver.navigate().back();

            // Wait for the YouTube element to be clickable again
            elementToClick_YouTube = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[1]/div/div/div/div/div/div[2]/ul[2]/li[2]/a")));
            elementToClick_YouTube.click();
            Thread.sleep(2000);

            // Log pass or fail based on the condition
            if (driver.getCurrentUrl().contains("/UCk4zVUM7Wu0rqgKTBYo79MQ")) {
                test.log(Status.PASS, "Successfully navigated to YouTube page.");
            } else {
                test.log(Status.FAIL, "Failed to navigate to the YouTube page.");
            }

            // Navigate back to the Contact Us page
            driver.navigate().back();

            // Wait for the LinkedIn element to be clickable again
            elementToClick_Linkedin = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[1]/div/div/div/div/div/div[2]/ul[2]/li[3]/a")));
            elementToClick_Linkedin.click();
            Thread.sleep(2000);

            // Log pass or fail based on the condition
            if (driver.getCurrentUrl().contains("/venkysio")) {
                test.log(Status.PASS, "Successfully navigated to LinkedIn page.");
            } else {
                test.log(Status.FAIL, "Failed to navigate to the LinkedIn page.");
            }

            // Navigate back to the Contact Us page
            driver.navigate().back();

            // Wait for the fourth element to be clickable again
            elementToClick_Fourth = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[1]/div/div/div/div/div/div[2]/ul[2]/li[4]/a")));
            elementToClick_Fourth.click();

            // Log pass or fail based on the condition
            if (driver.getCurrentUrl().contains("/LC7dLycgcdHHODwbphSzTL")) {
                test.log(Status.PASS, "Successfully navigated to Printest page.");
            } else {
                test.log(Status.FAIL, "Failed to navigate to the Printest page.");
            }
            Thread.sleep(2000);
            driver.navigate().back();

            // Scroll down by 500 pixels using JavaScript
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
            Thread.sleep(2000);

            // Find the email text box by its name and enter an email
            WebElement emailTextBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
            emailTextBox.sendKeys("priyanandinipasupuleti@gmail.com");

            // Find the phone number text box by its name and enter a phone number
            WebElement phoneTextBox = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
            phoneTextBox.sendKeys("8985168777");

            // Find the message text area by its name and enter a message
            WebElement messageTextArea = driver.findElement(By.name("address"));
            messageTextArea.sendKeys("This is a test message using Selenium.");

            // Add a delay to keep the WebDriver window open for 5 seconds (adjust as needed)
            Thread.sleep(5000); // Sleep for 5 seconds
            
            // Navigate back to the original page
            driver.navigate().back();
            
            // Add a delay to keep the WebDriver window open for 5 seconds (adjust as needed)
            Thread.sleep(5000); // Sleep for 5 seconds

        } catch (Exception e) {
            // Log a fail status in case of an exception
            test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}