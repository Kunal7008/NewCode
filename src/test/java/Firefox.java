import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
    @Test
    public void get(){
        System.setProperty("webdriver.gecko.driver","F:\\downloads\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get("https://flipkart.com");
    }
}
