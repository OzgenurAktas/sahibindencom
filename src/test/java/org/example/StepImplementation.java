package org.example;


import com.thoughtworks.gauge.Step;
import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static driver.Driver.webDriver;


public class StepImplementation extends Metods {
    String searchBar = "//*[@id='searchText']";
    String seachBtn = "//*[@value='Ara']";
    String houseopen = "//*[@data-category='3518' and contains(text(),'Konut')]";
    String saveSearch = "//*[text()='Aramayı Kaydet']";
    String cookies = "//*[@id='onetrust-accept-btn-handler']";
    String forRent = "//*[@title='Kiralık']";
    String circle = "//*[@title=\"Daire\"]";
    String city = "//*[@class='faceted-select' and contains(text(),'İstanbul')]";
    String searchcity = "//*[@class=\"js-address-filter\" and @placeholder=\"İl\"]";

    String cityDropDownChoose = "//*[@class=\"address-search-list\"]//*[@data-level=\"city\" and contains(@data-label,\"CITYHERE\")]";
    String district="//*[@class='faceted-select' and contains(text(),'İlçe')]";
    String searchdistrict="//*[@class='js-address-filter' and @placeholder='İlçe']";
    String districtDropDownChoose="//*[@data-level=\"town\" and @data-label=\"DİSTRİCTHERE\"]";





    @Step("Search <text>")
    public void searchText(String text) {
        yaz(text, searchBar);
        pressEnter(searchBar);
    }

    @Step("Open House Tab")
    public void openHouseTab() {
        tiklama(houseopen);
    }

    @Step("Click Save Search")
    public void saveSearch() {
        tiklama(saveSearch);
    }

    @Step("Click Turn off cookies")
    public void turnoffCookies() {
        tiklama(cookies);
    }

    @Step("Click on rent")
    public void forRent() {
        tiklama(forRent);
    }

    @Step("Click apartment")
    public void clickApartment() {
        tiklama(circle);
    }

    @Step("Select <text> in city Dropdown")
    public void clickcity(String text) {
        tiklama(city);
        yaz(text, searchcity);
        String xpathElement = cityDropDownChoose.replaceAll("CITYHERE", text);
        hoverElement(xpathElement);
        clickWithSelenium(xpathElement);
    }
    @Step("Select <text> in district Dropdown")
    public void clickDistrict(String text){
        tiklama(district);
        yaz(text, searchdistrict);
        String xpathElement = districtDropDownChoose.replaceAll("DİSTRİCTHERE", text);
        hoverElement(xpathElement);
        tiklama(xpathElement);
    }


}

    /*
    WebDriverWait webDriverWait=new WebDriverWait(webDriver, Duration.ofSeconds(10));
    @Step("<yazi> yaziyi <xpath> alanına yaz")
    public void arama_cubugu(String yazi,String xpath) {
        By by=By.xpath(xpath);
        WebElement yaz= webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        yaz.sendKeys(yazi);
        yaz.sendKeys(Keys.ENTER);
    }

    @Step("<xpath> e tıkla")
    public void tiklama_tik(String xpath) throws InterruptedException {
        By by=By.xpath(xpath);
        Thread.sleep(2000);
        beklee(2);
        WebElement tiklama=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", tiklama);
        System.out.println(xpath+" Tıklandı");
    }
    @Step("<xpath> e tıkla2")
    public void tiklama_tik2(String xpath) throws InterruptedException {
        By by=By.xpath(xpath);
        beklee(4);
        WebElement tiklama=webDriver.findElement(by);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", tiklama);
        System.out.println(xpath+" tıklandı");
        //tiklama.click();

    }
    @Step("<xpath> e tıkla yazı yaz")
    public void tikla_yaz(String xpath){
        By by=By.xpath(xpath);
        beklee(3);
        WebElement tiklama1=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        tiklama1.click();
        tiklama1.sendKeys("Kadiköy");
    }

    @Step("<xpath> e tıkla mahalle adı yaz")
    public void tikla_yaz_1(String xpath){
        By by=By.xpath(xpath);
        beklee(3);
        WebElement tiklama2=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        tiklama2.click();
        beklee(2);
        tiklama2.sendKeys("Erenköy");
    }

    @Step("<xpath> e tikla baslangic tutarini <xpath> e tikla bitis tutarini yaz")
    public void baslangic_bitis(String xpath1,String xpath2){
        By by=By.xpath(xpath1);
        WebElement tikla_baslangic=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        tikla_baslangic.click();
        tikla_baslangic.sendKeys("1000");

        By by1=By.xpath(xpath2);
        WebElement tikla_bitis=webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by1));
        tikla_bitis.click();
        tikla_bitis.sendKeys("25.000");

    }

    @Step("butun listeyi yaz")
    public void writeList(){
        beklee(5);
        WebElement elements= webDriver.findElement(By.xpath("(//*[@class=\"classifiedTitle\"])[1]"));
        System.out.println(". list"+elements.getText());


    }
    public static void beklee ( int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

     */


