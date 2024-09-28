package sodch;

import core.BaseSeleniumTest;
import org.junit.Test;
import readProperties.ConfigProvider;

public class SodchTest extends BaseSeleniumTest {

    @Test
    public void check() {
        AutorizationPage authPage = new AutorizationPage();
        authPage.loginSodch(ConfigProvider.login, ConfigProvider.password);

    }
}
