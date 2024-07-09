import utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
        WebDriver driver;

        /**
         * Before class set up method
         * Executed before each test
         *
         */
        @BeforeClass
        public void setUp() {
            // Overcome issue: https://www.selenium.dev/blog/2022/using-java11-httpclient/
            System.setProperty("webdriver.http.factory", "jdk-http-client");

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

            // open browser, maximize window & set implicit wait
            driver.get("https://staging.app.morphoses.io/en/register/login");
            driver.manage().window().maximize();
            DriverFactory.setWebDriver(driver);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }

        /**
         * After class tear down method
         * Executed after each test
         */
        @AfterClass
        public void tearDown() {
            DriverFactory.getWebDriver().quit();
        }
    }

