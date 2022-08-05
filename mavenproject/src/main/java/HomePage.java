import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }
    public String readCsv(){
       String str="";

        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\Users\\MNS\\Desktop\\roman.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //parsing a CSV file into the constructor of Scanner class
            sc.useDelimiter(",");
            //setting comma as delimiter pattern
            while (sc.hasNext()) {
                str =sc.next();
            }
        sc.close();
        return str;
    }

    public void openhomepage(){ driver.get("https://www.kitapyurdu.com/");;
        driver.manage().window().setSize(new Dimension(1304, 768)); }
    public void clicksearch (){
        driver.findElement(By.id("search-input")).click();
    }
    public void makesearch (){ driver.findElement(By.id("search-input")).sendKeys("roman");
        driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER); }
    public void apply() {

        // 1 | open | / |
        driver.get("https://www.kitapyurdu.com/");
        // 2 | setWindowSize | 1304x768 |
        driver.manage().window().setSize(new Dimension(1304, 768));
        // 3 | click | id=search-input |
        driver.findElement(By.id("search-input")).click();
        // 4 | type | id=search-input | roman
        driver.findElement(By.id("search-input")).sendKeys(readCsv());
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
