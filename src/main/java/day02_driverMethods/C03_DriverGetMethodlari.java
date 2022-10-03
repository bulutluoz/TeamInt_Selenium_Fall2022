package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");

        WebDriver driver= new ChromeDriver();

        System.out.println(driver.getWindowHandle());
        // bize acilan browser'in handle degerini dondurur
        // CDwindow-8C07925B8CBA4C8EF3039F660C30DDA1
        // CDwindow-8C82D85FA29AED859A8A035A3D8C2337

        System.out.println(driver.getWindowHandles());
        /*
        Eger testimiz sirasinda birden fazla window acilirsa
        acilan tum window'lari window handle degerlerini bir Set olarak dondurur
        window'lar arasi gecisi bu handle degerleri ile yapariz
         */

        driver.get("https://www.amazon.com");
        System.out.println(driver.getPageSource());
        // websayfasinin tum kaynak kodlarini döndürür

        driver.close();

    }
}
