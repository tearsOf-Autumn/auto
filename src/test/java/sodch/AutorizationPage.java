package sodch;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutorizationPage extends BaseSeleniumPage {
    private final By autoUserName = By.xpath("//input[@id = 'login__username']"); // Private нужен для того, чтобы у нас небыло дуступа к локаторам в других классах, а файнал, для того, чтобы мы не могли изменить локаторы
    private final By autoUserPass = By.xpath("//input[@id = 'login__password']");
    private final By autoLoginBtn = By.xpath("//input[@value = 'Вход']");

    private WebElement userNameElement = driver.findElement(autoUserName);
    private WebElement userPassElement = driver.findElement(autoUserPass);
    private WebElement LoginBthElement = driver.findElement(autoLoginBtn);

    public AutorizationPage() {
        driver.get("http://turbo2.apps.sodch.phoenixit.ru/service");
        PageFactory.initElements(driver, this);
    }

    public AutorizationPage loginSodch(String login, String password) {
        userNameElement.sendKeys(login);
        userPassElement.sendKeys(password);
        LoginBthElement.click();
        return this;
    }

}
