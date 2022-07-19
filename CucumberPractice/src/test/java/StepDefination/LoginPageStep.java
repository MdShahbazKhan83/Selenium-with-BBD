package StepDefination;

import org.junit.Assert;

import com.qa.DriverFactory.Driverfactory;
import com.qa.page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {
	//In Then always use the assertion
	//In Given always use the get
	//In When is just for a action to perform something
	private static String title;
	private LoginPage  LoginPage =new LoginPage(Driverfactory.getDriver());
	
	@Given("User is on login Page")
	public void User_is_on_login_Page() {
		Driverfactory.getDriver().get("https://classic.freecrm.com/index.html?e=1");
	  
	}

	@When("user get the title of the page")
	public void user_get_the_title_of_the_page() {
	    //here previously we written String title= LoginPage.title();--but no created the object so delted the string
	     title= LoginPage.title();
	       System.out.println(title);

	  
	} 
	

	@Then("page title should be {string}")
	public void page_title_should_be(String Titlename) {
		String title= LoginPage.title();
	    Assert.assertEquals(title, Titlename);

	   
	}

	

	@Then("sign up button should be displayed")
	public void sign_up_button_should_be_displayed() {
	    Assert.assertTrue(LoginPage.singupbutton());
	  
	}


	@When("user enter username {string}")
	public void user_enter_username(String username) {
	    LoginPage.usernameenter(username);
}

	@When("user enter password {string}")
	public void user_enter_password(String password) {
	    LoginPage.passwod(password);}

	@Then("user click on the login")
	public void user_click_on_the_login() {
	    LoginPage.login();
	 
	}





}
