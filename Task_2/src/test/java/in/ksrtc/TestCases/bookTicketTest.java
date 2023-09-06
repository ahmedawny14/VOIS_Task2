package in.ksrtc.TestCases;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

public class bookTicketTest extends TestBase {

    public static HomePage homePage;
    static WebDriverWait wait;

    @Test
    public static void bookTicket() throws InterruptedException {
        homePage = new HomePage(driver);

        // driver.findElement(By.xpath("//*[@class'=carousel-control-next-icon']")).click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(homePage.getRoute()));
        homePage.getRoute().click();
        WebElement day = homePage.getDay();
        Actions actions = new Actions(driver);
        actions.moveToElement(day).click().build().perform();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        homePage.getSearchForBusButton().click();
        wait.until(ExpectedConditions.elementToBeClickable(homePage.getSelectSeatesbutton()));
        jse.executeScript("window.scrollBy(0,500)");
        homePage.getSelectSeatesbutton().click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Forward-1467469338690")));
        homePage.SelectSeat().click();
        homePage.SelectBoardingPoint().click();
        homePage.SelectDroppingPoint().click();
        homePage.getMobileNum().sendKeys("6789125987");
        homePage.getEmail().sendKeys("ahmedeldaly685@gmail.com");
        homePage.getPassengerName().sendKeys("Ahmed");
        homePage.getPassengerGander();
        homePage.getPassengerAge().sendKeys("25");
        homePage.selectConcession();
        homePage.getPaymentButton().click();
    }
}
