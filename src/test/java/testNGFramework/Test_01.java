package testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_01 {

    @Test
    public void test01(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");

        // phone icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        // arama sonucunda urun bulunabildigini test edin

        WebElement aramaSonucuElementi = driver.findElement(By.className("product-count-text"));

        String unExpectedSonuc = "0 Products Found";
        String actualSonuc = aramaSonucuElementi.getText();

        Assert.assertNotEquals(actualSonuc,unExpectedSonuc);
        /*
            JUnit Assertions ile 2 kucuk fark var
            1- Class ismi Assertions degil Assert
            2- JUnit'de once expected, sonra actual yaziliyordu
               TestNG'de once actual, sonra expected yaziliyor
         */


        // driver'i kapatin
        driver.quit();
    }


    }



