package aut.testcreation.testcases;

import aut.engine.selenium.DriverFactory;
import aut.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TestGoogle extends SeleniumTestBase {

    WebDriver driver;

    @SneakyThrows
    @Test
    @Description("Test para practicar selenium en google")
    public void testGoogle()
    {
        driver = DriverFactory.getDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        //Respuestas
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        String pageSource = driver.getPageSource();
        String handle = driver.getWindowHandle();

        //find by xpath
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input)")).sendKeys("Hi");
        driver.findElement(By.tagName("input")).sendKeys("poleras");
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000);

        //navegar
        driver.navigate().refresh();//refrecar pagina
        Thread.sleep(3000);
        driver.close();//cierra pestañas del navegador
        driver.quit();//cierra pestaña de forma segura

        Assertions.assertTrue(true);
    }
}
