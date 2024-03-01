package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    protected WebDriver driver;
    private By loginEmail= By.xpath("//input[@id='username']");
    private By loginPassword= By.xpath("//input[@id='password']");
    private By loginButton=By.xpath("//button[contains(text(), 'Login']");
    private By skipLink=By.xpath("//button[contains(text(), 'Skip(only for testing']");


    public By getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(By loginEmail) {
        this.loginEmail = loginEmail;
    }

    public By getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(By loginPassword) {
        this.loginPassword = loginPassword;
    }

    public By getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(By loginButton) {
        this.loginButton = loginButton;
    }

    public By getskipLink() {
        return skipLink;
    }

    public void setskipLink(By loginButton) {
        this.skipLink = skipLink;
    }

}
