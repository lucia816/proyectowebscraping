
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class entrega4 {
    public static void main(String[] args) {
        try {
            busqueda();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void busqueda() throws InterruptedException {

        String exePath = "C:\\Users\\HP\\Desktop\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", exePath);

        WebDriver pagina1 = new FirefoxDriver();
        WebDriver pagina2 = new FirefoxDriver();


        pagina1.get("https://www.mediamarkt.es/");
        pagina2.get("https://www.phonehouse.es");

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Que desea buscar?");
        String Busqueda = teclado.nextLine();

        try {
            WebElement ventanaCookies = pagina1.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
            if (ventanaCookies != null) {
                System.out.println("Detectado caja de cookies");
                ventanaCookies.click();
            }
            WebElement ventanasCookies2 = pagina2.findElement(By.xpath("/html/body/div[10]/div[3]/div/div/div[2]/div/div"));
            if (ventanaCookies != null) {
                System.out.println("Detectado caja de cookies");
                ventanaCookies.click();
            }
        } catch (Exception e) {
        }

        WebElement cajaBusqueda = pagina1.findElement(By.xpath("/html/body/header/div/div/div[2]/div/form/input[1]"));
        cajaBusqueda.sendKeys(Busqueda);
        cajaBusqueda.submit();


        WebElement cajaBusqueda2 = pagina2.findElement(new By.ById("searcher"));
        cajaBusqueda2.sendKeys(Busqueda );
        cajaBusqueda2.sendKeys(Keys.ENTER);

       Thread.sleep(3000);


        for (int i=1; i<6;i++){

            String precio2= pagina2.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/section[2]/div[2]/ul/div/div/li[" + i + "]" + "/div/div[2]")).getText();
            String descripcion2 = pagina2.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/section[2]/div[2]/ul/div/div/li[" + i + "]" +"/div/div[1]/div[2]/div[1]/a/h3/span")).getText();
            System.out.println(" \033[35m -----> "+i+" "+ descripcion2 + " " + precio2 );
        }
        System.out.println("----------------------------");
        for(int j=2; j<20; j++){
          String descripcion1  = pagina1.findElement(By.xpath("/html/body/div[2]/div[1]/ul[2]/li[" + j++ + "]" + "/div/aside[2]/div[1]/div[1]/div[1]")).getText();
            System.out.println(descripcion1);

        }
for (int m = 2; m<20; m++){
    String precio1 = pagina1.findElement(By.xpath("/html/body/div[2]/div[1]/ul[2]/li[" + m++ + "]" + "/div/aside[2]/div[1]/div[1]")).getText();
    System.out.println(precio1 +  "\n "  );
}
try{
    FileWriter fichero = new FileWriter(
            "C:\\Users\\HP\\IdeaProjects\\untitled1\\src\\holaaa.txt", true);
    PrintWriter pw = new PrintWriter(fichero);

} catch (IOException e) {
    e.printStackTrace();
}

    }
    }

