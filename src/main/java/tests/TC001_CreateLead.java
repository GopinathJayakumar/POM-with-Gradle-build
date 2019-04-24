package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LogInPage;
import pages.MyHomePage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testDescription ="Create a lead";
		testNodes = "Leads";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public  void createLead(String cname, String fname, String lname, String email)   {
		new LogInPage()
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.typeCompanyName(cname)
		.typeFirstName(fname)
		.typeLastName(lname)
		.clickCreateLead();
		
		
	}
	

}
