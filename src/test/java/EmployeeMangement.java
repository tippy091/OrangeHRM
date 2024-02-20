import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmployeeMangement extends Login{
    @Test
    public void addEmployee() throws InterruptedException {
        driver.findElement(By.id("menu_item_128")).click();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@id=\"addEmployeeButton\"]")).click();
        Thread.sleep(5000);
    }
}
