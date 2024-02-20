import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends BrowserSetup {
    @Test
    public void Login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Uf@uATO8r4");
        Thread.sleep(1000);
        driver.findElement(By.className("button-holder")).click();
        Thread.sleep(3000);
    }
    
}
