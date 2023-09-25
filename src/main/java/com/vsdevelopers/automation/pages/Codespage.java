package com.vsdevelopers.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Codespage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajes\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://venkys.io/");
            
            Thread.sleep(2000);

            // Navigate directly to the "Contact Us" page URL
            driver.get("https://venkys.io/code");

            Thread.sleep(2000);
            
                                                   // ARRAYS:
            
            // Wait for the element to be clickable (timeout: 10 seconds)
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(40));

            
           // Find the element to be clicked using an XPath locator
            WebElement ClickonArray = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gn-ques\"]/div/div/div[1]/h5")));

            // Perform the click action on the element
            ClickonArray.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            
            
            //EASY:
                                                     // 1.ANAGRAM:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500);");
            //ANAGRAM VIDEO
            WebElement Anagrams_video = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[1]/td[1]/a/i")));
            Anagrams_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //ANAGRAM Blog
            WebElement Anagrams_blog = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[1]/td[2]/a")));
            Anagrams_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //ANAGRAM Code
            WebElement Anagrams_code = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[1]/td[3]/a")));
            Anagrams_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
            // 2.PALINDROME:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            //PALINDROME VIDEO
            WebElement PALINDROME_video = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[2]/td[1]/a")));
            PALINDROME_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //PALINDROME Blog
            WebElement PALINDROME_blog = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[2]/td[2]/a")));
            PALINDROME_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //PALINDROME Code
            WebElement PALINDROME_code = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[2]/td[3]/a")));
            PALINDROME_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                            // 3.SearchingASortedMatrix:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            //Sort VIDEO
            WebElement Sort_video = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[3]/td[1]/a")));
            Sort_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //Sort Blog
            WebElement Sort_blog = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[3]/td[2]/a")));
            Sort_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //Sort Code
            WebElement Sort_code = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[3]/td[3]/a")));
            Sort_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                     // 4.TwoNumberSum:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //TwoNumberSum VIDEO
            WebElement TwoNumberSum_video = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[4]/td[1]/a")));
            TwoNumberSum_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //TwoNumberSum Blog
            WebElement TwoNumberSum_blog = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[4]/td[2]/a")));
            TwoNumberSum_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //TwoNumberSum Code
            WebElement TwoNumberSum_code = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[4]/td[3]/a")));
            TwoNumberSum_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
            //Medium:
            
                                    // 1.FractionalKnapsack
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //FractionalKnapsack VIDEO
            WebElement FractionalKnapsack_video = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[2]/table/tbody/tr[1]/td[1]/a")));
            FractionalKnapsack_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //ractionalKnapsack Blog
            WebElement FractionalKnapsack_blog = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")));
            FractionalKnapsack_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //ractionalKnapsack Code
            WebElement FractionalKnapsack_code = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[2]/table/tbody/tr[1]/td[3]/a")));
            FractionalKnapsack_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                      // 2.PrefixSum
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //PrefixSum VIDEO
			WebElement PrefixSum_video = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[2]/table/tbody/tr[2]/td[1]/a")));
			PrefixSum_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//TwoNumberSum Blog
			WebElement PrefixSum_blog = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[2]/table/tbody/tr[2]/td[2]/a")));
			PrefixSum_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//Sort Code
			WebElement PrefixSum_code = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[3]/table/tbody/tr[1]/td[3]/a")));
			PrefixSum_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			//HARD:
                                                // 1.FourNumberSum:
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //FourNumberSum VIDEO
			WebElement FourNumberSum_video = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[3]/table/tbody/tr[1]/td[1]/a")));
			FourNumberSum_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//FourNumberSum Blog
			WebElement FourNumberSum_blog = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[3]/table/tbody/tr[1]/td[2]/a")));
			FourNumberSum_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//FourNumberSum Code
			WebElement FourNumberSum_code = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[4]/td[3]/a")));
			FourNumberSum_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			                                   // 2.ThreeNumberSum:
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //ThreeNumberSum VIDEO
			WebElement ThreeNumberSum_video = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[4]/td[1]/a")));
			ThreeNumberSum_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//FourNumberSum Blog
			WebElement ThreeNumberSum_blog = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[4]/td[2]/a")));
			ThreeNumberSum_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//FourNumberSum Code
			WebElement ThreeNumberSum_code = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Arrays\"]/div/div[1]/table/tbody/tr[4]/td[3]/a")));
			ThreeNumberSum_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
            
            
                                                      // BACKTRACKING:
			
            // Wait for the element to be clickable (timeout: 10 seconds)
            WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(20));
            
           // Find the element to be clicked using an XPath locator
            WebElement ClickonBACKTRACKING = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gn-ques\"]/div/div/div[2]/h5/button")));

            // Perform the click action on the element
            ClickonBACKTRACKING.click();
            
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500);");

            // Wait for a brief moment
            Thread.sleep(2000);
            
            
            //HARD:
                                                     // 1.N-Queens:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //NQueens VIDEO
            WebElement NQueens_video = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Backtracking\"]/div/div/table/tbody/tr[1]/td[1]/a")));
            NQueens_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //NQueens Blog
            WebElement NQueens_blog = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Backtracking\"]/div/div/table/tbody/tr[1]/td[2]/a")));
            NQueens_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //ANAGRAM Code
            WebElement NQueens_code = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Backtracking\"]/div/div/table/tbody/tr[1]/td[3]/a")));
            NQueens_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                 // 2.SUDOKU:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //SUDOKU VIDEO
            WebElement Sudoku_video = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Backtracking\"]/div/div/table/tbody/tr[2]/td[1]/a")));
            Sudoku_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //PALINDROME Blog
            WebElement Sudoku_blog = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Backtracking\"]/div/div/table/tbody/tr[2]/td[2]/a")));
            Sudoku_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //PALINDROME Code
            WebElement Sudoku_code = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Backtracking\"]/div/div/table/tbody/tr[2]/td[3]/a")));
            Sudoku_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                     // deque:
            
            // Wait for the element to be clickable (timeout: 10 seconds)
            WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(20));

            
           // Find the element to be clicked using an XPath locator
            WebElement ClickonDeque = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gn-ques\"]/div/div/div[3]/h5/button")));

            // Perform the click action on the element
            ClickonDeque.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500);");
            
            
            //EASY:
                                                     // 1.QueuesCRUDArray:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //QueuesCRUDArray VIDEO
            WebElement QueuesCRUDArray_video = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[1]/td[1]/a")));
            QueuesCRUDArray_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //QueuesCRUDArray Blog
            WebElement QueuesCRUDArray_blog = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[1]/td[2]/a")));
            QueuesCRUDArray_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //QueuesCRUDArray Code
            WebElement QueuesCRUDArray_code = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[1]/td[3]/a")));
            QueuesCRUDArray_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                 // 2.QueuesCRUDLinkedList:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //QueuesCRUDLinkedList VIDEO
            WebElement QueuesCRUDLinkedList_video = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[2]/td[1]/a")));
            QueuesCRUDLinkedList_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //QueuesCRUDLinkedList Blog
            WebElement QueuesCRUDLinkedList_blog = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[2]/td[2]/a")));
            QueuesCRUDLinkedList_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //QueuesCRUDLinkedList Code
            WebElement QueuesCRUDLinkedList_code = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[2]/td[3]/a")));
            QueuesCRUDLinkedList_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                            // 3.StackCRUDArray:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //StackCRUDArray VIDEO
            WebElement StackCRUDArray_video = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[3]/td[1]/a")));
            StackCRUDArray_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //StackCRUDArray Blog
            WebElement StackCRUDArray_blog = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[3]/td[2]/a")));
            StackCRUDArray_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //StackCRUDArray Code
            WebElement StackCRUDArray_code = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[3]/td[3]/a")));
            StackCRUDArray_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                     // 4.StackCRUDLinkedList:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //StackCRUDLinkedList VIDEO
            WebElement StackCRUDLinkedList_video = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[4]/td[1]/a")));
            StackCRUDLinkedList_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //StackCRUDLinkedList Blog
            WebElement StackCRUDLinkedList_blog = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[4]/td[2]/a")));
            StackCRUDLinkedList_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //StackCRUDLinkedList Code
            WebElement StackCRUDLinkedList_code = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[1]/table/tbody/tr[4]/td[3]/a")));
            StackCRUDLinkedList_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
            //Medium:
            
                                    // 1.MaxHeapCRUD
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //MaxHeapCRUD VIDEO
            WebElement MaxHeapCRUD_video = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[2]/table/tbody/tr[1]/td[1]/a")));
            MaxHeapCRUD_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //MaxHeapCRUD Blog
            WebElement MaxHeapCRUD_blog = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")));
            MaxHeapCRUD_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //MaxHeapCRUD Code
            WebElement MaxHeapCRUD_code = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[2]/table/tbody/tr[1]/td[3]/a")));
            MaxHeapCRUD_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                      // 2.MinHeapCRUD
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //MinHeapCRUD VIDEO  
			WebElement MinHeapCRUD_video = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[2]/table/tbody/tr[2]/td[1]/a")));
			MinHeapCRUD_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//MinHeapCRUD Blog
			WebElement MinHeapCRUD_blog = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[2]/table/tbody/tr[2]/td[2]/a")));
			MinHeapCRUD_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//MinHeapCRUD Code  
			WebElement MinHeapCRUD_code = wait111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Deque\"]/div/div[2]/table/tbody/tr[2]/td[3]/a")));
			MinHeapCRUD_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
                                                // GRAPHS:
            
            // Wait for the element to be clickable (timeout: 10 seconds)
            WebDriverWait wait1111 = new WebDriverWait(driver, Duration.ofSeconds(20));

            
           // Find the element to be clicked using an XPath locator
            WebElement ClickonGraphs = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gn-ques\"]/div/div/div[4]/h5")));

            // Perform the click action on the element
            ClickonGraphs.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500);");
            
            
            //EASY:
                                                     // 1.BreadthFirstSearch:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //BreadthFirstSearch VIDEO
            WebElement BreadthFirstSearch_video = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[1]/table/tbody/tr[1]/td[1]/a")));
            BreadthFirstSearch_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //BreadthFirstSearch Blog
            WebElement BreadthFirstSearch_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[1]/table/tbody/tr[1]/td[2]/a")));
            BreadthFirstSearch_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //BreadthFirstSearch Code
            WebElement BreadthFirstSearch_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[1]/table/tbody/tr[1]/td[3]/a")));
            BreadthFirstSearch_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                 // 2.DepthFirstSearch:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //DepthFirstSearch VIDEO
            WebElement DepthFirstSearch_video = wait1111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"question-Graphs\"]/div/div[1]/table/tbody/tr[2]/td[1]/a")));
            DepthFirstSearch_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //DepthFirstSearch Blog
            WebElement DepthFirstSearch_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[1]/table/tbody/tr[2]/td[2]/a")));
            DepthFirstSearch_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //DepthFirstSearch Code
            WebElement DepthFirstSearch_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[1]/table/tbody/tr[2]/td[3]/a")));
            DepthFirstSearch_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
            //Medium:
            
                                            // 1.DetectingCycleInAGraph:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //DetectingCycleInAGraph VIDEO
            WebElement DetectingCycleInAGraph_video = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[1]/td[1]/a")));
            DetectingCycleInAGraph_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //DetectingCycleInAGraph Blog
            WebElement DetectingCycleInAGraph_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")));
            DetectingCycleInAGraph_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //DetectingCycleInAGraph Code
            WebElement DetectingCycleInAGraph_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[1]/td[3]/a")));
            DetectingCycleInAGraph_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                     // 2.KrushkalMST:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //KrushkalMST VIDEO
            WebElement KrushkalMST_video = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[2]/td[1]/a")));
            KrushkalMST_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //KrushkalMST Blog
            WebElement KrushkalMST_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[2]/td[2]/a")));
            KrushkalMST_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //KrushkalMST Code
            WebElement KrushkalMST_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[2]/td[3]/a")));
            KrushkalMST_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                // 3.PrimsMST
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //PrimsMST VIDEO
            WebElement PrimsMST_video = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[3]/td[1]/a")));
            PrimsMST_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //PrimsMST Blog
            WebElement PrimsMST_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[3]/td[2]/a")));
            PrimsMST_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //PrimsMST Code
            WebElement PrimsMST_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[3]/td[3]/a")));
            PrimsMST_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                         // 4.TopologicalSort
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //TopologicalSort VIDEO
			WebElement TopologicalSort_video = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[4]/td[1]/a")));
			TopologicalSort_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//TopologicalSort Blog
			WebElement TopologicalSort_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[4]/td[2]/a")));
			TopologicalSort_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//TopologicalSort Code
			WebElement TopologicalSort_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[2]/table/tbody/tr[4]/td[3]/a")));
			TopologicalSort_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			//HARD:
                                                // 1.AStarAlgorithm:
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //AStarAlgorithm VIDEO
			WebElement AStarAlgorithm_video = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[1]/td[1]/a")));
			AStarAlgorithm_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//AStarAlgorithm Blog
			WebElement AStarAlgorithm_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[1]/td[2]/a")));
			AStarAlgorithm_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//AStarAlgorithm Code
			WebElement AStarAlgorithm_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[1]/td[3]/a")));
			AStarAlgorithm_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			                                   // 2.BridgeEdgeOfGraph:
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //BridgeEdgeOfGraph VIDEO
			WebElement BridgeEdgeOfGraph_video = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[2]/td[1]/a")));
			BridgeEdgeOfGraph_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//BridgeEdgeOfGraph Blog
			WebElement BridgeEdgeOfGraph_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[2]/td[2]/a")));
			BridgeEdgeOfGraph_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//BridgeEdgeOfGraph Code
			WebElement BridgeEdgeOfGraph_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[2]/td[3]/a")));
			BridgeEdgeOfGraph_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
            
			                                       // 3.DijkstraAlgorithm
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //DijkstraAlgorithm VIDEO
            WebElement DijkstraAlgorithm_video = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[3]/td[1]/a")));
            DijkstraAlgorithm_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //DijkstraAlgorithm Blog
            WebElement DijkstraAlgorithm_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[3]/td[2]/a")));
            DijkstraAlgorithm_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //DijkstraAlgorithm Code
            WebElement DijkstraAlgorithm_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[3]/td[3]/a")));
            DijkstraAlgorithm_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                         // 4.KruthMorrisPrattAlgorithm
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //KruthMorrisPrattAlgorithm VIDEO
			WebElement KruthMorrisPrattAlgorithm_video = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[4]/td[1]/a")));
			KruthMorrisPrattAlgorithm_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//KruthMorrisPrattAlgorithm Blog
			WebElement KruthMorrisPrattAlgorithm_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[4]/td[2]/a")));
			KruthMorrisPrattAlgorithm_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//KruthMorrisPrattAlgorithm Code
			WebElement KruthMorrisPrattAlgorithm_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[4]/td[3]/a")));
			KruthMorrisPrattAlgorithm_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			                                    // 5.TwoEdgeConnectedGraph
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //TwoEdgeConnectedGraph VIDEO
			WebElement TwoEdgeConnectedGraph_video = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[5]/td[1]/a")));
			TwoEdgeConnectedGraph_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//TwoEdgeConnectedGraph Blog
			WebElement TwoEdgeConnectedGraph_blog = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[5]/td[2]/a")));
			TwoEdgeConnectedGraph_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//TwoEdgeConnectedGraph Code
			WebElement TwoEdgeConnectedGraph_code = wait1111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Graphs\"]/div/div[3]/table/tbody/tr[5]/td[3]/a")));
			TwoEdgeConnectedGraph_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
                                                        // LinkedList:
            
            // Wait for the element to be clickable (timeout: 10 seconds)
            WebDriverWait wait11111 = new WebDriverWait(driver, Duration.ofSeconds(20));

            
           // Find the element to be clicked using an XPath locator
            WebElement ClickonLinkedList = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gn-ques\"]/div/div/div[4]/h5")));

            // Perform the click action on the element
            ClickonLinkedList.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500);");
            
            
            //EASY:
                                                     // 1.BreadthFirstSearch:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //DoublyLinkedListCRUD VIDEO
            WebElement DoublyLinkedListCRUD_video = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[1]/table/tbody/tr[1]/td[1]/a")));
            DoublyLinkedListCRUD_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //DoublyLinkedListCRUD Blog
            WebElement DoublyLinkedListCRUD_blog = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[1]/table/tbody/tr[1]/td[2]/a")));
            DoublyLinkedListCRUD_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //DoublyLinkedListCRUD Code
            WebElement DoublyLinkedListCRUD_code = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[1]/table/tbody/tr[1]/td[3]/a")));
            DoublyLinkedListCRUD_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                 // 2.LinkedListPalindrome:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //LinkedListPalindrome VIDEO
            WebElement LinkedListPalindrome_video = wait11111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[1]/table/tbody/tr[2]/td[1]/a")));
            LinkedListPalindrome_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //LinkedListPalindrome Blog
            WebElement LinkedListPalindrome_blog = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[1]/table/tbody/tr[2]/td[2]/a")));
            LinkedListPalindrome_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //LinkedListPalindrome Code
            WebElement LinkedListPalindrome_code = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[1]/table/tbody/tr[2]/td[3]/a")));
            LinkedListPalindrome_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                       // 3.SinglyLinkedListCRUD
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //SinglyLinkedListCRUD VIDEO
            WebElement SinglyLinkedListCRUD_video = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[1]/table/tbody/tr[3]/td[1]/a")));
            SinglyLinkedListCRUD_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //SinglyLinkedListCRUD Blog
            WebElement SinglyLinkedListCRUD_blog = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[1]/table/tbody/tr[3]/td[2]/a")));
            SinglyLinkedListCRUD_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //SinglyLinkedListCRUD Code
            WebElement SinglyLinkedListCRUD_code = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[1]/table/tbody/tr[3]/td[3]/a")));
            SinglyLinkedListCRUD_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
            //Medium:
            
                                            // 1.FindingLoopInLinkedList:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //FindingLoopInLinkedList VIDEO
            WebElement FindingLoopInLinkedList_video = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[2]/table/tbody/tr[1]/td[1]/a")));
            FindingLoopInLinkedList_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //FindingLoopInLinkedList Blog
            WebElement FindingLoopInLinkedList_blog = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[2]/table/tbody/tr[1]/td[2]/a")));
            FindingLoopInLinkedList_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //FindingLoopInLinkedList Code
            WebElement FindingLoopInLinkedList_code = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[2]/table/tbody/tr[1]/td[3]/a")));
            FindingLoopInLinkedList_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                     // 2.ReversingALinkedList:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //ReversingALinkedList VIDEO
            WebElement ReversingALinkedList_video = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[2]/table/tbody/tr[2]/td[1]/a")));
            ReversingALinkedList_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //ReversingALinkedList Blog
            WebElement ReversingALinkedList_blog = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[2]/table/tbody/tr[2]/td[2]/a")));
            ReversingALinkedList_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //ReversingALinkedList Code
            WebElement ReversingALinkedList_code = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[2]/table/tbody/tr[2]/td[3]/a")));
            ReversingALinkedList_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
			
			//HARD:
                                                // 1.AddTwoNumbersInSinglyLinkedList:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //AddTwoNumbersInSinglyLinkedList VIDEO
			WebElement AddTwoNumbersInSinglyLinkedList_video = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[3]/table/tbody/tr[1]/td[1]/a")));
			AddTwoNumbersInSinglyLinkedList_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//AddTwoNumbersInSinglyLinkedList Blog
			WebElement AddTwoNumbersInSinglyLinkedList_blog = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[3]/table/tbody/tr[1]/td[2]/a")));
			AddTwoNumbersInSinglyLinkedList_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//AddTwoNumbersInSinglyLinkedList Code
			WebElement AddTwoNumbersInSinglyLinkedList_code = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[3]/table/tbody/tr[1]/td[3]/a")));
			AddTwoNumbersInSinglyLinkedList_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
			                                   // 2.FindMedianFromTwoSortedLinkedList:
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //FindMedianFromTwoSortedLinkedList VIDEO
			WebElement FindMedianFromTwoSortedLinkedList_video = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[3]/table/tbody/tr[2]/td[1]/a")));
			FindMedianFromTwoSortedLinkedList_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//FindMedianFromTwoSortedLinkedList Blog
			WebElement FindMedianFromTwoSortedLinkedList_blog = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[3]/table/tbody/tr[2]/td[2]/a")));
			FindMedianFromTwoSortedLinkedList_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//FindMedianFromTwoSortedLinkedList Code
			WebElement FindMedianFromTwoSortedLinkedList_code = wait11111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-LinkedList\"]/div/div[3]/table/tbody/tr[2]/td[3]/a")));
			FindMedianFromTwoSortedLinkedList_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
                                               // Searching:
            
            // Wait for the element to be clickable (timeout: 10 seconds)
            WebDriverWait wait111111 = new WebDriverWait(driver, Duration.ofSeconds(20));

            
           // Find the element to be clicked using an XPath locator
            WebElement ClickonSearching = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gn-ques\"]/div/div/div[6]/h5/button")));

            // Perform the click action on the element
            ClickonSearching.click();

            // Wait for a brief moment
            Thread.sleep(2000);
            
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 500);");
            
            
            //EASY:
                                                     // 1.BinarySearch:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //BinarySearch VIDEO
            WebElement BinarySearch_video = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Searching\"]/div/div[1]/table/tbody/tr[1]/td[1]/a")));
            BinarySearch_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //BinarySearch Blog
            WebElement BinarySearch_blog = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Searching\"]/div/div[1]/table/tbody/tr[1]/td[2]/a")));
            BinarySearch_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //BinarySearch Code
            WebElement BinarySearch_code = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Searching\"]/div/div[1]/table/tbody/tr[1]/td[3]/a")));
            BinarySearch_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
                                                 // 2.LinearSearch:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //LinearSearch VIDEO
            WebElement LinearSearch_video = wait111111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"question-Searching\"]/div/div[1]/table/tbody/tr[2]/td[1]/a")));
            LinearSearch_video.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //LinearSearch Blog
            WebElement LinearSearch_blog = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Searching\"]/div/div[1]/table/tbody/tr[2]/td[2]/a")));
            LinearSearch_blog.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            //LinearSearch Code
            WebElement LinearSearch_code = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"question-Searching\\\"]/div/div[1]/table/tbody/tr[2]/td[3]/a")));
            LinearSearch_code.click();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            
            //MEDIUM:
                                                  // 1.BreadthFirstSearch2:
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
            //BreadthFirstSearch2 VIDEO
			WebElement BreadthFirstSearch2_video = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Searching\"]/div/div[1]/table/tbody/tr[1]/td[1]/a")));
			BreadthFirstSearch2_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//BreadthFirstSearch2 Blog
			WebElement BreadthFirstSearch2_blog = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Searching\"]/div/div[1]/table/tbody/tr[1]/td[2]/a")));
			BreadthFirstSearch2_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//BreadthFirstSearch2 Code
			WebElement BreadthFirstSearch2_code = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Searching\"]/div/div[1]/table/tbody/tr[1]/td[3]/a")));
			BreadthFirstSearch2_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);

                                                      // 2.DepthFirstSearch2:
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 200);");
            Thread.sleep(2000);
			//DepthFirstSearch2 VIDEO
			WebElement DepthFirstSearch2_video = wait111111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"question-Searching\"]/div/div[2]/table/tbody/tr[2]/td[1]/a")));
			DepthFirstSearch2_video.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//DepthFirstSearch2 Blog
			WebElement DepthFirstSearch2_blog = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Searching\"]/div/div[2]/table/tbody/tr[2]/td[2]/a")));
			DepthFirstSearch2_blog.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			//DepthFirstSearch2 Code
			WebElement DepthFirstSearch2_code = wait111111.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"question-Searching\"]/div/div[2]/table/tbody/tr[2]/td[3]/a")));
			DepthFirstSearch2_code.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

	}
}