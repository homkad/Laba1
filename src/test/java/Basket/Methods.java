package Basket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Dima on 12.03.2017.
 */
public class Methods {
    WebDriver driver;

    public Methods(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement findElement(String s) {
        return driver.findElement(By.xpath(s));
    }

    public void Bin(String selector){
        WebElement ts = driver.findElement(By.xpath(selector));
        ts.click();
    }
    public void Del(String selector){
        WebElement ts = driver.findElement(By.xpath(selector));
        ts.click();
    }
    public void Quit(String selector){
        WebElement ts = driver.findElement(By.xpath(selector));
        ts.click();
    }
}
