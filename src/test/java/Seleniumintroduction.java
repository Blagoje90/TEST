import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleniumintroduction {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Program Files/ChromDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.udemy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://www.udemy.com/");





    }

}
