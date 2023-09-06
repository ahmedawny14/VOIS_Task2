package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
  public static WebDriver driver;
  FileInputStream fis;
  public static Properties prop = new Properties();
  {
    try {
      fis = new FileInputStream("C:\\Users\\AhmedAwny\\IdeaProjects\\Task2\\src\\main\\resources\\Properties\\config.properties");
      prop.load(fis);


    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  @BeforeMethod
  public static void beforeMethod()
  {

    WebDriverManager.edgedriver().setup();
    EdgeOptions edgeOptions = new EdgeOptions();
    edgeOptions.addArguments("--disable-notifications");
    driver= new EdgeDriver();
    driver.get((prop.getProperty("url")));
    driver.manage().window().setSize(new Dimension(1024, 768));



  }



@AfterTest
  public static void close()
{
  //driver.quit();
}


}
