import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebsiteTest {
    @Test
    public void testHomePage() {
        String expectedTitle = "Welcome to Steam";
        String str = "C:\\Users\\lordf\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",str);
            WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://store.steampowered.com/");
        Assert.assertEquals(webDriver.getTitle(), expectedTitle);
    }

    @Test
    public void testLoginPage(){
        String expectedTitle = "Sign In";
        String str = "C:\\Users\\lordf\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", str);
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://store.steampowered.com/");
        webDriver.findElement( By.xpath("//a[@class='global_action_link']" )).click();
        Assert.assertEquals(webDriver.getTitle(), expectedTitle);
    }

    @Test
    public void testSignIn(){
        String str = "C:\\Users\\lordf\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", str);
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://store.steampowered.com/login");
        webDriver.findElement(By.xpath("//input[@class='newlogindialog_TextInput_2eKVn']")).sendKeys("fwee");
        webDriver.findElement(By.xpath("//input[@class='newlogindialog_TextInput_2eKVn']")).sendKeys("dsdd");
        webDriver.findElement(By.xpath("//button[@class='newlogindialog_SubmitButton_2QgFE']")).submit();

    }

}
