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

public class Aboutus {
    private WebDriver driver;
    private ExtentTest test;

    public Aboutus(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public void executeAboutusTest() {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

            driver.get("https://venkys.io/about-us");

            // Scroll down the page
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1700)");
            Thread.sleep(2000);

            // Locate and click the first set of links
            WebElement linkdln1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[3]/article[1]/div/div/a[1]")));

            // Click the first link
            linkdln1.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "LinkedIn account link of person 1 is working");
            driver.navigate().back();

            // Click the second link
            WebElement insta1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[3]/article[1]/div/div/a[2]")));
            insta1.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "Instagram account link of person 1 is working");
            driver.navigate().back();

            // Click the third link
            WebElement whatsapp1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[3]/article[1]/div/div/a[3]")));
            whatsapp1.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "WhatsApp account link of person 1 is working");
            driver.navigate().back();
            Thread.sleep(2000);

            // Continue with the same pattern for the second set of links
            WebElement linkdln2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[3]/article[2]/div/div/a[1]")));

            // Click the first link
            linkdln2.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "LinkedIn account link of person 2 is working");
            driver.navigate().back();

            // Click the second link
            WebElement insta2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[3]/article[2]/div/div/a[2]")));
            insta2.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "Instagram account link of person 2 is working");
            driver.navigate().back();

            // Click the third link
            WebElement whatsapp2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[3]/article[2]/div/div/a[3]")));
            whatsapp2.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "WhatsApp account link of person 2 is working");
            driver.navigate().back();

            // Continue with the same pattern for the third set of links
            WebElement linkdln3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[3]/article[3]/div/div/a[1]")));

            // Click the first link
            linkdln3.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "LinkedIn account link of person 3 is working");
            driver.navigate().back();

            // Click the second link
            WebElement insta3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[3]/article[3]/div/div/a[2]")));
            insta3.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "Instagram account link of person 3 is working");
            driver.navigate().back();

            // Click the third link
            WebElement whatsapp3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section[3]/article[3]/div/div/a[3]")));
            whatsapp3.click();
            Thread.sleep(2000);
            test.log(Status.PASS, "WhatsApp account link of person 3 is working");
            driver.navigate().back();

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0)");
            Thread.sleep(2000);
            test.log(Status.INFO, "The video is running");

            // Add your video-related code using the Videospage class here
            /* WebElement videoele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"movie_player\"]/div[1]/video")));
            videoele.click();            
            Thread.sleep(2000);            
            if (driver.getCurrentUrl().contains("watch?v=hLJEM_RtjTY")) {
            	test.log(Status.PASS, "Video link is working");
            } else {
            	test.log(Status.FAIL, "Video link is working");
            }
            driver.navigate().back(); */           
            Thread.sleep(2000);
            // Continue with the same pattern for more sets of links if needed...

        } catch (Exception e) {
            
            // Log a fail status in case of an exception
            test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
            e.printStackTrace();
        } 
    }
}
