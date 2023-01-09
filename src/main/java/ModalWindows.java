import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class ModalWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            driver.get("https://viktarmaroz.github.io/WebPage");
            Thread.sleep(2000);

            WebElement mwone = driver.findElement(By.id("a"));
            WebElement mwtwo = driver.findElement(By.id("b"));
            WebElement mwthree = driver.findElement(By.id("c"));

            mwone.click();
            Alert alert = wait.until(alertIsPresent());
            Thread.sleep(2000);
            alert.accept();

            mwtwo.click();
            Alert prompt = wait.until(alertIsPresent());
            prompt.sendKeys("Hi! Here we are!");
            Thread.sleep(2000);
            prompt.accept();
            Thread.sleep(2000);
            alert.accept();

            mwthree.click();
            Alert alertMwThree = wait.until(alertIsPresent());
            Thread.sleep(2000);
            alertMwThree.dismiss();



        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            Thread.sleep(10000);
            driver.quit();
        }


    }
}
