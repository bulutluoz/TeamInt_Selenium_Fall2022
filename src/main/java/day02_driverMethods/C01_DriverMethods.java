package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver= new ChromeDriver();

        // driver objesi olusturunca Selenium webDriver
        // bilgisayarimizdaki chrome browser'dan bir bos sayfa actirir
        // eger firefox veya safari gibi baska bir browser kullanmak istersek
        // Selenium sitesinden o browser'in WebDriver'ini indirip projemize eklememiz gerekir

        driver.get("https://www.amazon.com");

        // eger kodlarimizi belirli bir sure bekletmek istersek

        Thread.sleep(5000); // yazilan milisaniye kadar kodlari bekletir

        System.out.println("sayfa url'i : "+driver.getCurrentUrl());

        System.out.println("Sayfanin title'i : "+driver.getTitle());



        driver.close();




    }
}
