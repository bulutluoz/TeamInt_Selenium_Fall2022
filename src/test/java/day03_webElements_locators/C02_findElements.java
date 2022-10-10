package day03_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        List< WebElement> yazilarElementListesi =driver.findElements(By.className("a-spacing-micro"));

        System.out.println(yazilarElementListesi.size());

        for (WebElement eachElement: yazilarElementListesi
             ) {
            System.out.println(eachElement.getSize());
        }

        driver.close();

    }
}
