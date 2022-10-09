package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_RelativeLocators {

    public static void main(String[] args) {
        /* 1- https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
           2- relativeLocators kullanarak Boston webelementini 3 farkli sekilde locate edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // london'in sagi, berlin'in solu seklinde tarif edelim

        WebElement london= driver.findElement(By.id("pid5_price"));
        WebElement berlin= driver.findElement(By.id("pid7_price"));

        WebElement boston1= driver.findElement(RelativeLocator
                                                .with(By.tagName("p"))
                                                .toRightOf(london)
                                                .toLeftOf(berlin));

        System.out.println(boston1.getAttribute("id")); // pid6_price


        // toronto'nun alti diyelim

        WebElement toronto= driver.findElement(By.id("pid2_price"));

        WebElement boston2=driver.findElement(RelativeLocator
                                            .with(By.className("ui-li-aside"))
                                            .below(toronto));

        System.out.println(boston2.getAttribute("id")); // pid6_price


        // Mountie'nin ustunde
        WebElement mountie= driver.findElement(By.id("pid10_price"));
        WebElement amsterdam= driver.findElement(By.id("pid9_price"));

        WebElement boston3= driver.findElement(RelativeLocator
                                                .with(By.tagName("p"))
                                                .above(mountie));
        System.out.println(boston3.getAttribute("id")); // pid6_price

        driver.close();
    }
}
