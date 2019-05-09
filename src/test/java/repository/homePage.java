package repository;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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

    @FindBy(how=How.CLASS_NAME,using="img-block")
    WebElement imageBox;
    
    @FindBy(how=How.CSS,using="._pop_close")
    WebElement closeButton;

    @FindBy(how=How.CLASS_NAME,using="goToTop")
    WebElement topIcon;

    public void emailId_is_present()
    {
        emailIdEditbox.isDisplayed();
    }

    void mobileprefixEditbox_is_present()
    {
        mobileprefixEditbox.isDisplayed();
    }

    public void mobileEditbox_is_present()
    {
        mobileEditbox.isDisplayed();
    }

    public boolean mobileprefixEditbox_has_default_value(String value)
    {
        return mobileprefixEditbox.getAttribute("value").equals(value);
    }

    public void signUpButton_is_present()
    {
        signUpButton.isDisplayed();
    }
    
    public void scrolldown_to_element(WebDriver driver)
   {
    	
    	
    JavascriptExecutor js = (JavascriptExecutor) driver;
	
    js.executeScript("window.scrollBy(0,500)", "");
   }

    public boolean top_is_present()
   {
    	
    	return topIcon.isDisplayed();
   }
   

}
