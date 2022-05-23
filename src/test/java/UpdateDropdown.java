import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://3.110.88.201/dropdownsPractise/");
        System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
        driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        int i=1 ;
        while(i<5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
