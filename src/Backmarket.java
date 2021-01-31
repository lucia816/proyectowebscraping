import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Backmarket {

    public static void paginabackmarket(){

        String exePath = "C:\\Users\\HP\\Desktop\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", exePath);
        WebDriver pagina3 = new FirefoxDriver();

        pagina3.get ("https://www.backmarket.es/");



        WebElement cajaBusqueda3 = pagina3.findElement(By.xpath("/html/body/div[1]/div/div/div/header/div/div[1]/div[1]/form/input"));
        cajaBusqueda3.sendKeys(Busqueda.usuario());
        cajaBusqueda3.submit();

        WebElement ventanaCookies = pagina3.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div[2]/div/div[2]/div[2]/button"));
        if (ventanaCookies != null) {
            System.out.println("Detectado caja de cookies");
            ventanaCookies.click();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int n = 1; n < 8; n++){
            String precio3 = pagina3.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/section/div[2]/div[2]/a[" + n + "]" +"/div/div[2]/div[2]/div[2]/span")).getText();
            String descripcion3 = pagina3.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div/div/section/div[2]/div[2]/a[" + n + "]" + "/div/div[2]/div[2]/h2")).getText();
            System.out.println( "\u001B[36m ----->" + descripcion3 + " ---->" + precio3);
        }
    }
}
