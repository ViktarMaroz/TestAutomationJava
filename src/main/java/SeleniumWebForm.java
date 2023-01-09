import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class SeleniumWebForm {
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        /*Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        */
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        String title = driver.getTitle();
        System.out.println(title);

        WebElement textBox = driver.findElement(By.id("my-text-id"));
        textBox.sendKeys("John Doe");

        //Explicit wait
        WebElement submitButt = new WebDriverWait(driver,Duration.ofSeconds(5))
                //.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button [@class='btn btn-outline-primary mt-3']")));
                        .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button")));
       submitButt.click();



       Thread.sleep(2000);
       driver.close();
    }
}
