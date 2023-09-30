package com.Actitme.Testscript;

import org.testng.annotations.Test;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.POM.Homepage;
import com.Actitime.POM.Taskpage;

public class CreateCustomer extends Baseclass

{
	@Test
	public void createCustomer()
	{
		Homepage hp = new Homepage(driver);
		hp.getTasktab().click();
		Taskpage tp = new Taskpage(driver);
		tp.getAddnewbtn().
	}
	

}
