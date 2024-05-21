/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
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

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //open the URL into Browser
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println("The title of the page: " + driver.getTitle());

        //Print the current url
        System.out.println("The Current url : " + driver.getCurrentUrl());

        //Print page source
        System.out.println("The source : " + driver.getPageSource());

        //Navigate to Url
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //Print the current url
        System.out.println("The current url : " + driver.getCurrentUrl());

        // Navigate back to the home page.
        driver.navigate().back();
        driver.getCurrentUrl();

        //Navigate to the login page
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //Print the current url
        System.out.println("The current URL : " + driver.getCurrentUrl());

        //Refresh the page
        driver.navigate().refresh();

        //Enter the email to email field
        driver.findElement(By.id("Email")).sendKeys("Prime123@gmail.com");

        //enter the password to password field
        driver.findElement(By.name("Password")).sendKeys("prime123");

        //Click on Login Button
        driver.findElement(By.linkText("Log in")).click();

        //Close the browser
        driver.quit();

    }
}
