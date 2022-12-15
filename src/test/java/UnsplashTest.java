import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UnsplashTest {
    WebDriver driver;
    UnsplashFillData page;

    @Before
    public void beforeMethod(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        page = new UnsplashFillData(driver);
        driver.get(page.URL);
        driver.manage().window().maximize();
    }
    @After
    public void afterMethod() {
        driver.quit();
    }


    // Open Page Test
    @Test
    public void testOpenPage() {
        String xpathTitle = "//*[@id=\"app\"]/div/div[3]/div[1]/div/div[2]/div/div[1]/div/span";
        final String title = "Unsplash";
        By byId = By.xpath(xpathTitle);
        WebElement element = driver.findElement(byId);
        Util.waiter(1);
        String trueTitle = element.getText();
        Assert.assertEquals(title, trueTitle);
    }

    // Sign Up Test
//    @Test
//    public void testSignUp(){
//        page.signUpFormData(page.firstName,page.lastName,page.email,page.userName,page.password);
//        Util.waiter(3);
//    }

    // Log In Test
    @Test
    public void testLogIn(){
        page.logInFromData(page.email, page.password);
        Util.waiter(3);
    }

    @Test
    public void testLogInIncorrectEmail(){
        page.logInFromData(page.wrongEmail, page.password);
        String getError = driver.findElement(page.xpathErrorMessage).getText();
        Assert.assertEquals("Invalid email or password.", getError);
    }

    @Test
    public void testLogInIncorrectPassword(){
        page.logInFromData(page.email, page.wrongPassword);
        String getError = driver.findElement(page.xpathErrorMessage).getText();
        Assert.assertEquals("Invalid email or password.", getError);
    }

    @Test
    public void testLogInIncorrectEmailAndPassword(){
        page.logInFromData(page.wrongEmail, page.wrongPassword);
        String getError = driver.findElement(page.xpathErrorMessage).getText();
        Assert.assertEquals("Invalid email or password.", getError);
    }

    @Test
    public void testLogInEmptyEmail(){
        page.logInFromData("", page.password);
        String getError = driver.findElement(page.xpathErrorMessage).getText();
        Assert.assertEquals("You need to sign in or sign up before continuing.", getError);
    }

    @Test
    public void testLogInEmptyPassword(){
        page.logInFromData(page.email, "");
        String getError = driver.findElement(page.xpathErrorMessage).getText();
        Assert.assertEquals("Invalid email or password.", getError);
    }

    @Test
    public void testLogInEmptyEmailAndPassword(){
        page.logInFromData("", "");
        String getError = driver.findElement(page.xpathErrorMessage).getText();
        Assert.assertEquals("You need to sign in or sign up before continuing.", getError);
    }
}
