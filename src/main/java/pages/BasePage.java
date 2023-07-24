package pages;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    public static WebDriver driver;
    String orangehrmURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeMethod(alwaysRun = true)
    public void openPage(ITestContext context) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(orangehrmURL);
        context.setAttribute("WebDriver", driver);
    }
    @AfterMethod(alwaysRun = true)
    public void closePage(){
        driver.quit();
    }

}
