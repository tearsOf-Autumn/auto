package sodch;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutorizationPage extends BaseSeleniumPage {

    @FindBy (xpath = "//input[@id = 'login__username']")
    private WebElement username;

    @FindBy (xpath = "//input[@id = 'login__password']")
    private WebElement userPass;

    @FindBy (xpath = "//input[@value = 'Вход']")
    private WebElement loginBtn;

    public AutorizationPage() {
        driver.get("http://turbo2.apps.sodch.phoenixit.ru/service");
        PageFactory.initElements(driver, this);
    }

    public AutorizationPage loginSodch(String login, String password) {
        username.sendKeys(login);
        userPass.sendKeys(password);
        loginBtn.click();
        return this;
    }

}
