import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class phonehouse {

public static void paginaphonehouse()  {

        String exePath = "C:\\Users\\HP\\Desktop\\geckodriver.exe";
    System.setProperty("webdriver.gecko.driver", exePath);

        WebDriver pagina2 = new FirefoxDriver();
    pagina2.get("https://www.phonehouse.es");

    WebElement cajaBusqueda2 = pagina2.findElement(new By.ById("searcher"));
    cajaBusqueda2.sendKeys(Busqueda.usuario());
    cajaBusqueda2.sendKeys(Keys.ENTER);

    WebElement ventanasCookies2 = pagina2.findElement(By.xpath("/html/body/div[10]/div[3]/div/div/div[2]/div/div"));
    if (ventanasCookies2 != null) {
        System.out.println("Detectado caja de cookies");
        ventanasCookies2.click();
    }
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    for (int i=1; i<8;i++){

        String precio2= pagina2.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/section[2]/div[2]/ul/div/div/li[" + i + "]" + "/div/div[2]")).getText();
        String descripcion2 = pagina2.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/section[2]/div[2]/ul/div/div/li[" + i + "]" +"/div/div[1]/div[2]/div[1]/a/h3/span")).getText();
        System.out.println(" \033[35m -----> "+i+" "+ descripcion2 + " " + precio2 );
    }
}
}
