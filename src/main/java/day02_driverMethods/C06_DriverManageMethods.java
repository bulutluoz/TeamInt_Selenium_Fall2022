package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.manage().window().setSize(new Dimension(1000,700) );
        driver.manage().window().setPosition(new Point(100,100));

        Thread.sleep(2000);

        driver.manage().window().setPosition(new Point(300,300));

        Thread.sleep(2000);
        driver.close();
    }
}
