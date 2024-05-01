package Step_Def;


import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Page_Object_Test.Add_New_Custmore_Page;
import Page_Object_Test.SearchCustomerPage;
import Page_Object_Test.Test_Login_Page;

public class Base_Class {
	public static  WebDriver driver;
	public Test_Login_Page loginPg;
	public SearchCustomerPage SearchCustPg;
	public Add_New_Custmore_Page addNewCustPg;
	public static Logger log;
	public Utilites.ReadConfig readConfig;
	//generate unique email id
	public String generateEmailId()
	{
		return null;
		////return(RandomStringUtils.randomAlphabetic(5));
	}
}
