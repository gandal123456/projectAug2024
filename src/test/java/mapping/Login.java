package mapping;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Login 
{

	@Given("User open {string} browser")
	public void bLaunch(String bname) 
	{
		Object[] input1=new Object[1];
        input1[0]=bname;      
       SeleniumOperations.browserLaunch(input1);
	}

	@Given("User enter url as {string}")
	public void enter_Url(String url) 
	{
		   Object[] input2=new Object[1];
           input2[0]=url;
        SeleniumOperations.openApplication(input2);    
	}
	@When("user enter {string} as username")
	public void user_enter_as_username(String uname)
	{
		 Object[] input3=new Object[2];
         input3[0]="//*[@id='txtuId']";
     	   input3[1]=uname;
     	   SeleniumOperations.sendTextOnUi(input3);
	}

	@When("user enter {string} as password")
	public void user_enter_as_password(String pass) 
	{
		  Object[] input4=new Object[2];
           input4[0]="//*[@type='password']";
       	   input4[1]=pass;
       	   SeleniumOperations.sendTextOnUi(input4);
	}

	@When("user click on Login button")
	public void user_click_on_Login_button() 
	{
		   Object[] input5=new Object[1];
           input5[0]="//*[@name='login']";
 SeleniumOperations.clickOnElement(input5);   
	}

	@Then("application shows user profile to user")
	public void application_shows_user_profile_to_user() 
	{
		 Object[] input6=new Object[2];
         input6[0]="Admin";
     	   input6[1]="//*[text()='Admin']";
     	   SeleniumOperations.validation(input6);
	}

	
	
	
	
	@Then("application shows appropriate error message to user")
	public void application_shows_appropriate_error_message_to_user() 
	{
		 Object[] input7=new Object[1];
         input7[0]="InCorrect BankerName/Password";
         SeleniumOperations.validationInvalid(input7);   
	   
         
	}
	
	
	
	
	
	
}
