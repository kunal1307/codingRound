package pages;
import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class flightBooking {
	WebDriver driver;
	
    WebElement oneway= driver.findElement(By.id("OneWay"));
    WebElement fromTag= driver.findElement(By.id("FromTag"));
    List<WebElement> originOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
    WebElement toTag=driver.findElement(By.id("toTag"));
    List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
    WebElement dataPicker=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a"));
    WebElement searchBtn=driver.findElement(By.id("SearchBtn"));
    WebElement searchSummary=driver.findElement(By.className("searchSummary"));
    
    reusableFunctions reuse= new reusableFunctions();
    public void findflight(String from, String to) {
    	oneway.click();
    	fromTag.click();
    	fromTag.clear();
    	fromTag.sendKeys(from);
    	reuse.waitFor(3000);
    	originOptions.get(0).click();
    	toTag.click();
    	toTag.clear();
    	toTag.sendKeys(to);
    	reuse.waitFor(3000);
    	destinationOptions.get(0).click();
    }
    public void clickonSearchButton() {
    	reuse.clickOnBtn(searchBtn);
    }
     public boolean checksearchSummary() {
    	 return reuse.elementpresence(searchSummary);
    	 
     }
}
