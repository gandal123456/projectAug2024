package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations
{
	
 public static WebDriver driver=null;
	
  //browserLaunch
	 public static void browserLaunch(Object[]inputParameters)
	   {
		 
	 try{
	
		  String browserName=(String) inputParameters[0];             //firefox
		
	   	
		  if(browserName.equalsIgnoreCase("chrome"))
		  {
			
			  System.setProperty("webdriver.chrome.driver","G:\\FinalProjectAug2024Sel\\primusbank\\src\\main\\resources\\drivers\\chromedriver.exe");
			  
			       driver=new ChromeDriver();
			       driver.manage().window().maximize();
			       driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
			  
		  }
		  else if(browserName.equalsIgnoreCase("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","G:\\FinalProjectAug2024Sel\\primusbank\\src\\main\\resources\\drivers\\geckodriver.exe");
			       driver=new FirefoxDriver();
			     driver.manage().window().maximize();
			     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);   
		  }
		
	 }  catch(Exception e)
	 {
		 System.out.println(e);
	 }
		  
		  
	   	  
	   }
	
	//openApplication
	  public static void openApplication(Object[]inputParameters)
	  {
		  try{
		  String path=(String) inputParameters[0];
		  driver.get(path);
		    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  
		  }  catch(Exception e)
			 {
				 System.out.println(e);
			 } 
	  }
	
	
	//click
    public static void clickOnElement(Object[]inputParameters)
    {
    	try
    	{
    	String xpath=(String) inputParameters[0];
    	
    	
    	driver.findElement(By.xpath(xpath)).click();
    	
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    	
    	}  catch(Exception e)
   	 {
   		 System.out.println(e);
   	 }
    }
	  
	  
	//sendKeys
    public static void sendTextOnUi(Object[]inputParameters)
    {
    	try{
    
    	String xpath=(String) inputParameters[0];
    	String input=(String) inputParameters[1];
    	driver.findElement(By.xpath(xpath)).sendKeys(input);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    	
    	}  catch(Exception e)
   	 {
   		 System.out.println(e);
   	 }
    }
	  
	  
	//dropdown  
	public static void dropDown(Object[]inputParameters)
	{
		try{
		String path= (String) inputParameters[0];
		String option=(String) inputParameters[1];
		
		Select a=new Select(driver.findElement(By.xpath(path)));
		
		   a.selectByVisibleText(option);
		    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		}  catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}
	

     //validation for valid data  
     public static void validation(Object[]inputParameters)
     {
    	 String givenText=(String) inputParameters[0];                      // UI Text
    	 String locator=(String) inputParameters[1];                    // UI Text xpath
      	 
    	 String capturedText=driver.findElement(By.xpath(locator)).getText();
    	 
    	 if(givenText.equalsIgnoreCase(capturedText))
    	 {
    		 System.out.println("Test Case Pass");
    	 }
    	 else
    	 {
    		 System.out.println("Test Case Fail");
    	 }
     }       
   
    
       public static void validationInvalid(Object[]inputParameters)
       {
    	    String givenText=(String) inputParameters[0];                                           //InCorrect BankerName/Password
    	   
    	         Alert handle=driver.switchTo().alert();
    	         
    	                String capturedText=handle.getText();
    	                
    	                              handle.dismiss();

    	         if(givenText.equalsIgnoreCase(capturedText))
    	                 {
    	                  	 System.out.println("Test Case Pass");
    	               	 }
    	          	 else
    	              	 {
    	                      System.out.println("Test Case Fail");
    	                 }       
    	         
    	         driver.close();
    	   
       }
     
     
     
     
     
     
	

}
