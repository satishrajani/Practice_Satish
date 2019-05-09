package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;

public interface utility {
	
	String Path=System.getProperty("user.dir");
	
	public static void takeScreenShot(WebDriver driver,Scenario scenario)
	{
		
		if(scenario.isFailed())
		{
			String screenShotPath=Path+"\\target\\failed";
			File file = new File(screenShotPath);
			if(!file.exists())
			{
				file.mkdir();
			}
			 screenShotPath=screenShotPath+"\\"+LocalDate.now();

		      file = new File(screenShotPath);
			if(!file.exists())
			{
				file.mkdir();
			}
			
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			try {
			FileUtils.copyFile(scrFile, new File(screenShotPath+"\\"+scenario.getName()+".jpg"));
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			
		}
		
		
	}
	
	

}
