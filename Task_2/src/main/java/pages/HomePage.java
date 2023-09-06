package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    public static WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public static WebElement getRoute() {

        WebElement route = driver.findElement(By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a"));
        return route;
    }

    public static WebElement getClanderTable() {

        WebElement table = driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']"));
        return table;
    }

    public static WebElement getDay() {

        WebElement day = getClanderTable().findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]"));
        return day;
    }

    public static WebElement getSearchForBusButton() {

        WebElement searchForBusButton = driver.findElement(By.xpath("//*[@class='col-md-22 mb-1 booking-input']"));
        return searchForBusButton;
    }

    public static WebElement getSelectSeatesbutton() {

        WebElement selectSeatsButton = driver.findElement(By.xpath("//*[@class='btnSelectLO select-service-btn']"));
        return selectSeatsButton;
    }

    public static WebElement SelectSeat() {
        WebElement seat = driver.findElement(By.xpath("//*[@id=\"Forward98\"]"));
        return seat;
    }

    public static WebElement SelectBoardingPoint() {
        WebElement boardingPoint = driver.findElement(By.id("Forward-1467469338690"));
        return boardingPoint;
    }

    public static WebElement SelectDroppingPoint() {
        WebElement droppingPoint = driver.findElement(By.id("Forward-1467467616730"));
        return droppingPoint;
    }

    public static WebElement getMobileNum() {
        WebElement mobileNum = driver.findElement(By.id("mobileNo"));
        return mobileNum;
    }

    public static WebElement getEmail() {
        WebElement email = driver.findElement(By.id("email"));
        return email;
    }

    public static WebElement getPassengerName() {
        WebElement passengerName = driver.findElement(By.id("passengerNameForward0"));
        return passengerName;
    }

    public static void getPassengerGander() {
        WebElement genderDropDown = driver.findElement(By.id("genderCodeIdForward0"));
        Select gender = new Select(genderDropDown);
        gender.selectByVisibleText("MALE");
    }

    public static WebElement getPassengerAge() {
        WebElement age = driver.findElement(By.id("passengerAgeForward0"));
        return age;

    }


    public static void selectConcession() {
        WebElement concessionDropDown = driver.findElement(By.id("concessionIdsForward0"));
        Select concession = new Select(concessionDropDown);
        concession.selectByVisibleText("GENERAL PUBLIC");

    }

    public static WebElement getPaymentButton() {

        WebElement paymentButton = driver.findElement(By.id("PgBtn"));
        return paymentButton;
    }

}
