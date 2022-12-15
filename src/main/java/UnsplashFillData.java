import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnsplashFillData extends UnsplashPage {

    // Constructor
    public UnsplashFillData(WebDriver driver) {
        super(driver);
    }

    // Fill Sign Up Data
    public void signUpFormData(String firstName, String lastName,
                               String email, String userName, String password) {
        Util.waiter(1);
        btnSignUpClick();
        Util.waiter(1);
        inputFirstName(firstName);
        inputLastName(lastName);
        inputEmail(email);
        inputUserName(userName);
        inputPassword(password);
        Util.waiter(2);
        btnJoinClick();
    }

    // Fill Log In Data
    public void logInFromData(String email, String password) {
        Util.waiter(1);
        btnLogInClick();
        Util.waiter(1);
        inputEmail(email);
        inputPassword(password);
        Util.waiter(2);
        btnAcceptClick();
    }
}