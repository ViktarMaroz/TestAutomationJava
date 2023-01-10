import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Five_BrowserTabsOrWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        try {
            //first window/tab with its descriptor:
            driver.get("https://viktarmaroz.github.io/WebPage");
            Thread.sleep(5000);
            String window1 = driver.getWindowHandle();

            //second window/tab:
            js.executeScript("window.open();");

            //with its descriptor:
            Set<String> currentWindows = driver.getWindowHandles();
            String window2 = null;
            for (String window : currentWindows){
                if(!window.equals(window1)){
                    window2 = window;
                    break;
                }
            }
            driver.switchTo().window(window2);
            driver.get("https://google.com");
            Thread.sleep(2000);
            WebElement buttonCook = driver.findElement(By.xpath("//div [@class = 'QS5gu sy4vM']"));
            buttonCook.click();
            Thread.sleep(2000);

            /*
            to close the current tab/window
            driver.close();
            !!! Do not forget - after tab closure selenium lefts on the same window. To proceed to work with another
            tab you need to switch to it!
            */
            driver.switchTo().window(window1);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            Thread.sleep(5000);
            driver.quit();
        }
    }
}
