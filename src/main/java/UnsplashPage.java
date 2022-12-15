import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UnsplashPage {
    // Web Driver variable
    protected WebDriver driver;

    // DATA
    // Site URL
    public final String URL = "https://unsplash.com/";

    // Sign Up Form Data
    public String firstName = "TestFirstName12345";
    public String lastName = "TestLastName12345";
    public String email = "testEmail12345@gmail.com";
    public String userName = "TestUser021847128";
    public String password = "1234567890";

    // Wrong Log In data
    public String wrongEmail = Util.generateRandomEmail(8);
    public String wrongPassword = Util.generateRandomPassword(6);


    // Buttons Xpath
    public String xpathBtnSignUp = "//*[@id=\"app\"]/div/header/nav/div[5]/a[2]";
    public String xpathBtnJoin = "//*[@id=\"new_user\"]/div[5]/a";
    public String xpathBtnLogIn = "//*[@id=\"app\"]/div/header/nav/div[5]/a[1]";
    public String xpathBtnAccept = "/html/body/div[2]/div/div/div/div/form/div[3]/input";

    // Inputs Xpath (inputEmail and inputPassword have equal xpath for sign up and login forms)
    public String xpathInputFirstName = "//*[@id=\"user_first_name\"]";
    public String xpathInputLastName = "//*[@id=\"user_last_name\"]";
    public String xpathInputEmail = "//*[@id=\"user_email\"]";
    public String xpathInputUserName = "//*[@id=\"user_username\"]";
    public String xpathInputPassword = "//*[@id=\"user_password\"]";

    // Log In Error Message Xpath
    public By xpathErrorMessage = By.xpath("/html/body/div[1]/div/div/div[2]");

    // Methods

    // Constructor
    public UnsplashPage(WebDriver driver){
        this.driver = driver;
    }

    // Input First Name Method
    public void inputFirstName(String firstName){
        By byInputFirstName = By.xpath(xpathInputFirstName);
        WebElement elementInputFirstName = driver.findElement(byInputFirstName);
        elementInputFirstName.sendKeys(firstName);
    }

    // Input Last Name Method
    public void inputLastName(String lastName){
        By byInputLastName = By.xpath(xpathInputLastName);
        WebElement elementInputLastName = driver.findElement(byInputLastName);
        elementInputLastName.sendKeys(lastName);
    }

    // Input Email Method
    public void inputEmail(String email){
        By byInputEmail = By.xpath(xpathInputEmail);
        WebElement elementInputEmail = driver.findElement(byInputEmail);
        elementInputEmail.sendKeys(email);
    }

    // Input User Name Method
    public void inputUserName(String userName){
        By byInputUserName = By.xpath(xpathInputUserName);
        WebElement elementInputUserName = driver.findElement(byInputUserName);
        elementInputUserName.sendKeys(userName);
    }

    // Input Password Method
    public void inputPassword(String password){
        By byInputPassword = By.xpath(xpathInputPassword);
        WebElement elementInputPassword = driver.findElement(byInputPassword);
        elementInputPassword.sendKeys(password);
    }

    // Button Click Methods

    // Sign Up Button Click Method
    public void btnSignUpClick(){
        By byBtnSignUp = By.xpath(xpathBtnSignUp);
        WebElement elementBtnSignUp = driver.findElement(byBtnSignUp);
        elementBtnSignUp.click();
    }

    // Join Button Click Method
    public void btnJoinClick(){
        By byBtnJoin = By.xpath(xpathBtnJoin);
        WebElement elementBtnJoin = driver.findElement(byBtnJoin);
        elementBtnJoin.click();
    }

    // Log In Button Click Method
    public void btnLogInClick(){
        By byBtnLogIn = By.xpath(xpathBtnLogIn);
        WebElement elementBtnLogIn = driver.findElement(byBtnLogIn);
        elementBtnLogIn.click();
    }

    // Accept Button Click Method
    public void btnAcceptClick(){
        By byBtnAccept = By.xpath(xpathBtnAccept);
        WebElement elementBtnAccept = driver.findElement(byBtnAccept);
        elementBtnAccept.click();
    }
}
