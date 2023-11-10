package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "/html/body/div[1]/div/div/a")
	WebElement GetStarted;

	@FindBy(xpath = "//a[text()=\"NumpyNinja\"]")
	WebElement title;

	@FindBy(xpath = "//a[text()=\"Sign in\"]")
	WebElement signInBtn;

	@FindBy(id = "id_username")
	public WebElement userName;

	@FindBy(id = "id_password")
	public WebElement password;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	WebElement loginBtn;

	@FindBy(xpath = "/html/body/div[3]")
	public WebElement errorMessage;

	public void getstarted() {
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/a")).click(); 
		GetStarted.click();
	}

	public String signInTitleText() {
		String str = title.getText();
		return str;
		// String str = title.getText();
		// Assert.assertEquals(str, "NumpyNinja");

	}

	public void signinbtn() {
		signInBtn.click();
	}

	public void enterUsername(String Username) {
		userName.sendKeys(Username);
	}

	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}

	public void login() {
		loginBtn.click();
	}

	public String getErrorMsg() {
		String ErrorMsg = errorMessage.getText();
		return ErrorMsg;

	}
}
