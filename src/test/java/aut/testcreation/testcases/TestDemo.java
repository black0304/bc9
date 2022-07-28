package aut.testcreation.testcases;

import aut.engine.selenium.DriverFactory;
import aut.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import static aut.engine.utils.Constants.BASE_URL_AUT;

public class TestDemo extends SeleniumTestBase {

    WebDriver driver;

    @Test
    @Description("Test creado para bootcamp 9 tsoft")
    public void testDemo() throws InterruptedException
    {
        //inicializacion
        driver = DriverFactory.getDriver(); //crea el browser de prueba
        driver.get(BASE_URL_AUT);

        WebElement btnSuerte = driver.findElement(By.name("btnI"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("console.log('Hola BC9')");
        js.executeScript("arguments[0].click();",btnSuerte);

        /*

        //Acciones Browser

        //Obtener tamaño
        //--int alto = driver.manage().window().getSize().getHeight();
        //--int ancho = driver.manage().window().getSize().getWidth();

        Dimension altoancho = driver.manage().window().getSize();//objeto
        driver.manage().window().getSize(new Dimension(800,600));//asignar tamaño

        int alto = altoancho.getHeight();
        int ancho = altoancho.getWidth();

        //Posicionamiento en el Browser
        int posicionX = driver.manage().window().getPosition().getX();
        int posicionY = driver.manage().window().getPosition().getY();

        Point posicionDelDriver = driver.manage().window().getPosition();
        posicionX = posicionDelDriver.getX();
        posicionY = posicionDelDriver.getY();

        driver.manage().window().setPosition(new Point(0,0));


        //Ventanas y TAB - Como Movernos
        driver.get(BASE_URL_AUT);
        String ventanaUno = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        String ventanaDos = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        String pestana = driver.getWindowHandle();
        driver.get(BASE_URL_AUT);

        driver.switchTo().window(ventanaUno);
        driver.get(BASE_URL_AUT);

        driver.switchTo().window(ventanaDos);
        driver.get(BASE_URL_AUT);

        //open web page - Navegacion Basica
        driver.get(BASE_URL_AUT); //google.com
        String nombreUrlActual = driver.getCurrentUrl(); //tomar url actual
        String tituloWeb = driver.getTitle();//tomar titulo de la pagina
        System.out.println("Me encuentro en : "+nombreUrlActual+" y su titulo es : "+tituloWeb);
        Thread.sleep(3000);
        driver.navigate().to("https://selenium.dev");
        Thread.sleep(3000);
        nombreUrlActual = driver.getCurrentUrl(); //tomar url actual
        tituloWeb = driver.getTitle();//tomar titulo de la pagina
        System.out.println("Me encuentro en : "+nombreUrlActual+" y su titulo es : "+tituloWeb);

        //Browser :: Back - Forward - Refresh

        driver.navigate().back();
        nombreUrlActual = driver.getCurrentUrl(); //tomar url actual
        tituloWeb = driver.getTitle();//tomar titulo de la pagina
        System.out.println("Me encuentro en : "+nombreUrlActual+" y su titulo es : "+tituloWeb);
        driver.navigate().forward();
        nombreUrlActual = driver.getCurrentUrl(); //tomar url actual
        tituloWeb = driver.getTitle();//tomar titulo de la pagina
        System.out.println("Me encuentro en : "+nombreUrlActual+" y su titulo es : "+tituloWeb);
        driver.navigate().refresh();*/


        Assertions.assertTrue(true);


    }
}