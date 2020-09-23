package bankapp;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created by Akshay on 23-09-2020.
 */
public class WebAppTest {
    @Test
    public void testGooglePage() {
        String expectedResult = "who is love of my life - Google Search";
        String actualResult = null;

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\After Graduation\\DB\\Training\\SDLC\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("who is love of my life");
        driver.findElement(By.name("q")).sendKeys("\t");
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
        actualResult = driver.getTitle();
        assertEquals(actualResult, expectedResult);
        //driver.close();
    }
    /** selenium and appium protractor karma jasmine pytest jmeter
     * selenium functional test
     * jmeter performance testing
     * mockito mock testing
     * junit unit testing
     */
}
