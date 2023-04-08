package org.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.runnerfile.Adactinss;

import baseclass.POM_AD;
import baseclass.bclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import junit.framework.Assert;

public class Stepdef1 extends bclass {
	public  WebDriver driver = Adactinss.driver;
	
	POM_AD POM = new POM_AD(driver);
	
	@Given("User Launch the URL")
	public void user_launch_the_url() {
		URL("https://adactinhotelapp.com/");
	}
	
	@When("User Enter the Name And pasword")
	public void user_enter_the_name_and_pasword() {
		
		maximize();
		inputsend(POM.getinstanceLP().getUsename(), "Rajarajanv");
		inputsend(POM.getinstanceLP().getPassword(), "2I6Y7I");
	}


	@When("Enter login button")
	public void enter_login_button() throws InterruptedException {
		click(POM.getinstanceLP().getLogin());
		
	}

	@Then("Navigate to next page")
	public void navigate_to_next_page() {
		String Actual = driver.getTitle();
		System.out.println(Actual);
		String Expected ="Adactin.com - Search Hotel";
		Assert.assertEquals(Expected, Actual);
		
	    
	}
	@When("User Select loaction And Hotel")
	public void user_select_loaction_and_hotel() {
		Select(POM.getinstanceSearch().getLocation(), "Text", "Paris");
		Select(POM.getinstanceSearch().getHotels(), "Text", "Hotel Sunshine");
	    Wait(30);
	}

	@When("User Select room type and room number")
	public void user_select_room_type_and_room_number() {
		Select(POM.getinstanceSearch().getRoom(), "Text", "Double");
		Select(POM.getinstanceSearch().getRoom_nos(), "Text", "2 - Two");
	   
	}

	@When("User Enter Checkin And Checkout Date")
	public void user_enter_checkin_and_checkout_date() {
		inputsend(POM.getinstanceSearch().getDatepick_in(), "24/04/2023");
		inputsend(POM.getinstanceSearch().getDatepick_out(), "20/06/2023");
	    
	}

	@When("User Select Adul And Child per Room")
	public void user_select_adul_and_child_per_room() {
		Select(POM.getinstanceSearch().getAdult_room(), "value", "2");
		Select(POM.getinstanceSearch().getChild_room(), "value", "1");
	    
	}

	@Then("User Enter search")
	public void user_enter_search() {
		click(POM.getinstanceSearch().getSubmit());
		Wait(30);
		String title = driver.getCurrentUrl();
		System.out.println(title);
		screenshot("C:\\Users\\Raja\\eclipse-workspace\\cucumbers\\target\\raja.png");
	    
	}
	


}
