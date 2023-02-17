package com.Adactin.Stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Adactin.Runner.Runner_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefinition {
	public static WebDriver driver = Runner_class.driver;
	
	@Given("user Launching The Url Adactin Application")
	public void user_launching_the_url_adactin_application() {
		driver.get("https://adactinhotelapp.com/");
	   
	}
	@When("user Enter The User Name In User Field")
	public void user_enter_the_user_name_in_user_field() {
		driver.findElement(By.id("username")).sendKeys("vinoth4620");
	}
	@When("User  Enter The Password in password field")
	public void user_enter_the_password_in_password_field() {
		driver.findElement(By.id("password")).sendKeys("9P84GR");
	}
	@Then("User Click On Submit Button It Navigates To Search Hotel Page")
	public void user_click_on_submit_button_it_navigates_to_search_hotel_page() {
		 driver.findElement(By.id("login")).click();
	}
	@Given("user Must Select Options")
	public void user_must_select_options() {
	   
	}
	@When("user Select The Location  Field")
	public void user_select_the_location_field() {
		WebElement value = driver.findElement(By.id("location"));
		Select a = new Select(value);
		a.selectByIndex(5);
	  	}
	@When("user Select The Hotels Field")
	public void user_select_the_hotels_field() {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select b = new Select(hotels);
		b.selectByIndex(3);
	}
	
	@When("user Select The Room Type Field")
	public void user_select_the_room_type_field() {
		WebElement room_type = driver.findElement(By.name("room_type"));
		Select c=new Select(room_type);
		c.selectByIndex(2);
	    
	}
	@When("user Select The Number Of Rooms Field")
	public void user_select_the_number_of_rooms_field() {
		WebElement room_nos = driver.findElement(By.name("room_nos"));
		Select d=new Select(room_nos);
		d.selectByIndex(2);
	  
	}
	@When("user Enter The Check In Date field And Clear Datepick_In Field")
	public void user_enter_the_check_in_date_field_and_clear_datepick_in_field() {
		driver.findElement(By.xpath("//input[@id='datepick_in']")).clear();
	}
	@When("user Enter The Datepick_In And Pass The Send Keys In Check In Date Filed")
	public void user_enter_the_datepick_in_and_pass_the_send_keys_in_check_in_date_filed() {
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("09/01/2023");
	}
	@When("user Enter The Check Out Date field And Clear Datepick_Out Field")
	public void user_enter_the_check_out_date_field_and_clear_datepick_out_field() {
		driver.findElement(By.xpath("//input[@id='datepick_out']")).clear();
	}
	@When("user Enter The Datepick_Out And Pass The Send Keys In Check Out Date Filed")
	public void user_enter_the_datepick_out_and_pass_the_send_keys_in_check_out_date_filed() {
		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("12/01/2023");
	}
	@When("user Select The Adults per Room Field")
	public void user_select_the_adults_per_room_field() {
		WebElement adultroom=driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select c1=new Select(adultroom);
		c1.selectByIndex(2);
	}
	@When("user Select The Children per Room Field")
	public void user_select_the_children_per_room_field() {
		WebElement childroom = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select g1=new Select(childroom);
		g1.selectByIndex(3);
	   }
	@Then("User Click On Search Button It Navigates To Select Hotel Page")
	public void user_click_on_search_button_it_navigates_to_select_hotel_page() {
		driver.findElement(By.xpath("//input[@class='reg_button']")).click();
	}
	@Given("user Must Select The Page Options")
	public void user_must_select_the_page_options() {
	   
	}
	@When("user Click On Radio  Button")
	public void user_click_on_radio_button() {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	   
	}
	@Then("user Click On Continue Button It Navigates To Book  Hotel Page")
	public void user_click_on_continue_button_it_navigates_to_book_hotel_page() {
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	@Given("Enter The Options")
	public void enter_the_options() {
	   
	}
	@When("user Enter The  First Name field")
	public void user_enter_the_first_name_field() {
		driver.findElement(By.name("first_name")).sendKeys("vinoth");
	   
	}
	@When("user Enter The Last Name Field")
	public void user_enter_the_last_name_field() {
		driver.findElement(By.name("last_name")).sendKeys("BJ");
	 
	}
	@When("user Enter The Billing Address Field")
	public void user_enter_the_billing_address_field() {
		driver.findElement(By.className("txtarea")).sendKeys("vinoth,Tiruvannamalai.Tamilnadu");
	}
	@When("user Enter The Credit Card No Filed")
	public void user_enter_the_credit_card_no_filed() {
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234567890123456");
	}
	@When("user Select The Credit Card Type Field")
	public void user_select_the_credit_card_type_field() {
		WebElement ctype=driver.findElement(By.xpath("//select[@class='select_combobox']"));
		Select v1=new Select(ctype);
		v1.selectByIndex(3);
	    
	}
	@When("user Select Expiry Date Select  Field Of Month")
	public void user_select_expiry_date_select_field_of_month() {
		WebElement  edate1=driver.findElement(By.xpath("//select[@class='select_combobox2']"));
		Select v2=new Select(edate1);
		v2.selectByIndex(3);
	
	}
	@When("user Select Expiry Date Select  Field Of  Year")
	public void user_select_expiry_date_select_field_of_year() {
		WebElement edate2=driver.findElement(By.xpath("//select[@class='select_combobox2'][2]"));
		Select v3=new Select(edate2)	;
		v3.selectByIndex(2);
	    
	}
	@When("user Enter The  CVV Number Field")
	public void user_enter_the_cvv_number_field() {
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("465");
	}
	@Then("user Click The Book Now Button")
	public void user_click_the_book_now_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='reg_button']")).click();
		Thread.sleep(4000);
	}
	@Then("user click On Logout Button And Exit the Application")
	public void user_click_on_logout_button_and_exit_the_application() throws InterruptedException, AWTException {
		
		WebElement sea = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]"));
		Actions ac=new Actions(driver);
		ac.contextClick(sea).build().perform();
		
		Robot ro=new Robot();
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_DOWN);
		ro.keyRelease(KeyEvent.VK_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		ac.click().build().perform();
		
	   
	}
	@Then("To Tack Screen Shot")
	public void to_tack_screen_shot() {
		
	}




}
