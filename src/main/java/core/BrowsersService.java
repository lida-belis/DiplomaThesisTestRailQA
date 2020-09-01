package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Waiters;

public class BrowsersService {
    private WebDriver driver = null;
    private DriverManagerType driverManagerType = null;
    private Waiters waiters;
    private String baseUrl;

    public BrowsersService() {
        ReadProperties readProperties = new ReadProperties();
        baseUrl = readProperties.getURL();

        switch (readProperties.getBrowserName().toLowerCase()) {
            case "chrome":
                driverManagerType = DriverManagerType.CHROME;
                WebDriverManager.getInstance(driverManagerType).setup();

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(readProperties.isHeadless());
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--window-size=1920,1200");
                chromeOptions.addArguments("--ignore-certificate-errors");
                chromeOptions.addArguments("--silent");
                chromeOptions.addArguments("--start-maximized");

                driver = new ChromeDriver(chromeOptions);

                break;
            case "firefox":
                driverManagerType = DriverManagerType.FIREFOX;
                WebDriverManager.getInstance(driverManagerType).setup();

                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Browser " + readProperties.getBrowserName() + " is not supported.");
                break;
        }

        waiters = new Waiters(driver, readProperties.getTimeOut());
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Waiters getWaiters() {
        return waiters;
    }

    public String getBaseUrl() { return baseUrl; }

    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
