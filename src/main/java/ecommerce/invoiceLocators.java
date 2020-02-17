package ecommerce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class invoiceLocators {
	public WebDriver driver;
	
	private WebElement username;
	private WebElement login;
	@FindBy(css="input.form-button")
	private WebElement loginbutton;
	@FindBy(css="a[title='close']")
	private WebElement alert1;
	@FindBy(css="ul#nav > li > a")
	private WebElement sales;
	@FindBy(css="li.level1 > a")
	private WebElement orders;
    private WebElement sales_order_grid_filter_status;
    @FindBy(css="button[title='Search']")
	private WebElement searchbutton;
    @FindBy(css="inputtype[value='11018']")
	private WebElement checkbox;
    @FindBy(id="sales_order_grid_massaction-select")
    private WebElement Actionbutton ;
    @FindBy(css="button[title='Submit']")
	private WebElement Submit;
    @FindBy(css="li.error-msg > ul > li > span")
	private WebElement errormsg;
    @FindBy(css="inputtype[value='5']")
	private WebElement checkbox2;
    
    public invoiceLocators(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this );
    }
    public void loginasuser()
	{
		username.click();
		username.sendKeys("user01");
		login.click();
		login.sendKeys("guru99com");
		loginbutton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
    public void validatingOrdersMenuWithStatusCancelled(String option)
    {
    	alert1.click();
    	sales.click();
    	orders.click();
    	dropDownoptions(option);
    	   	
    }
    public void dropDownoptions(String value)
    {
    	Select s1=new  Select(sales_order_grid_filter_status);
    	s1.getOptions().stream().anyMatch(item->item.getText().equalsIgnoreCase(value));
    }
}
