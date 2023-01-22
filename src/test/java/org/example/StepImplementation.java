package org.example;


import com.thoughtworks.gauge.Step;
import dev.failsafe.internal.util.Assert;
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
    String districtDropDownChoose="//*[@data-level=\"town\" and @data-label=\"DİSTRİCTHERE\"]//i";
    String closedistrict="//*[@class='collapse-pane']";
    String area="//*[@data-address=\"quarter\"]//*[@class='faceted-select']";
    String areaSearch="//*[@class=\"js-address-filter\" and @placeholder=\"Semt / Mahalle\"]";
    String areaDropDownChoose="//li//*[contains(text(),'AREAHERE')]/i";
    String closeArea="//*[@data-address='quarter']//*[contains(@class,'collapse-pane')]";
    String minRent="//*[@placeholder=\"min TL\"]";
    String maxRent="//*[@placeholder=\"max TL\"]";
    String numberofRoom="//*[@title=\"2+1\"]";
    String numberofRoom2="//*[@title=\"3+1\"]";
    String searchData="//*[@class=\"btn btn-block search-submit\" and text()=\"Ara\"]";
    String sortBy="//*[@title=\"Fiyat\"]";
    String amount="//*[@class=\"facetedFilteredLink\" and @title=\"AMOUNT\"]";



    @Step("is amount correct <min> <max>")
    public void isAmounthCorrect(String min,String max){
        amount=amount.replaceAll("AMOUNT",min+" - "+max);
        Assert.isTrue(doesElementExist(amount),"Search is unsuccsefull ");
    }
    @Step("Search <text>")
    public void searchText(String text) {
        write(text, searchBar);
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
        write(text, searchcity);
        String xpathElement = cityDropDownChoose.replaceAll("CITYHERE", text);
        hoverElement(xpathElement);
        clickWithSelenium(xpathElement);
    }
    @Step("Select <text> in district Dropdown")
    public void clickDistrict(String text){
        tiklama(district);
        write(text, searchdistrict);
        String xpathElement = districtDropDownChoose.replaceAll("DİSTRİCTHERE", text);
        tiklama(xpathElement);
        tiklama(closedistrict);
    }
    @Step("Select <text> in area Dropdown")
    public void clickArea(String text){
        tiklama(area);
        bekle(2);
        clear(areaSearch);
        write(text, areaSearch);
        String xpathElement = areaDropDownChoose.replaceAll("AREAHERE", text);
        tiklama(xpathElement);
        tiklama(closeArea);
    }
    @Step("Click enter the minimum <text> and maximum <text> rental amount")
    public void rentAmount(String min,String max){
        tiklama(minRent);
        write(min,minRent);
        tiklama(maxRent);
        write(max,maxRent);
    }
    @Step("Click on the number of rooms you want")
    public void numberOfRooms(){
        tiklama(numberofRoom);
        tiklama(numberofRoom2);
    }
    @Step("Fetch the data in the property I selected")
    public void search(){
        tiklama(searchData);
    }

    @Step("Sort from lowest to highest")
    public void sortByPrice(){
        tiklama(sortBy);
    }
}




