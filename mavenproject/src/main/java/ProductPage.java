import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickproduct(){ driver.findElement(By.cssSelector("#product-306815 .name span")).click(); }
    public void clickaddcart(){
        driver.findElement(By.cssSelector("#button-cart > span")).click();
    }
    public void clickcartitems(){
        driver.findElement(By.id("cart-items")).click();
    }
    public void clickgocart(){
        driver.findElement(By.id("js-cart")).click();
    }

    public void apply() {

        // 1 | open | / |
        driver.get("https://www.kitapyurdu.com/");
        // 2 | setWindowSize | 1304x768 |
        driver.manage().window().setSize(new Dimension(1304, 768));
        // 3 | click | id=search-input |
        driver.findElement(By.id("search-input")).click();
        // 4 | type | id=search-input | roman
        driver.findElement(By.id("search-input")).sendKeys("roman");
        // 5 | sendKeys | id=search-input | ${KEY_ENTER}
        driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);
        // 6 | click | css=#product-306815 .name span |
        driver.findElement(By.cssSelector("#product-306815 .name span")).click();
        // 7 | click | css=#button-cart > span |
        driver.findElement(By.cssSelector("#button-cart > span")).click();
        // 8 | click | id=cart-items |
        driver.findElement(By.id("cart-items")).click();
        // 9 | click | id=js-cart |
        driver.findElement(By.id("js-cart")).click();
        // 10 | click | name=quantity |
        driver.findElement(By.name("quantity")).click();
        // 11 | type | name=quantity | 2
        driver.findElement(By.name("quantity")).sendKeys("2");
        // 12 | click | css=.fa-refresh |
        driver.findElement(By.cssSelector(".fa-refresh")).click();
        // 13 | click | css=.red-icon |
        driver.findElement(By.cssSelector(".red-icon")).click();

    }
}
