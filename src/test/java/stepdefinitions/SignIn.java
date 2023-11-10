package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SignInPage;

public class SignIn {

	WebDriver driver;
	public SignInPage obj;

	@Given("user navigates to portal")
	public void user_navigates_to_portal() {
		driver = new ChromeDriver();
		obj = new SignInPage(driver);
		driver.get("https://dsportalapp.herokuapp.com/");
	}

	@When("user click on getstarted")
	public void user_click_on_getstarted() {
		// driver.findElement(By.xpath(""))
		obj.getstarted();
	}

	/*
	 * @Then("title of the sign in page is NumpyNinja") public void
	 * title_of_the_sign_in_page_is_numpy_ninja() { obj.signInTitleTest(); }
	 */

	@Then("title of the sign in page is {string}")
	public void title_of_the_sign_in_page_is(String title) {
		String actual = obj.signInTitleText();
		Assert.assertEquals(actual, title);
	}

	@When("user click on the signIn button")
	public void user_click_on_the_sign_in_button() {
		obj.signinbtn();
	}

	@Then("user enter the invalid username {string} and {string}")
	public void user_enter_the_invalid_username_and(String Username, String Password) {
		obj.enterUsername(Username);
		obj.enterPassword(Password);

	}

	@Then("User shoud get error message {string} or {string} if the fields are {string} {string}")
	public void user_shoud_get_error_message_or_if_the_fields_are(String expectedMesg1, String expectedMsg2,
			String Username, String Password) {

		if (Username.isEmpty()) {
			String actualMsg = obj.userName.getAttribute("validationMessage");
			// System.out.println(actualMsg);
			Assert.assertEquals(actualMsg, expectedMesg1);
		} else if (Password.isEmpty()) {
			String actualMsg = obj.password.getAttribute("validationMessage");

			Assert.assertEquals(actualMsg, expectedMesg1);
		} else if (!Username.isEmpty() && !Password.isEmpty()) {
			String actualMsg = obj.errorMessage.getText();
			System.out.println(actualMsg);
			Assert.assertEquals(actualMsg, expectedMsg2);
		}
	}

	/*
	 * @Then("user enter the invalid username {string}") public void
	 * user_enter_the_invalid_username(String Username) {
	 * obj.enterUsername(Username); }
	 * 
	 * @Then("user enter the valid password {string}") public void
	 * user_enter_the_valid_password(String Password) { obj.enterPassword(Password);
	 * }
	 */

	@Then("user enter the username {string}")
	public void user_enter_the_username_warriors(String Username) {
		obj.enterUsername(Username);

	}

	@And("user enter the password {string}")
	public void user_enter_the_password(String Password) {
		obj.enterPassword(Password);

	}

//	@Then("user enter the username warriors")
//	public void user_enter_the_username_warriors() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("user enter the password @{int}")
//	public void user_enter_the_password(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
	@Then("click on login button")
	public void click_on_login_button() {
		obj.login();

	}

}
