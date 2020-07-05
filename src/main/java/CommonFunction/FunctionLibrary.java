package CommonFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FunctionLibrary {


    public static WebDriver driver;
    public void openBrowser()
    {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\6430\\Desktop\\Automation\\jar files\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    public void closeBrowser()
    {
        driver.close();

    }
}