package bankapp;

import billing.BillService;
import billing.IBill;
import billing.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by Akshay on 23-09-2020.
 */
@RunWith(MockitoJUnitRunner.class)
public class VariousTesting {

    @InjectMocks
    BillService billService;

    @Mock
    IBill bill;

    @Test
    public void testBillAmount() {
        /** Behaviour */
        Item item1 = new Item(10);
        Item item2 = new Item(20);
        Item item3 = new Item(30);
        Item item4 = new Item(40);
        when(bill.calculateBill(item1, item2, item3, item4)).thenReturn(100.0);

        /** Testing */
        double actual = billService.calculateBill(item1, item2, item3, item4);
        double expected = 100.0;
        assertEquals(actual, expected, 0);
    }

    @Test
    public void functionalTesting() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\After Graduation\\DB\\Training\\SDLC\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://junit.org");
        driver.findElement(By.cssSelector("body > div.container > div.jumbotron > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.id("overview-getting-help")).click();
        driver.close();
    }

    @Test
    public void functionalTestingJunit() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\After Graduation\\DB\\Training\\SDLC\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://junit.org");
        driver.findElement(By.cssSelector("body > div.container > div.jumbotron > ul > li:nth-child(1) > a")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "JUnit 5 User Guide";
        assertEquals(actualTitle, expectedTitle);

        /*String actualHeading = driver.findElement(By.id("overview")).toString();
        System.out.println(actualHeading);*/

        driver.close();
    }
}
