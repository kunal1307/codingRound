package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class signInpage {
	reusableFunctions reuse=new reusableFunctions();
	public WebDriver driver=null;
	WebElement yourTripsLnk=driver.findElement(By.linkText("Your trips"));
    WebElement signInLnk= driver.findElement(By.id("SignIn"));
    WebElement signInBtn= driver.findElement(By.id("signInButton"));
    WebElement errormsg=driver.findElement(By.id("errors1"));
    
    public void navigatetologinPage() {
    	yourTripsLnk.click();
    	reuse.waitFor(2000);
    	signInLnk.click();
    }
    
    public void clickOnSignInBtn() {
    	reusableFunctions reuse= new reusableFunctions();
    	reuse.clickOnBtn(signInBtn);
    }
    
    public boolean checkforErrormsg() {
    	return reuse.elementpresence(errormsg);
    }

}
