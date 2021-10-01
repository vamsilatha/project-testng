package utility;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IInvokedMethod;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class Helper {
	// private final Logger LOGGER = org.testng.log4testng.Logger.getLogger(Helper.class);
	
	public static String captuteScreenshot(WebDriver driver, String screenshotname) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		//specify project path instead
		String destFile = "/Users/my_appie_pie/Documents/Selenium/workspaceNew/automation.testng.project/Screenshots/"+screenshotname+System.currentTimeMillis()+".png";
		try {
			FileUtils.copyFile(srcFile, new File(destFile));
		} catch (IOException e) {
			System.out.println("Error during capturing screenshot"+e.getMessage());
		}
		
		return destFile;
	}
    
}
