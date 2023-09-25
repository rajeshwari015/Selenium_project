package com.vsdevelopers.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;


public class Homepage {
    private WebDriver driver;
    private ExtentTest test;

    public Homepage(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
    }

    public void executeHomepageTest() {
   
        try {
            driver.get("https://venkys.io");
            
            //Login navbar
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            /* WebElement Login_element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-wrapper\"]/header/div[1]/div/div/div[2]/ul/li[1]/a")));
            Thread.sleep(2000);
            Login_element.click();
            Thread.sleep(3000);
            if (driver.getCurrentUrl().contains("/login")) {
            	test.log(Status.PASS, "Successfully navigated to the login page.");
            } 
            else {
            	test.log(Status.FAIL, "Failed to  navigate to the login page.");
            }
            driver.navigate().back();
            Thread.sleep(2000);
            
            //Register navbar
            WebElement Register_element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-wrapper\"]/header/div[1]/div/div/div[2]/ul/li[2]/a")));
            Thread.sleep(2000);
            Register_element.click();
            Thread.sleep(3000);
            if (driver.getCurrentUrl().contains("/register")) {
            	test.log(Status.PASS, "Successfully navigated to the register page.");
            } 
            else {
            	test.log(Status.FAIL, "Failed to  navigate to the register page.");
            }
            driver.navigate().back();
             Thread.sleep(2000);*/

            String carouselId = "homepage_slider";
            WebElement carousel = driver.findElement(By.id(carouselId));
            WebElement nextButton = carousel.findElement(By.cssSelector("a.carousel-control-next"));
            WebElement prevButton = carousel.findElement(By.cssSelector("a.carousel-control-prev"));
            int numSlides = 3; // Number of slides to cycle through
            for (int i = 0; i < numSlides; i++) {
                nextButton.click();
                wait.until(ExpectedConditions.attributeContains(carousel, "class", "slide"));
                Thread.sleep(2000);
            }
            for (int i = 0; i < numSlides; i++) {
                prevButton.click();
                wait.until(ExpectedConditions.attributeContains(carousel, "class", "slide"));
                Thread.sleep(2000);
            }
            
            WebElement Three_lines = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-wrapper\"]/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            Three_lines.click();
            Thread.sleep(3000);
            
            test.log(Status.PASS, "Successfull operations of carousel .");
            
            //VIDEOS CLICK
            WebElement videosLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Videos")));
            
            Thread.sleep(2000);
            videosLink.click();
            Thread.sleep(3000);
            if (driver.getCurrentUrl().contains("/videos")) {
            	test.log(Status.PASS, "Successfully navigated to the videos page.");
            } 
            else {
            	test.log(Status.FAIL, "Failed to navigate to the videos page.");
            }
            driver.navigate().back();
            
            WebElement Three_lines2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-wrapper\"]/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            Three_lines2.click();
            Thread.sleep(3000);
            
            //CODE CLICK
            WebElement codepage = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Code")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", codepage);
            codepage.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/code")) {
            	test.log(Status.PASS, "Successfully navigated to the Get started page.");
            } 
            else {
            	test.log(Status.FAIL ,"Failed to navigate to the Get Started page.");
            }
            driver.navigate().back();
            
            WebElement Three_lines3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-wrapper\"]/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            Three_lines3.click();
            Thread.sleep(3000);
            
