import com.gargoylesoftware.htmlunit.html.HtmlArticle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dima on 09.03.2017.
 */
public class Tests {
    WebDriver driver = new ChromeDriver();
        @BeforeSuite
        public void setUp(){
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        @AfterSuite
        public void tearDown() throws InterruptedException {
            synchronized (driver){
            }
            //driver.quit();
        }
        @Test
         public void a_logInTest() {
            Login.Methods loginM = new Login.Methods(driver);
            Login.Locators loginL = new Login.Locators();
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//lib/chromedriver.exe");
            driver.get("http://carpspot.ua/");
            //Login
            loginM.ProvideEnter(loginL.Enter);
            loginM.ProvideLogin("homkadb@gmail.com", loginL.Login);
            loginM.ProvidePass("Q36w21@", loginL.Pass);
            loginM.SubmitForm(loginL.Submit);
        }
         @Test
          public void b_articleTest() {
          Article.Methods ArticleM = new Article.Methods(driver);
          Article.Locators ArticleL = new Article.Locators();
          //Obzor
          ArticleM.Stat(ArticleL.Art);
          ArticleM.Obzor(ArticleL.Daiwa);
          ArticleM.Next(ArticleL.Down);
        }
         @Test
          public void c_orderTest() {
          Order.Methods OrderM = new Order.Methods(driver);
          Order.Locators OrderL = new Order.Locators();
          //Menu_Snasti
          OrderM.Menu(OrderL.MenuSnasti);
          OrderM.Katusky(OrderL.PodMenuKatusky);
          OrderM.Kat(OrderL.Katushka);
          OrderM.Add(OrderL.AddBasket);
         }
         @Test
          public void d_basketTest() {
             Basket.Methods BasketM = new Basket.Methods(driver);
             Basket.Locators BasketL = new Basket.Locators();
             //Korzina
             BasketM.Bin(BasketL.EnterBasket);
             BasketM.Del(BasketL.DelOrder);
             BasketM.Quit(BasketL.Exit);
 }
}


