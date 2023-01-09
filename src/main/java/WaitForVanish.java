import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitForVanish {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait opener = new WebDriverWait(driver,Duration.ofSeconds(5));


        try {

            driver.get("https://pagination.js.org/");
            Thread.sleep(2000);

            List<WebElement> elements = driver.findElements(By.xpath("//div [@class ='data-container']/ul/li"));
            List<WebElement> pages = driver.findElements(By.xpath("//div [@class ='paginationjs-pages']/ul/li"));

            String outprint = elements.get(5).getText();
            System.out.println("First page "+ outprint);

            pages.get(2).click();
            opener.until(ExpectedConditions.stalenessOf(elements.get(5)));
            elements = driver.findElements(By.xpath("//div [@class ='data-container']/ul/li"));
            pages = driver.findElements(By.xpath("//div [@class ='paginationjs-pages']/ul/li"));
            outprint = elements.get(5).getText();
            System.out.println("Second page "+ outprint);

            pages.get(5).click();
            opener.until(ExpectedConditions.stalenessOf(elements.get(5)));
            elements = driver.findElements(By.xpath("//div [@class ='data-container']/ul/li"));
            outprint = elements.get(5).getText();
            System.out.println("Fifth page "+ outprint);



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            Thread.sleep(5000);
            driver.quit();
        }


    }
}
