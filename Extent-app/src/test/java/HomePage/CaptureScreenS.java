package HomePage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenS {
	public static String capture(WebDriver  driver,String screenShotName)
	{	
		String dateName=new SimpleDateFormat("yyyy_MM_dd_hh_mm_sss").format(new Date());
		TakesScreenshot sh=(TakesScreenshot)driver;
		File source=sh.getScreenshotAs(OutputType.FILE);
		String dest="screenShotName"+dateName+".png";
		File destination=new File(dest);
		return dest;
		
	}

}
