package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class hotelBooking {
	WebDriver driver;
	reusableFunctions reuse= new reusableFunctions();
	
	WebElement hotelLnk= driver.findElement(By.linkText("Hotels"));
	WebElement localityTextBox= driver.findElement(By.id("Tags"));
	WebElement searchButton= driver.findElement(By.id("SearchHotelsButton"));
	WebElement travellerSelection= driver.findElement(By.id("travellersOnhome"));
	
	public void clickOnhotellnk() {
		hotelLnk.click();
	}
	public void findhotels(String place,String count) {
		localityTextBox.sendKeys(place);
		Select select = new Select(travellerSelection);
		select.selectByVisibleText("1 room, 2 adults");
	}
	public void clckOnHotelSearchButton() {
		reuse.clickOnBtn(searchButton);
	}
}
