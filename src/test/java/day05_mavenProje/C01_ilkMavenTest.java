package day05_mavenProje;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ilkMavenTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
        //2- arama kutusunu locate edelim
        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));
        //3- “Samsung headphones” ile arama yapalim
        aramaKutusuElementi.sendKeys("Samsung headphones"+ Keys.ENTER);
        //4- Bulunan sonuc sayisini yazdiralim

        WebElement sonucSayisiElementi= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(sonucSayisiElementi.getText());
        String sonucSayisiStr=sonucSayisiElementi.getText();// 1-16 of 226 results for "Samsung headphones"

        // sonuc sayisinin 100'den fazla oldugunu test edin

        sonucSayisiStr=sonucSayisiStr.substring(
             ( sonucSayisiStr.indexOf("of")+3)  ,
                (sonucSayisiStr.indexOf("results")-1)
        );

        if (Integer.parseInt(sonucSayisiStr)>100){
            System.out.println("sonuc sayisi 100'den fazla test PASSED");
        } else {
            System.out.println("sonuc sayisi 100'den fazla degil, test FAILED");
        }
        System.out.println(sonucSayisiStr);
        // sonuc sayisinin 100'den fazla oldugunu test edin


        //5- Ilk urunu tiklayalim

        WebElement ilkUrunElementi= driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
        ilkUrunElementi.click();

        //6- Sayfadaki tum basliklari yazdiralim
        driver.navigate().back();

        List<WebElement> baslikElemetleriList= driver.findElements(By.xpath("//span[@class='a-size-base a-color-base']"));

        for (WebElement eachelement: baslikElemetleriList
             ) {
            System.out.println(eachelement.getText());
        }

        driver.close();
    }
}
