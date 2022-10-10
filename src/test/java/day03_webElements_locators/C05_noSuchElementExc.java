package day03_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_noSuchElementExc {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        List<WebElement> sonucWebelementListesi= driver.findElements(By.id("twotabsearchtextbox11"));
        System.out.println(sonucWebelementListesi.size());
        /*
         findElement ile locate edilen webelementlerde locator'da sorun olursa
         driver istenen webelementi bulamaz ve NoSuchelementException firlatir

         Buna karsin findElements method'u ile locate edilen Liste
         locator hatali olsa bile exception vermez
         bos bir list dondurur

         */

        driver.close();
    }
}
