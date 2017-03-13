package Article;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Dima on 11.03.2017.
 */
public class Methods {
    WebDriver driver;

    public Methods(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement findElement(String s) {
        return driver.findElement(By.xpath(s));
    }

    public void Stat(String selector) {
        WebElement tt = driver.findElement(By.xpath(selector));
        tt.click();
    }

    public void Obzor(String selector) {
        WebElement tt = driver.findElement(By.xpath(selector));
        tt.click();
    }

    public void Next(String selector) {
        WebElement tt = driver.findElement(By.xpath(selector));
        tt.click();
    }
}