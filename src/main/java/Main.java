import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        driver.get("https://www.saucedemo.com");
        Thread.sleep(2000);

        WebElement log = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        WebElement pas = driver.findElement(By.xpath("//*[@id=\"password\"]"));

        log.sendKeys("standard_user");
        Thread.sleep(2000);

        pas.sendKeys("secret_sauce");
        Thread.sleep(2000);



        WebElement element = driver.findElement(By.xpath("//input[contains(@type, 'submit')]"));

        element.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
