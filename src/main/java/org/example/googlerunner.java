package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class googlerunner {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        */
        driver.get("https://google.com");
        WebElement button = driver.findElement(By.id("L2AGLb"));
        button.click();

        //explicit wait
        WebElement waitchecker = new WebDriverWait(driver,Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a [@class='gb_7 gb_8 gb_de gb_dd']")));
        waitchecker.click();



        //Actions actions = new Actions();
        /*
        actions
                .moveToElement()
                .keyDown()
                .keyUp()
                .clickAndHold()
                .release()
                .build()
                .perform();
        */
    }

}