import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://3.110.88.201/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(2000);
        List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option :options){
            if(option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }

    }
}
