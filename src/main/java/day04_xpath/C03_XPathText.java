package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_XPathText {
    public static void main(String[] args) {
        /*
          bir web element link olmasa da text icerebilir
          link olmayan bir html element'de By.linktext kullanilamaz
          ancak text kullanilarak xpat yazilabilir

          //tagName[text()='yazi']

          tagName onemli degilse * yazilabilir
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin

        WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']"));
        addButonu.click();
        //3- Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButonu=driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete butonu gorunme testi PASSED");
        }else{
            System.out.println("Delete butonu gorunmuyor, test FAILED");
        }
        //4- Delete tusuna basin
        deleteButonu.click();

        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

        WebElement addRemoveButon= driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));
        if (addRemoveButon.isDisplayed()){
            System.out.println("Add Remove yazisi gorunuyor, test PASSED");
        }else {
            System.out.println("Add Remove yazisi gorunmuyor, test FAILED");
        }

        driver.close();
    }

}
