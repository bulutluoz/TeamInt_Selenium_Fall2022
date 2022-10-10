package day03_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_LocatorTesti {
    public static void main(String[] args) throws InterruptedException {
        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        //	a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //	b. Search(ara) “city bike”
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike");
        aramaKutusu.submit();
        //	c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> sonucWebelementListe= driver.findElements(By.className("sg-col-inner"));
        // bu listenin 1.elementi bulunan sonuc sayisi

        System.out.println(sonucWebelementListe.get(0).getText());

        //	d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

        driver.findElement(By.className("s-image")).click();
        /*
        Eger bir locate ile birden fazla element bulunuyorsa
        selenium ilk elementi kullanir

         */
        Thread.sleep(5000);

        driver.close();
    }
}
