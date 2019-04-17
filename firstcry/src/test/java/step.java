import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class step {
String url;
WebDriver driver;

@Before
public void setUp()
{
    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resource\\chromedriver.exe");
     driver=new ChromeDriver();
    url="https://www.firstcry.com/?&ref=SEM_GSN_Brand_FirstCry_NRI&gclid=CjwKCAjwndvlBRANEiwABrR32FHQ0BmCYOcG23Eq8c6gTufQDbypVjPchdK_BYOLldOxxONH2NGCuBoCa9kQAvD_BwE";
}
    @Test
    public void TC1()
    {
        driver.get(url);
        homePage homePage=PageFactory.initElements(driver,homePage.class);
        homePage.emailId_is_present();
        Assert.assertTrue( homePage.mobileprefixEditbox_has_default_value("91"));
        homePage.mobileEditbox_is_present();
        homePage.signUpButton_is_present();
   ;
    }
}
