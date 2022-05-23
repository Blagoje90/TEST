import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://3.110.88.201/dropdownsPractise/");
        WebElement staticDropdwon = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown =new Select(staticDropdwon);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());






    }
}
