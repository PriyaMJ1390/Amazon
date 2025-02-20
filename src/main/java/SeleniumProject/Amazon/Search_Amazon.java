package SeleniumProject.Amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_Amazon 
{
	WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[18]") 
	WebElement Analogue; 
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[6]")
	WebElement Brand;
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[24]")
	WebElement Band;
	@FindBy(xpath="//span[.='25% Off or more']")
	WebElement Discount;
	@FindBy(xpath="//input[@id='p_36/range-slider_slider-item_lower-bound-slider']")
	WebElement MinPrice;
	@FindBy(xpath="//input[@id='p_36/range-slider_slider-item_upper-bound-slider']")
	WebElement MaxPrice;
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement GoButton;
	@FindBy(xpath="(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[3]")
    WebElement Product3;
	@FindBy(xpath="(//span[@class='a-price-symbol'])[3]")
	WebElement Rupees;
	@FindBy(xpath="(//span[@class='a-price-whole'])[3]")
	WebElement DiscountedMagnitude;
	@FindBy(xpath="(//span[@class='a-size-base a-color-secondary'])[3]")
	WebElement MRPSymbol;
	@FindBy(xpath="(//span[@class='a-price a-text-price'])[3]")
	WebElement MRP;
//	@FindBy(xpath="(//span[@class='a-offscreen'])[5]")
	//WebElement MRP;
	@FindBy(xpath="//span[@class='a-size-large a-color-price savingPriceOverride aok-align-center reinventPriceSavingsPercentageMargin savingsPercentage']")
	WebElement DiscountPercentage;
	
	public void SearchProd()
	{
		SearchBox.sendKeys("Wrist Watches"+Keys.ENTER);
	}
	
	public void AnalogueFilter()
	{
		if (Analogue.isSelected())
		 {
			 System.out.println("Analogue Selected");
			 
		 }
		 else 
		 {
			System.out.println("Analogue Not Selected");
			Analogue.click();
		 }
	}
    
	public void BrandFilter()
	{
		//Brand.click();
		if (Brand.isSelected())
		 {
			 System.out.println("Brand Selected");
			 
		 }
		 else 
		 {
			System.out.println("Brand Not Selected");
			Brand.click();
		 }
	}
	
	public void BandFilter()
	{
		//Band.click();
		if (Band.isSelected())
		 {
			 System.out.println("Band Selected");
			 
		 }
		 else 
		 {
			System.out.println("Band Not Selected");
			Band.click();
		 }
	}
	public void DiscountFilter()
	{
		Discount.click();
	}
	
	public void PriceFilter(WebDriver driver)
	{  this.driver=driver;
		Actions a1= new Actions(driver);
    a1.dragAndDropBy(MinPrice, 50, 0).perform();
	//	MinPrice.isSelected();
	//MaxPrice.isSelected();
	//GoButton.click();
	}
	
	
	public void Prod3()
	{
	    
		Product3.click();
	}
	public void priceprint(WebDriver driver)
	{this.driver=driver;
		System.out.println(Rupees.getText());
		System.out.println(DiscountedMagnitude.getText());
		System.out.println(MRPSymbol.getText());
		System.out.println(MRP.getText());
		Set<String> pandc=driver.getWindowHandles();
		Iterator<String> pc=pandc.iterator();
		String p=pc.next();
		String c=pc.next();
		driver.switchTo().window(c);
		System.out.println(DiscountPercentage.getText());
	}
	
	public Search_Amazon(WebDriver driver)
	 {
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
}
