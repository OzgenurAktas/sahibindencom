package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static driver.Driver.webDriver;

public class Metods {
    WebDriverWait webDriverWait=new WebDriverWait(webDriver, Duration.ofSeconds(10));
    Actions action = new Actions(webDriver);
    public  void tiklama(String xpath){
        By by=By.xpath(xpath);
        bekle(3);
        WebElement tiklama1=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", tiklama1);
        System.out.println(xpath+" Tıklandı");
    }

    public  void clickWithSelenium(String xpath){
        By by=By.xpath(xpath);
        bekle(3);
        WebElement element=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        element.click();
        System.out.println(xpath+" Tıklandı");
    }
    public void hoverElement(String xpath){
        By by=By.xpath(xpath);

        WebElement element=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        action.moveToElement(element).perform();
        bekle(1);
    }
    public void yaz(String yazi,String xpath){
        By by=By.xpath(xpath);
        bekle(3);
        WebElement yaz= webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        yaz.sendKeys(yazi);
    }
    public void pressEnter(String xpath){
        By by=By.xpath(xpath);
        bekle(3);
        WebElement pressEnter1= webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        pressEnter1.sendKeys(Keys.ENTER);
    }
    public static void bekle ( int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
