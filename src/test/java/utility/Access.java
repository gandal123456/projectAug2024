package utility;

public class Access 
{
	
	

	public static void main(String[] args) 
	{
		
		
		//browserLaunch
		  Object[] input1=new Object[2];
		           input1[0]="webdriver.chrome.driver";
		           input1[1]="G:\\FinalProjectAug2024Sel\\primusbank\\src\\main\\resources\\drivers\\chromedriver.exe";
		          SeleniumOperations.browserLaunch(input1);
		    
		
   //openApplication
		          Object[] input2=new Object[1];
		                   input2[0]="http://primusbank.qedgetech.com/";
		         SeleniumOperations.openApplication(input2);          
		          


	//username
		          Object[] input3=new Object[2];
		                   input3[0]="//*[@id='txtuId']";
		               	   input3[1]="Admin";
		               	   SeleniumOperations.sendTextOnUi(input3);
 
		               	//password
		 		          Object[] input4=new Object[2];
		 		                   input4[0]="//*[@type='password']";
		 		               	   input4[1]="Admin";
		 		               	   SeleniumOperations.sendTextOnUi(input4);
		  //clickOnLogin
 
		 		                  Object[] input5=new Object[1];
				                   input5[0]="//*[@name='login']";
				         SeleniumOperations.clickOnElement(input5);
				         
 
     //click on search
				         Object[] input6=new Object[1];
		                   input6[0]="(//*[@height='24'])[2]";
		         SeleniumOperations.clickOnElement(input6);

		         //INDIA 
		         Object[] input7=new Object[2];
                  input7[0]="//*[@name='lst_countryS']";
              	   input7[1]="INDIA";
              	   SeleniumOperations.sendTextOnUi(input7);
 

  		         //AP
  		         Object[] input8=new Object[2];
                    input8[0]="//*[@name='lst_stateS']";
                	   input8[1]="Andhra Pradesh";
                	   SeleniumOperations.sendTextOnUi(input8);
   
              	//Hyderabad   
                
        		         Object[] input9=new Object[2];
                          input9[0]="//*[@name='lst_cityS']";
                      	   input9[1]="Hyderabad";
                      	   SeleniumOperations.sendTextOnUi(input9);
              	   

                      	//click on search
  				         Object[] input10=new Object[1];
  		                   input10[0]="//*[@id='btn_search']";
  		         SeleniumOperations.clickOnElement(input10);
  		         

 
     

  
 
 
 
 
	}

}
