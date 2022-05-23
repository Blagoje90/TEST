import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        driver.manage().window().maximize();
        driver.get("https://www.kupujemprodajem.com/");
        driver.findElement(By.cssSelector("span[class*='button']")).click();
        driver.findElement(By.id("email")).sendKeys("blagoje.panic@outlook.com");
        driver.findElement(By.id("password")).sendKeys("");
        driver.findElement(By.cssSelector("span[class*='checkmark']")).click();
        driver.findElement(By.id("submitButton")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.cssSelector("div[error-name='password_required']")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[error-name='password_required']")).getText(),"Polje ne može biti prazno");



    }
}
