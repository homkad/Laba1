package Order;

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

    public void Menu(String selector){
        WebElement tn = driver.findElement(By.xpath(selector));
        tn.click();
    }
    public void Katusky(String selector){
        WebElement tn = driver.findElement(By.xpath(selector));
        tn.click();
    }
    public void Kat(String selector){
        WebElement tn = driver.findElement(By.xpath(selector));
        tn.click();
    }
    public void Add(String selector){
        WebElement tn = driver.findElement(By.xpath(selector));
        tn.click();
    }
    public void Bin(String selector){
        WebElement tn = driver.findElement(By.xpath(selector));
        tn.click();
    }
}


