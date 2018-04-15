package pages;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class reusableFunctions {
	WebDriver driver=null;
	
	public void waitFor(int durationInMilliSeconds) {
        try {
            Thread.sleep(durationInMilliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        
    }
	
	public String getTextvalue(WebElement locator) {
		  return locator.getText();
	    }
	public boolean elementpresence(WebElement element){
		return element.isDisplayed();
	}
	public void clickOnBtn(WebElement locator) {
		if(locator.isDisplayed()) {
	    	locator.click();
		}
		else
			fail("Element Not found");

    }
	
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", "/codoingRound/chromedriver.exe");
    	driver =new ChromeDriver();
    	driver.get("https://www.cleartrip.com/");
    	waitFor(3000);
	}
	public void closeDriver() {
		driver.quit();
	}
}
