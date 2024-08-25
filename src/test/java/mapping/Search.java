package mapping;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.SeleniumOperations;

public class Search
{

	@When("user click on branches")
	public void user_click_on_branches()
	{
		   Object[] input6=new Object[1];
           input6[0]="(//*[@height='24'])[2]";
          SeleniumOperations.clickOnElement(input6);
	}

	@When("user select {string} as contry")
	public void user_select_as_contry(String ctr)
	{
		  Object[] input7=new Object[2];
          input7[0]="//*[@name='lst_countryS']";
      	   input7[1]=ctr;
      	   SeleniumOperations.sendTextOnUi(input7);

	}

	@When("user select {string} as state")
	public void user_select_as_state(String string)
	{
	   
	}

	@When("user select {string} as city")
	public void user_select_as_city(String string)
	{
		
	}

	@When("user click on search button")
	public void user_click_on_search_button()
	{
	   
	}

	@Then("application shows results for given city")
	public void application_shows_results_for_given_city()
	{
	  
	}



	
	
	
	
}
