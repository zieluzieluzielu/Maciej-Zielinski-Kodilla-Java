package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String WAIT_FOR = "//select[1]";
    public final static String DAYOFBIRTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public final static String MONTHOFBIRTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public final static String YEAROFBIRTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(WAIT_FOR)).isDisplayed()) ;

        WebElement selectComboDay = driver.findElement(By.xpath(DAYOFBIRTH));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByValue("26");

        WebElement selectComboMonth = driver.findElement(By.xpath(MONTHOFBIRTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(6);

        WebElement selectComboYear = driver.findElement(By.xpath(YEAROFBIRTH));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByValue("1988");
    }

}
