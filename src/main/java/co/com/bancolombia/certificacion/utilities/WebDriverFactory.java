package co.com.bancolombia.certificacion.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class WebDriverFactory {
    private static WebDriver driver;

    public static WebDriverFactory web() {
        driver = getDriver();
        driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return new WebDriverFactory();

    }

    public static WebDriver getDriver() {
        String webdriverstr = System.getProperty("driver");
        if (webdriverstr == null) {
            webdriverstr = "chrome";
        }

        switch (webdriverstr) {
            case "firefox":
                FirefoxOptions fireopts = new FirefoxOptions();
                fireopts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

                return new FirefoxDriver();
            case "chrome":
                System.setProperty("webdriver.chrome.driver","C:/Driver/chromedriver.exe");
                ChromeOptions chropts = new ChromeOptions();
                Map<String, Object> prefs = new HashMap<String, Object>();
                prefs.put("profile.managed_default_content_settings.geolocation", 1);
                chropts.setExperimentalOption("prefs", prefs);
                chropts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                chropts.setAcceptInsecureCerts(true);
                chropts.addArguments("--ignore-certificate-errors");
                chropts.addArguments("--incognito");
                chropts.addArguments("--start-maximized");
                return new ChromeDriver(chropts);
            case "edge":
                DesiredCapabilities capabilities = DesiredCapabilities.edge();
                capabilities.setJavascriptEnabled(true);
                capabilities.setAcceptInsecureCerts(true);

                return new EdgeDriver();
            case "ie":
                InternetExplorerOptions opts = new InternetExplorerOptions();

                opts.ignoreZoomSettings();
                opts.enablePersistentHovering();
                opts.ignoreZoomSettings();
                opts.introduceFlakinessByIgnoringSecurityDomains();
                opts.requireWindowFocus();
                opts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

                opts.setCapability("ignoreProctectedModeSettings", true);
                opts.setCapability("enabledNativeEvents", true);

                opts.setCapability("ignoreZoomSetting", true);
                opts.setCapability("ignoreProtectedModeSettings", true);
                opts.setCapability("requireWindowFocus", true);
                opts.setCapability("enableNativeEvents", true);
                opts.setCapability("enablePersistentHover", true);


                return new InternetExplorerDriver(opts);
            case "phantomjs":
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setJavascriptEnabled(true);
                caps.setCapability("takesScreenshot", true);
                caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "phantomjs.exe");
                caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS,
                        new String[] { "--web-security=false", "--ssl-protocol=any", "--ignore-ssl-errors=true",
                                "--webdriver-loglevel=INFO", "--web-security=no", "--proxy=10.169.104.166:8080" });

                return new PhantomJSDriver(caps);

            default:
                throw new RuntimeException("Unsupported webdriver: " + webdriverstr);
        }
    }
}
