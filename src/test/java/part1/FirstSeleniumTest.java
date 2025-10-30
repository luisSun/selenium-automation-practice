package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            //driver.quit();
        }
    }

    @Test
    public void testLoginIntoApplication() throws InterruptedException {
        Thread.sleep(20000);
        //Primeira forma de passar um elemento
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        //Segunda forma de passar um elemento
        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        //Terceira forma de passar um elemento
        //By.tagName produra a tag html <button>
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(40000);
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";

        Assert.assertEquals(actualResult, expectedResult);
    }

}
