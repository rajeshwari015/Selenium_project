package com.vsdevelopers.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
public class Blogspage {
    private WebDriver driver;
    private ExtentTest test;

    public Blogspage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public void executeBlogspageTest() {
        try {
        	// Navigate directly to the "Blogs" page URL
            driver.get("https://venkys.io/articles");            
            // Wait for the element to be clickable (timeout: 10 seconds)
            test.info("Navigating to the Venkys.io Articles page");
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50)); // Adjust the timeout as needed
            // Find the element to be clicked using an XPath locator
            WebElement clickhome = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[2]/div/div/ul/li[1]/a")));
            clickhome.click();            
            Thread.sleep(2000);            
            if (driver.getCurrentUrl().contains("/venkys.io")) {
            	test.log(Status.PASS,"Successfully navigated to Home page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the Home page.");
            }
            driver.navigate().back();            
            Thread.sleep(2000);

            WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
            // Find the element to be clicked using an XPath locator
            WebElement elementToClick_blog1 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[1]/div/div/div[2]/h5/a")));
            // Perform the click action on the element
            elementToClick_blog1.click();
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500);");
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/weak-random-number-generation-and-rededies")) {
            	test.log(Status.PASS,"Successfully navigated to Weak Random Number Generation and Rededies page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the Weak Random Number Generation and Rededies page.");
            }
            driver.navigate().back();

            //2.Weak passwords
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500);");
            Thread.sleep(2000);
            WebElement Weak_passwords = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[2]/div/div/div[2]/div/a")));
            Weak_passwords.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/weak-passwords")) {
            	test.log(Status.PASS,"Successfully navigated to Weak passwords page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Weak passwords page.");
            }
            driver.navigate().back();
            
            //3.Handling errors
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 900);");
            Thread.sleep(2000);
            WebElement Handling_errors = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[3]/div/div/div[2]/div/a")));
            Handling_errors.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/designing-and-developing-applications-to-handle-errors")) {
            	test.log(Status.PASS,"Successfully navigated to Handling errors page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Handling errors page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //4.Singleton_designpattern
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 1500);");
            Thread.sleep(2000);
            WebElement Singleton_designpattern = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[4]/div/div/div[2]/div/a")));
            Singleton_designpattern.click();
            if (driver.getCurrentUrl().contains("/singleton-design-pattern-all-that-you-wanted-to-know")) {
            	test.log(Status.PASS,"Successfully navigated to Singleton_designpattern page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Singleton_designpattern page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //5.queues
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2000);");
            Thread.sleep(2000);
            WebElement queues = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[5]/div/div/div[2]/div/a")));
            queues.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/queues-learn-it-like-never-before")) {
            	test.log(Status.PASS,"Successfully navigated to queues page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to queues page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //6.software_architecture
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2500);");
            Thread.sleep(2000);
            WebElement software_architecture = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[6]/div/div/div[2]/div/a")));
            software_architecture.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/a-pragmatic-introduction-to-software-architecture")) {
            	test.log(Status.PASS,"Successfully navigated to software_architecture page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to software_architecture page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //7.security_attacks
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 2500);");
            Thread.sleep(2000);
            WebElement security_attacks = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[7]/div/div/div[2]/div/a")));
            security_attacks.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/security-attacks-information-leakage")) {
            	test.log(Status.PASS,"Successfully navigated to security_attacks page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to security_attacks page.");
            }
            driver.navigate().back();
            Thread.sleep(4000);
            
            //8.Graphs
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 3000);");
            Thread.sleep(2000);
            WebElement Graphs = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[8]/div/div/div[2]/div/a")));
            Graphs.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/graphs-introduction")) {
            	test.log(Status.PASS,"Successfully navigated to Graphs page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Graphs page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //9.recursive
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,3500);");
            Thread.sleep(2000); 
            WebElement recursive = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[9]/div/div/div[2]/div/a")));
            recursive.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/recursive-functions-an-introduction")) {
            	test.log(Status.PASS,"Successfully navigated to recursive page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to recursive page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //10.strings
            // ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 4000);");
            Thread.sleep(2000);
            WebElement strings = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[10]/div/div/div[2]/div/a")));
            strings.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/strings-an-introduction")) {
            	test.log(Status.PASS,"Successfully navigated to strings page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to strings page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //11.listening_skills
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 4000);");
            Thread.sleep(2000); 
            WebElement listening_skills = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[11]/div/div/div[2]/h5/a")));
            listening_skills.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/how-to-improve-your-listening-skills-4-tips-for-a-good-listen")) {
            	test.log(Status.PASS,"Successfully navigated to listening_skills page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to listening_skills page.");
            }
            driver.navigate().back();          
            Thread.sleep(2000);
            
            //12.algorithm_Complexity
             ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,4200);");
            Thread.sleep(2000);
            WebElement algorithm_Complexity = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[12]/div/div/div[2]/div/a")));
            algorithm_Complexity.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/algorithm-complexity")) {
            	test.log(Status.PASS,"Successfully navigated to algorithm_Complexity page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Handling errors page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
          
            //13.linked_list
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 4800);");
            Thread.sleep(2000); 
            WebElement linked_list = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/div[13]/div/div/div[2]/strong/div/a")));
            linked_list.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/linked-list")) {
            	test.log(Status.PASS,"Successfully navigated to linked_list page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to linked_list page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //14.data_structures
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 5200);");
            Thread.sleep(2000);
            WebElement data_structures = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/strong/div/div/div/div[2]/strong/div/a")));
            data_structures.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/data-structures-arrays")) {
            	test.log(Status.PASS,"Successfully navigated to data_structures page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to data_structures page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //15.think_like_a_programmer
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 5400);");
            Thread.sleep(2000);
            WebElement think_like_a_programmer = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/strong/strong/div[1]/div/div/div[2]/div/a")));
            think_like_a_programmer.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/how-to-think-like-a-programmer")) {
            	test.log(Status.PASS,"Successfully navigated to think_like_a_programmer page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to think_like_a_programmer page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //16.devops
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 5800);");
            Thread.sleep(2000);
            WebElement devops = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/strong/strong/div[2]/div/div/div[2]/div/a")));
            devops.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/what-is-devops-and-what-is-role-of-a-devops-engineer")) {
            	test.log(Status.PASS,"Successfully navigated to devops page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to devops page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //17.cloud_computing
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 6000);");
            Thread.sleep(2000);
            WebElement cloud_computing = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/strong/strong/div[3]/div/div/div[2]/div/a")));
            cloud_computing.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/cloud-computing")) {
            	test.log(Status.PASS,"Successfully navigated to cloud_computing page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to cloud_computing page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //18.Brainstorming
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 6400);");
            Thread.sleep(2000);
            WebElement Brainstorming = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/strong/strong/div[4]/div/div/div[2]/div/a")));
            Brainstorming.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/why-do-we-use-it")) {
            	test.log(Status.PASS,"Successfully navigated to Brainstorming page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Brainstorming page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //19.programmer
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 6600);");
            Thread.sleep(2000);
            WebElement programmer = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/section/div/div/strong/strong/div[5]/div/div/div[2]/div/a")));
            programmer.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/what-is-lorem-ipsum")) {
            	test.log(Status.PASS,"Successfully navigated to programmer page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to programmer page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
	        } catch (Exception e) {
	            e.printStackTrace();
	            test.log(Status.FAIL, "Test failed with exception: " + e.getMessage());
	        } 

	}

}
