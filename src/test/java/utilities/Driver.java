package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    public static WebDriver driver;

    public static WebDriver getDriver(){
        /*
            Bu method'u her kullandigimizda new ChromeDriver(); calisinca
            yeni bir browser aciliyor

            Biz sadece ilk defa bu method'u kullandigimizda
            new ChromeDriver(); calissin,
            sonraki kullanimlarda calismasin
            istiyoruz
         */

        if (driver == null){
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }


    public static void quitDriver(){
        driver.quit(); // acik olan browser'lari kapatir
        driver=null; // bu class'daki driver objesine null degeri atayarak
                     // yeni browser acilmasina imkan tanir
    }
}
