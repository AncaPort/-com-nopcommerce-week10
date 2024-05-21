import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup Multi browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=
 * %2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser
 */
public class MultiBrowser {

    static String browser = "firefox";//change the value here using different browser name
    static String baseUrl = "https://demo.nopcommerce.com/";//name of the base url
    static WebDriver driver;

    public static void main(String[] args) {
        //Nested if-else condition for browser setup
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        //open Url
        driver.get(baseUrl);

        //Print the title of the page.
        System.out.println("The title of the page : " + driver.getTitle());

        //Print the current url
        System.out.println("The current url : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("The page source : " + driver.getPageSource());

        //Navigate to Url
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //Print the current url
        System.out.println("The current url: " + driver.getCurrentUrl());

        //Navigate back to the home page.
        driver.navigate().back();
        driver.getCurrentUrl();

        //Navigate to the login page
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //Print the current url.
        System.out.println("The current Url: " + driver.getCurrentUrl());

        //Refresh the page
        driver.navigate().refresh();

        //Enter the email to email field.
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");

        //enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("prime123");

        //Click on Login Button
        driver.findElement(By.linkText("Log in")).click();

        //Close the browser
        driver.quit();
    }

}
