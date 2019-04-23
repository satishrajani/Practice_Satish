import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePage {

    @FindBy(how = How.ID , using = "Email")
    WebElement emailIdEditbox;

    @FindBy(how = How.ID , using = "mobileprefix")
    WebElement mobileprefixEditbox;

    @FindBy(how = How.ID , using = "Mobile")
    WebElement mobileEditbox;

    @FindBy(how = How.ID , using = "btnSignUp")
    WebElement signUpButton;

    @FindBy(how=How.class,using="img-block")
    WebElement imageBox;

    @FindBy(how=How.class,using="goToTop")
    WebElement topIcon;

    void emailId_is_present()
    {
        emailIdEditbox.isDisplayed();
    }

    void mobileprefixEditbox_is_present()
    {
        mobileprefixEditbox.isDisplayed();
    }

    void mobileEditbox_is_present()
    {
        mobileEditbox.isDisplayed();
    }

    boolean mobileprefixEditbox_has_default_value(String value)
    {
        return mobileprefixEditbox.getAttribute("value").equals(value);
    }

    void signUpButton_is_present()
    {
        signUpButton.isDisplayed();
    }
    
   void scrolldown_to_element(WebDriver driver)
   {
    JavascriptExecutor js = (JavascriptExecutor) driver;
	
    js.executeScript("arguments[0].scrollIntoView();", imageBox);
   }

   boolean top_is_present()
   {
return topIcon.isDisplayed();
   }
   

}
