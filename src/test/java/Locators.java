import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://sso.teachable.com/secure/9521/identity/login");
        driver.findElement(By.id("email")).sendKeys("Blagoje");
        driver.findElement(By.id("password")).sendKeys("king");
        driver.findElement(By.className("btn-primary")).click();
        System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());
//        Thread.sleep(30000);
//        WebDriverWait w  = new WebDriverWait(driver,10);
//        w.until(ExpectedConditions.presenceOfElementLocated(By.className("inline-error")));
        driver.findElement(By.className("p-v-5-m")).click();
        driver.findElement(By.cssSelector("a.bodySmall")).click();
//        WebDriverWait w  = new WebDriverWait(driver,10);
//        w.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Reset your password by providing your account email below.")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("King");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector("div span")).getText());






    }
}
