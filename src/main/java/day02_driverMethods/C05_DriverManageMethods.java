package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.manage().window().maximize();


        /*
        waits konusu ilerde daha genis anlatilacak
         Implicitly wait driver'in aradigi elementleri bulabilmesi icin
         kendisine verdigimiz arastirma suresidir
         o sure icerisinde aradigi elementi bulamazsa hata verir
         */

        driver.manage().window().fullscreen();

        System.out.println("fullscreen position "+ driver.manage().window().getPosition());
        System.out.println("fullscreen size"+driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().maximize();

        System.out.println("maximize position "+ driver.manage().window().getPosition());
        System.out.println("maximize size"+driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.manage().window().minimize();

        System.out.println("minimize position "+ driver.manage().window().getPosition());
        System.out.println("minimize size"+driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.close();

        driver.manage().window().getPosition();
        driver.manage().window().getSize();


    }
}
