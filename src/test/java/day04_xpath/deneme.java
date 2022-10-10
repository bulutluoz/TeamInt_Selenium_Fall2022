package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");

        List<WebElement> viewProductList=driver.findElements(By.tagName("a"));



        System.out.println(viewProductList.size());

        for (WebElement eachElement: viewProductList
             ) {
            System.out.println(eachElement.getText());
        }

        driver.close();
    }
}
