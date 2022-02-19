import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

    WebDriver driver;
    public void launchFirefoxBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\BartoszWieczorek\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com/");
    }
    public void launchChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BartoszWieczorek\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
    public void searchProduct() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Daily Deals")).click();
    }
    public void navigateToSimplilearnAndBack() throws InterruptedException{
        Thread.sleep(2000);
        driver.navigate().to("https://www.wikipedia.org/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(1000);
        System.out.println("Title of this page is: " + driver.getTitle());
        driver.quit();
    }
    public static void main(String[] args) throws InterruptedException {
        FirstSeleniumTest obj = new FirstSeleniumTest();
        obj.launchFirefoxBrowser();
        obj.searchProduct();
        obj.navigateToSimplilearnAndBack();
    }
}
