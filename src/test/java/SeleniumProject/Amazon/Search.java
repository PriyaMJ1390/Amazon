package SeleniumProject.Amazon;

import org.testng.annotations.Test;

import SleniumPackage1.SeleniumProject11.Amazon_HomePage;

public class Search extends LaunchANDQuit
{
	@Test
	public void HomePage() throws InterruptedException
	{
		Search_Amazon s1=new Search_Amazon(driver);
        s1.SearchProd();
        s1.PriceFilter(driver);
        s1.BrandFilter();
        s1.BandFilter();
      s1.DiscountFilter();
     s1.AnalogueFilter();  
     s1.Prod3();
     s1.priceprint(driver);
	}
}
