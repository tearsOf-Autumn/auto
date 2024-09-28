package core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

abstract public class BaseSeleniumTest {
    protected WebDriver driver;

    @Before
    public void setUP(){
        driver = new ChromeDriver(); // Инициализация хром драйвера
        driver.manage().window().maximize(); // Параметр для запуска хрома в полном окне
        driver.manage().timeouts().pageLoadTimeout( 10, TimeUnit.SECONDS); // Таймаут для ожидания загрузки страницы
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); // Таймаут для ожидания времени отображения элементов страницы
        BaseSeleniumPage.setDriver(driver);
    }
    @After
    public void tearDown() {
        driver.close(); // Закрывает хромдрайвер (отвечает за взаимодействие с браузером)
        driver.quit(); // Закрывает браузер
    }
}
