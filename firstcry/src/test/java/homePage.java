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


}
