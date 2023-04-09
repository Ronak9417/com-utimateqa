package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {


        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open the URL into Browser
        driver.get(baseUrl);
        //maximise the Browser
        driver.manage().window().maximize();
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Get the current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source : " + driver.getPageSource());

        // Find the email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("prime123@gmail.com");


        // Find the password field element and type the password
        driver.findElement(By.name("user[password]")).sendKeys("prime123");

        //Close the browser
        driver.close();

    }

}
