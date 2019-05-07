package StepDefinition;




import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java8.En;
import repository.homePage;






public class step implements En {
String url;
WebDriver driver;
homePage homePage;
public step()
{


Given("^firstCry is up and launched successfully$",()->{

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resource\\chromedriver.exe");
		driver=new ChromeDriver();
		url="https://www.firstcry.com/?&ref=SEM_GSN_Brand_FirstCry_NRI&gclid=CjwKCAjwndvlBRANEiwABrR32FHQ0BmCYOcG23Eq8c6gTufQDbypVjPchdK_BYOLldOxxONH2NGCuBoCa9kQAvD_BwE";

		driver.get(url);
	
    

});

When("^I am in home screen$",()->{

	 homePage=PageFactory.initElements(driver,homePage.class);



});

Then("^I verify the following are present$",(DataTable fieldNames)->{
	List<String>fieldName=fieldNames.asList(String.class);

for(String field:fieldName)
{
	switch(field)
	{
	case "Email":homePage.emailId_is_present();
	break;
	case "Mobile_no_box":homePage.mobileEditbox_is_present();
	break;
	case "Sign_Up":homePage.signUpButton_is_present();;
	break;
	
	
	}
}

/*
	homePage.emailId_is_present();
	Assert.assertTrue( homePage.mobileprefixEditbox_has_default_value("91"));
    homePage.mobileEditbox_is_present();
    homePage.signUpButton_is_present();
	homePage.scrolldown_to_element(driver);

	Assert.assertEquals(e.size(),1);
*/
});

And("^I verify that (.*) is (.*)$",(String fieldName,String fieldValue)->{

switch(fieldName)
{
case "mobile prefix":Assert.assertTrue( homePage.mobileprefixEditbox_has_default_value(fieldValue));
}
driver.close();


});

When("^scroll down$",()->{

	homePage.scrolldown_to_element(driver);

});

Then("^I verify that scroll up is present$",()->{
	
	homePage.scrolldown_to_element(driver);
driver.close();


});




}
}