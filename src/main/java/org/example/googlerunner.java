package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class googlerunner {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");


        WebElement button = driver.findElement(By.xpath("//button [@id='L2AGLb']"));
        button.click();

        WebElement input = driver.findElement(By.xpath("//input [@data-ved='0ahUKEwi-0MbSz-X6AhU-AxAIHe8ZDEsQ19QECAw']"));
        input.click();

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