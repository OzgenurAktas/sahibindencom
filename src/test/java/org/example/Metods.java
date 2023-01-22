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

    public boolean doesElementExist(String xpath){
        WebElement element=null;
        By by=By.xpath(xpath);
        boolean doesElementExist=false;
        try {
            element=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
            doesElementExist=true;
            System.out.println("Element found " + xpath);
        }catch (Exception e){
            doesElementExist=false;
            System.out.println("Element not found " +xpath);
        }
        return doesElementExist;
    }

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
        bekle(4);
        WebElement element=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        element.click();
        System.out.println(xpath+" Tıklandı");
    }
    public void hoverElement(String xpath){
        By by=By.xpath(xpath);
        WebElement element=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        action.moveToElement(element).perform();
        bekle(1);
        System.out.println("Focused on the element "+ xpath);
    }
    public void write(String yazi,String xpath){
        By by=By.xpath(xpath);
        bekle(3);
        WebElement yaz= webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        yaz.sendKeys(yazi);
        System.out.println("The value entered by the user is written xpath="+xpath+" text= "+yazi);
    }
    public void pressEnter(String xpath){
        By by=By.xpath(xpath);
        bekle(3);
        WebElement pressEnter1= webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        pressEnter1.sendKeys(Keys.ENTER);
        System.out.println("Clicked Enter " + xpath);
    }
    public static void bekle ( int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void clear(String xpath){
        bekle(1);
        webDriver.findElement(new By.ByXPath(xpath)).clear();
        bekle(1);
        System.out.println("Textbox cleared " +xpath);
    }
}
