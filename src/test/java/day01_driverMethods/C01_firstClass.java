package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_firstClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        /* 1- selenium sitesinden sizin isletim sisteminize uygun
              selenium dosyalarini indirin,
              masaustune olusturacaginiz bir klasore, bu zip dosyasini acin
           2- selenium sitesinden, browsers sekmesinde
              bilgisayariniza uygun driver'i indirin, zip dosyasindan cikarip
              masaustune tasiyin
           3- selenium sitesinden indirdiginiz chrome surumu ile
              bilgisayardaki chromebrowser surumunun ayni oldugundan emin olun
              ayni degilse, bilgisayardaki chrome browser'i update edin
           4- yeni bir proje olusturun,
              proje olusturma asamasinda build-system olarak maven secin
           5- src altinda resources klasoru olusturun
              bu klasorun icine indirip, masaustune actigimiz
              selenium klasoru ve chromedriver dosyalarini tasiyin
           6- File/project structure menusunden
              modules ve dependencies'i secin
              + tusuna basip, projeye ekledigimiz selenium klasoru icindeki
              tum jar dosyalarini secip
              apply ve Ok tuslarina basin
           7-  src/main/java altinda bir class olusturun
           8- class'da main method olusturup yukaridaki kodlari yazin

             NOT : 9.satirdaki 2.parametre windows ve mac icin farklidir



         */
    }
}