            //COURSE LINK - NOT YET ADDED 
            // Thread.sleep(3000);
            WebElement courselink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main-wrapper\"]/header/div[4]/div/ul/li[4]/a")));
            courselink.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/courses.venkys.io")) {
            	test.log(Status.PASS ,"Successfully navigated to the Courses page.");
            } 
            else {
            	test.log(Status.FAIL, "Failed to navigate to the Courses page.");
            }
            driver.navigate().back();
            
            WebElement Three_lines4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-wrapper\"]/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            Three_lines4.click();
            Thread.sleep(3000);
            
            // BLOGS LINK
            WebElement blogs = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Blogs")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blogs);
            blogs.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/articles")) {
            	test.log(Status.PASS ,"Successfully navigated to the Blog Page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to the Blog page.");
            }
            driver.navigate().back();
            
            WebElement Three_lines5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-wrapper\"]/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            Three_lines5.click();
            Thread.sleep(3000);
            
            //ABOUT US LINK
            WebElement aboutus = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("About Us")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", aboutus);
            aboutus.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/about-us")) {
            	test.log(Status.PASS,"Successfully navigated to the About us Page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to the About us page.");
            }
            driver.navigate().back();
            
            WebElement Three_lines6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-wrapper\"]/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            Three_lines6.click();
            Thread.sleep(3000);
            
            //CONTACT LINK
            WebElement contact = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Contact")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", contact);
            int attempts_contact = 0;
            while (attempts_contact < 3) {
                try {
                	contact.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_contact++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/contact-us")) {
            	test.log(Status.PASS,"Successfully navigated to the Contact Page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to the Contact page.");
            }
            driver.navigate().back();
            
            //ABOUT US LINK
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
            Thread.sleep(3000);
            WebElement aboutus2nd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[3]/section/div[2]/span/a")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", aboutus2nd);
            int attempts_aboutus2nd = 0;
            while (attempts_aboutus2nd < 3) {
                try {
                	aboutus2nd.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_aboutus2nd++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/about-us")) {
            	test.log(Status.PASS,"Successfully navigated to the About us Page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to the About us page.");
            }
            driver.navigate().back(); 
            
            //GET STARTED BUTTON
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
            Thread.sleep(3000);
            WebElement getStarted = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[3]/section/div[2]/div/a")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getStarted);
            getStarted.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/code")) {
            	test.log(Status.PASS,"Successfully navigated to the Get Started page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to the Get Started page.");
            }
            driver.navigate().back();
            
            //POPULAR COURSES
            
            //Sorting_algorithms course - NOT YET ADDED
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
            Thread.sleep(3000);
            WebElement Sorting_algorithms = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[4]/div/div[2]/div[1]/div[1]/div/div[2]/h5")));
            Sorting_algorithms.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/courses.venkys.io")) {
            	test.log(Status.PASS,"Successfully navigated to Sorting Algoritms Course.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Sorting Algoritms Course.");
            }
            driver.navigate().back();
            
            //Design_patterns course - NOT YET ADDED
            Thread.sleep(3000);
            WebElement Design_patterns = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[4]/div/div[2]/div[2]/div[1]/div/div[2]/h5")));
            Design_patterns.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/courses.venkys.io")) {
            	test.log(Status.PASS,"Successfully navigated to Design Pattern Course.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Design Pattern Course.");
            }
            driver.navigate().back();
            
            //Security_attacks course - NOT YET ADDED
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");
            Thread.sleep(3000);
            WebElement Security_attacks = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[4]/div/div[2]/div[3]/div[1]/div/div[2]/h5")));
            Security_attacks.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/courses.venkys.io")) {
            	test.log(Status.PASS,"Successfully navigated to Security attacks Course.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Security attacks Course.");
            }
            driver.navigate().back();  
            
            //BROWSE MORE COURSES BUTTON
            Thread.sleep(3000);
            WebElement Browse_more_courses = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[4]/div/div[3]/a")));
            Browse_more_courses.click();
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/courses.venkys.io")) {
            	test.log(Status.PASS,"Successfully navigated to BROWSE MORE COURSES page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to BROWSE MORE COURSES page.");
            }
            driver.navigate().back(); 
            
            //LATEST BLOGS
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 800);");
            //1.Weak random number
            WebElement weak_random = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[5]/div/div[2]/div[1]/div/div")));
            weak_random.click();
            if (driver.getCurrentUrl().contains("/weak-random-number-generation-and-rededies")) {
            	test.log(Status.PASS,"Successfully navigated to weak random page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to weak random page.");
            }
            driver.navigate().back();
            
            //2.Weak passwords
            WebElement Weak_passwords = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[5]/div/div[2]/div[2]/div/div")));
            Weak_passwords.click();
            if (driver.getCurrentUrl().contains("/weak-passwords")) {
            	test.log(Status.PASS,"Successfully navigated to Weak passwords page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Weak passwords page.");
            }
            driver.navigate().back();
            
            //3.Handling errors
            WebElement Handling_errors = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[5]/div/div[2]/div[3]/div/div")));
            Handling_errors.click();
            if (driver.getCurrentUrl().contains("/designing-and-developing-applications-to-handle-errors")) {
            	test.log(Status.PASS,"Successfully navigated to Handling errors page.");
            } 
            else {
            	test.log(Status.FAIL,"Failed to navigate to Handling errors page.");
            }
            driver.navigate().back();
            
            
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 800);");
            
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Continue with the rest of your code for video interactions

            // Find the video1 element to be clicked using an XPath locator
            WebElement elementToClick_vid1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[6]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Find the video2 element to be clicked using an XPath locator
            WebElement elementToClick_vid2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[6]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Find the video3 element to be clicked using an XPath locator
            WebElement elementToClick_vid3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[6]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Find the video4 element to be clicked using an XPath locator
            WebElement elementToClick_vid4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[6]/div/div[2]/div[4]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Find the video5 element to be clicked using an XPath locator
            // WebElement elementToClick_vid5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'main\']/div[3]/div/div/div[5]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Scroll down by 500 pixels using JavaScript
            // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");

            // Add a delay to allow the page to load (adjust as needed)
            Thread.sleep(2000);

            // Perform the click action on video1
            elementToClick_vid1.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            test.log(Status.PASS,"Successfully opened video1.");

            // Navigate back to the original page
            driver.navigate().back();

            // Wait for the video2 element to be clickable again
            elementToClick_vid2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[6]/div/div[2]/div[2]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Perform the click action on video2
            elementToClick_vid2.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            test.log(Status.PASS,"Successfully opened video2.");

            // Navigate back to the original page
            driver.navigate().back();

            // Wait for the video3 element to be clickable again
            elementToClick_vid3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[6]/div/div[2]/div[3]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Perform the click action on video3
            elementToClick_vid3.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            test.log(Status.PASS,"Successfully opened video3.");

            // Navigate back to the original page
            driver.navigate().back();

            // Wait for the video4 element to be clickable again (increase timeout if necessary)
            elementToClick_vid4 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[6]/div/div[2]/div[4]/div/div/div/div[2]/div[1]/a/div/div/div/div/canvas")));

            // Perform the click action on video4
            elementToClick_vid4.click();
            Thread.sleep(2000);
            test.log(Status.PASS,"Successfully opened video4.");
            
            driver.navigate().back();
            
            
            
            
            //Should add videos code -- Incomplete
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 2700);");
            
            Thread.sleep(4000);
            
            // Wait for the elements to be clickable (timeout: 10 seconds)
            WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(40)); // Adjust the timeout as needed
            
            // Find the LinkedIn element to be clicked using an XPath locator
            WebElement Click_Linkedin = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[8]/section/div[2]/div[1]/a")));
            int attempts_Linkedin = 0;
            while (attempts_Linkedin < 3) {
                try {
                    Click_Linkedin.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_Linkedin++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/venkysio")) {
            	test.log(Status.PASS,"Successfully navigated to Linkedin page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the Linkedin page.");
            }
            driver.navigate().back();
            
            // Find the Whatsapp element to be clicked using an XPath locator
            WebElement Click_Whatsapp = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[8]/section/div[2]/div[2]/a")));           
            int attempts_Whatsapp = 0;
            while (attempts_Whatsapp < 3) {
                try {
                	Click_Whatsapp.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_Whatsapp++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/LC7dLycgcdHHODwbphSzTL")) {
            	test.log(Status.PASS,"Successfully navigated to Whatsapp page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the Whatsapp page.");
            }
            // Navigate back to the original page
            driver.navigate().back();
            
            // Find the Instagram element to be clicked using an XPath locator
            WebElement Click_Instagram = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[8]/section/div[2]/div[3]/a")));
            int attempts_Instagram = 0;
            while (attempts_Instagram < 3) {
                try {
                	Click_Instagram.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_Instagram++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/venkys.io")) {
            	test.log(Status.PASS,"Successfully navigated to Instagram page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the Instagram page.");
            }
            // Navigate back to the original page
            driver.navigate().back();
  
            // Wait for the YouTube element to be clickable again
            WebElement Click_YouTube = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[8]/section/div[2]/div[4]/a/div")));
            int attempts_YouTube = 0;
            while (attempts_YouTube < 3) {
                try {
                	Click_YouTube.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_YouTube++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/UCk4zVUM7Wu0rqgKTBYo79MQ")) {
            	test.log(Status.PASS,"Successfully navigated to YouTube page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the YouTube page.");
            }
            // Navigate back to the original page
            driver.navigate().back();
            
            // Find the Telegram element to be clicked using an XPath locator
            WebElement Click_Telegram = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[8]/section/div[2]/div[5]/a")));
            int attempts_Telegram = 0;
            while (attempts_Telegram < 3) {
                try {
                	Click_Telegram.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_Telegram++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/vsdevelopers")) {
            	test.log(Status.PASS,"Successfully navigated to Telegram page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the Telegram page.");
            }
            driver.navigate().back();
            
            // Find the Facebook element to be clicked using an XPath locator
            WebElement Click_FaceBook = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[8]/section/div[2]/div[6]/a")));
            int attempts_FaceBook = 0;
            while (attempts_FaceBook < 3) {
                try {
                	Click_FaceBook.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_FaceBook++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/100090430163889")) {
            	test.log(Status.PASS,"Successfully navigated to FaceBook page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the FaceBook page.");
            }
            driver.navigate().back();
            
            // Scroll down by 500 pixels using JavaScript
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 500);");

            // Add a delay to allow the page to load (adjust as needed)
            Thread.sleep(2000);

            // Find the email text box by its name and enter an email
            WebElement emailTextBox = driver.findElement(By.xpath("//*[@id=\"email\"]"));
            emailTextBox.sendKeys("priyanandinipasupuleti@gmail.com");

            // Find the phone number text box by its name and enter a phone number
            WebElement phoneTextBox = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
            phoneTextBox.sendKeys("8985168777");

            // Find the message text area by its name and enter a message
            WebElement messageTextArea = driver.findElement(By.xpath("//*[@id=\"address\"]"));
            messageTextArea.sendKeys("This is a test message using Selenium.");

            // Add a delay to keep the WebDriver window open for 5 seconds (adjust as needed)
            Thread.sleep(5000); // Sleep for 5 seconds
            
            //Privacy Policy
            
            WebElement Privacy_policy = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/footer/div/div/div[1]/div/div/p/a[1]")));
            int attempts_Privacy = 0;
            while (attempts_Privacy < 3) {
                try {
                	Privacy_policy.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_Privacy++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/privacy-policy")) {
            	test.log(Status.PASS,"Successfully navigated to privacy-policy page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the privacy-policy page.");
            }
            driver.navigate().back();
            
            //Terms and Conditions
            WebElement T_C = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/footer/div/div/div[1]/div/div/p/a[2]")));
            int attempts_TC = 0;
            while (attempts_TC < 3) {
                try {
                	T_C.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_TC++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/privacy-policy")) {
            	test.log(Status.PASS,"Successfully navigated to Terms and Conditions page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the Terms and Conditions page.");
            }
            driver.navigate().back();
            
            //Refund policy
            WebElement Refund_policy = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/footer/div/div/div[1]/div/div/p/a[3]")));
            int attempts_Refund = 0;
            while (attempts_Refund < 3) {
                try {
                	Refund_policy.click();
                    break;
                } catch (ElementClickInterceptedException e) {
                    Thread.sleep(1000); // Wait for a second before retrying
                }
                attempts_Refund++;
            }
            Thread.sleep(2000);
            if (driver.getCurrentUrl().contains("/refund-policy")) {
            	test.log(Status.PASS,"Successfully navigated to Refund-policy page.");
            } else {
            	test.log(Status.FAIL,"Failed to navigate to the Refund-policy page.");
            }
            driver.navigate().back();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}