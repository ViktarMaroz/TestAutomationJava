package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();


            try {
                driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
                Thread.sleep(2000);
                WebElement element1 = driver.findElement(By.id("draggable"));
                WebElement element2 = driver.findElement(By.id("droppable"));
                Actions actions = new Actions(driver);
                actions.moveToElement(element1).clickAndHold().moveToElement(element2).release().build().perform();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                driver.get("https://www.selenium.dev/selenium/web/droppableItems.html");
                Thread.sleep(2000);
                WebElement drag = driver.findElement(By.id("draggable"));
                WebElement drop = driver.findElement(By.id("droppable"));
                Actions dragAndD = new Actions(driver);
                dragAndD.dragAndDrop(drag,drop).build().perform();
                System.out.println("The specified elements are draganddropped successfully!");
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            finally{
                Thread.sleep(1000);
                driver.quit();
            }

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
            //11.44.55


        }

    }
