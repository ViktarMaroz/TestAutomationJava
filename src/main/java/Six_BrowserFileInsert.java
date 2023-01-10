import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Six_BrowserFileInsert {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
        JavascriptExecutor js = (JavascriptExecutor)driver;

        try {

            driver.get("https://www.ilovepdf.com/ru/excel_to_pdf");
            //need to find: //input [@type = 'file']
            Thread.sleep(2000);
            WebElement input = driver.findElement(By.xpath("//input [@type = 'file']"));
            Thread.sleep(2000);
/*
            //The input can be invisible. To make it visible do following:
            js.executeScript("document.querySelector('div.moxie-shim.moxie-shim-html5 input[type=file]')" +
                    ".setAttribute('style', 'display: block; opacity: 1; width: 1000%; height: 1000%;');");
            Thread.sleep(5000);
*/
            input.sendKeys("C:\\Users\\mudes\\IdeaProjects\\4. Second_Selenium\\src\\main\\ExelExample.xlsx");
            Thread.sleep(2000);


            driver.get("https://convertio.co/ru/doc-png/");
            //need to find: //input [@type = 'file']
            Thread.sleep(2000);
            WebElement input1 = driver.findElement(By.xpath("//input [@type = 'file']"));
            input1.sendKeys("C:\\Users\\mudes\\IdeaProjects\\4. Second_Selenium\\src\\main\\WordExample.docx");
            Thread.sleep(2000);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            driver.quit();
        }

    }
}
