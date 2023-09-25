package Pkg_extent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import com.vsdevelopers.automation.pages.Loginpage;
import com.vsdevelopers.automation.pages.Videospage;
import com.vsdevelopers.automation.pages.Contactus;
import com.vsdevelopers.automation.pages.Registrationpage;
import com.vsdevelopers.automation.pages.Aboutus;
import com.vsdevelopers.automation.pages.Homepage;
import com.vsdevelopers.automation.pages.Blogspage;
import com.vsdevelopers.automation.pages.Codespage;
import com.aventstack.extentreports.Status;

public class TestRunner {
    public static void main(String[] args) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
        	
        	 ExtentTest registrationParentTest = extent.createTest("Registration Page Test", "Tests related to the registration functionality");
            ExtentTest registrationTest = registrationParentTest.createNode("Registration Test", "Test the registration functionality");
            registrationTest.info("Navigating to the Venkys.io registration page");

            Registrationpage registrationPage = new Registrationpage(driver, registrationTest);
            registrationPage.executeRegistrationTest();
            registrationTest.pass("Registration test passed");
           
            
            Thread.sleep(3000); // Sleep for 3 seconds
            WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main-wrapper\"]/header/div[1]/div/div/div[2]/ul/li[1]/a")));
            loginLink.click();
            
            
            
            
            ExtentTest loginParentTest = extent.createTest("Login Page Test", "Tests related to the login functionality");
            ExtentTest loginTest = loginParentTest.createNode("Login Test", "Test the login functionality");
            loginTest.info("Navigating to the Venkys.io login page");
            Loginpage loginPage = new Loginpage(driver, loginTest);
            loginPage.executeLoginTest();
            loginTest.pass("Login test passed");

            // After login, locate and click the menu icon
            
            
            WebElement menuicon1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'main-wrapper\']/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            menuicon1.click();
            Thread.sleep(3000);

            // Wait for the Videos link to be clickable and click on it
            
            // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement Homelink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Home")));
            Homelink.click();

            // Verify that the Videos page has loaded successfully before executing tests
            WebDriverWait HomePageWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            HomePageWait.until(ExpectedConditions.urlToBe("https://venkys.io/"));

            ExtentTest HomeParentTest = extent.createTest("Home Page Test", "Tests related to the video functionality");
            ExtentTest HomeTest = HomeParentTest.createNode("Home Test", "Test the video functionality");
            HomeTest.info("Navigating to the Home page");

            Homepage HomePage = new Homepage(driver, HomeTest);
            HomePage.executeHomepageTest();
            HomeTest.pass("Homepage test passed");
            
            
            
            /* WebElement menuicon2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'main-wrapper\']/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            menuicon2.click();
            Thread.sleep(3000);

            // Wait for the Videos link to be clickable and click on it
            
            // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement Codelink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Code")));
            Codelink.click();

            // Verify that the Videos page has loaded successfully before executing tests
            WebDriverWait CodepageWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            HomePageWait.until(ExpectedConditions.urlToBe("https://venkys.io/code"));

            ExtentTest CodeParentTest = extent.createTest("Code Page Test", "Tests related to the video functionality");
            ExtentTest CodeTest = HomeParentTest.createNode("Code Test", "Test the video functionality");
            CodeTest.info("Navigating to the Code page");

            Codespage CodePage = new Codespage(driver, CodeTest);
            CodePage.executeCodespageTest();
            CodeTest.pass("Codepage test passed");*/
            
            
           
           
        
            WebElement menuicon4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'main-wrapper\']/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            menuicon4.click();
            Thread.sleep(3000);

            // Wait for the Videos link to be clickable and click on it
            
            // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement videosLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Videos")));
            videosLink.click();

            // Verify that the Videos page has loaded successfully before executing tests
            WebDriverWait videosPageWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            videosPageWait.until(ExpectedConditions.urlToBe("https://venkys.io/videos"));

            ExtentTest videosParentTest = extent.createTest("Videos Page Test", "Tests related to the video functionality");
            ExtentTest videoTest = videosParentTest.createNode("Video Test", "Test the video functionality");
            videoTest.info("Navigating to the Videos page");

            Videospage videoPage = new Videospage(driver, videoTest);
            videoPage.executeVideoTest();
            videoTest.pass("Video test passed");
            
            WebDriverWait videosWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            videosWait.until(ExpectedConditions.urlToBe("https://venkys.io/videos"));
            
            
            WebElement menuicon3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'main-wrapper\']/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            menuicon3.click();
            Thread.sleep(3000);

            // Wait for the Videos link to be clickable and click on it
            
            // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement Blogslink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Blogs")));
            Blogslink.click();

            // Verify that the Videos page has loaded successfully before executing tests
            WebDriverWait BlogsPageWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            BlogsPageWait.until(ExpectedConditions.urlToBe("https://venkys.io/articles"));

            ExtentTest BlogsParentTest = extent.createTest("Blogs Page Test", "Tests related to the video functionality");
            ExtentTest BlogsTest = BlogsParentTest.createNode("Blogs Test", "Test the video functionality");
            BlogsTest.info("Navigating to the Blogs page");

            Blogspage BlogsPage = new Blogspage(driver, HomeTest);
            BlogsPage.executeBlogspageTest();
            BlogsTest.pass("Blogspage test passed");
            
            WebElement menuicon5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'main-wrapper\']/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            menuicon5.click();
            Thread.sleep(3000);

            // Wait for the Videos link to be clickable and click on it
            
            // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement AboutusLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("About Us")));
           
            AboutusLink.click();
            
            WebDriverWait AboutusPageWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            AboutusPageWait.until(ExpectedConditions.urlToBe("https://venkys.io/about-us"));
            
            
            
            ExtentTest aboutUsParentTest = extent.createTest("About Us Page Test", "Tests related to the About Us functionality");
            ExtentTest aboutUsTest = aboutUsParentTest.createNode("About Us Test", "Test the About Us functionality");
            aboutUsTest.info("Navigating to the Venkys.io About Us page");

            Aboutus aboutUsPage = new Aboutus(driver, aboutUsTest);
            aboutUsPage.executeAboutusTest();
            aboutUsTest.pass("About Us test passed");
            
            
            
            
         // Wait for the Videos page to load successfully before moving to the Contact Us page
            WebDriverWait contactusWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            contactusWait.until(ExpectedConditions.urlToBe("https://venkys.io/about-us"));

            // Continue to navigate to the Contact Us page
            WebElement menuicon6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'main-wrapper\']/header/div[3]/div/div/div[3]/ul/li/button")));
            Thread.sleep(2000);
            menuicon6.click();
            Thread.sleep(3000);

            // Wait for the Contact Us link to be clickable and click on it
            WebElement contactUsLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Contact")));
            contactUsLink.click();

            // Verify that the Contact Us page has loaded successfully before executing tests
            WebDriverWait contactUsPageWait = new WebDriverWait(driver, Duration.ofSeconds(30));
            contactUsPageWait.until(ExpectedConditions.urlToBe("https://venkys.io/contact-us"));

            // Create ExtentReport test for the Contact Us page
            ExtentTest contactUsParentTest = extent.createTest("Contact Us Page Test", "Tests related to the Contact Us functionality");
            ExtentTest contactUsTest = contactUsParentTest.createNode("Contact Us Test", "Test the Contact Us functionality");
            contactUsTest.info("Navigating to the Contact Us page");

            // Continue with the Contact Us page interactions
            // You can create a ContactUspage class and use it similarly to Videospage for better organization

            // Example usage (modify as needed):
             Contactus contactUsPage = new Contactus(driver, contactUsTest);
             contactUsPage.executeContactUsTest();
             contactUsTest.pass("Contact Us test passed");

            // Flush the extent report to save the results
            extent.flush();
        } catch (Exception e) {
            e.printStackTrace();
            // Log the exception
            // You can also consider adding a test.fail() status for the respective test
        } finally {
            driver.quit();
        }
    }
}
