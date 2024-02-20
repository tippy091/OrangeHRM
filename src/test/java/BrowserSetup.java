import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BrowserSetup {
    public BrowserSetup() {}
    public static WebDriver driver;
    @BeforeSuite
    public void setupBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://louis091-trials711.orangehrmlive.com/auth/login");
        Thread.sleep(3000);
    }
}
