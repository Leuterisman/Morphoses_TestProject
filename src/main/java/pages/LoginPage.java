package pages;

import org.openqa.selenium.By;
import utilities.BaseActions;

/**
 * LoginPage class represents the page object for the login functionality.
 * It extends {@link BaseActions} to inherit common web automation actions.
 *
 * <p>
 * This class provides methods to interact with the login page elements
 * </p>
 */
public class LoginPage extends BaseActions {

    //Login locators

    private By emailInput = By.cssSelector("input#email");
    private By passwordInput = By.cssSelector("input[type='password']");
    private By signInButton = By.cssSelector("button[type='submit']");

    /**
     * Enters the provided email address into the email input field on the login page.
     */

    public LoginPage enterEmailField(String email){
        waitForElementVisible(emailInput);
        sendKeys(emailInput, email);
        return this;
    }

    /**
     * Enters the provided password into the password input field on the login page.
     */

    public LoginPage enterPasswordField(String password){
        waitForElementVisible(passwordInput);
        sendKeys(passwordInput, password);
        return this;
    }

    /**
     * Clicks the sign-in button on the login page.
     */

    public LoginPage clickSignIn(){
        click(signInButton);
        return this;
    }

    /**
     * Performs login with the provided email and password credentials.
     */

    public LoginPage Login(String email, String password){
        enterEmailField(email);
        enterPasswordField(password);
        clickSignIn();
        return this;
    }
}
