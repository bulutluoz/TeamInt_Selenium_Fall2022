package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) {
        /*
          Gerekli ayarlamalari yapip amazon anasayfaya gidin
          1- sayfa basligi "amazon" kelimesi icermeli
          2- sayfa url'inde "Amazon" kelimesi olmali
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");


        String expectedUrlIcerik="Amazon";

        String actualUrl= driver.getCurrentUrl();


        String expectedTitleIcerik="amazon";
        String actualTitle= driver.getTitle();

        // url test yapalim

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url test PASSED");
        }else {
            System.out.println("Url test FAILED");
            System.out.println("actual Url : " + actualUrl);
            System.out.println("Actual Url aranan " + expectedUrlIcerik + " kelimesini icermiyor");
        }

        // title test

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title Testi PASSED");
        }else {
            System.out.println("Title testi FAILED");
            System.out.println("Actual Title : " + actualTitle);
            System.out.println("Actual title aranan " + expectedTitleIcerik + " kelimesini icermiyor");
        }
        // driver.quit();
        /*
        driver.close sadece acik olan browser'i kapatir
        driver.quit ise test calisirken acilan tum browser'lari kapatir
         */
    }
}
