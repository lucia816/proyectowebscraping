import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class mediamarket {

public  static void paginamediamarket()  {
    try {
       FileWriter fichero = new FileWriter(
                "C:\\Users\\HP\\IdeaProjects\\untitled1\\src\\holaaa.txt", true);

    PrintWriter pw = new PrintWriter(fichero);
    pw.println("Hola");
        String exePath = "C:\\Users\\HP\\Desktop\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", exePath);

    WebDriver pagina1 = new FirefoxDriver();
    pagina1.get("https://www.mediamarkt.es/");


    WebElement cajaBusqueda = pagina1.findElement(By.xpath("/html/body/header/div/div/div[2]/div/form/input[1]"));
    cajaBusqueda.sendKeys(Busqueda.usuario());
    cajaBusqueda.submit();

        WebElement ventanaCookies = pagina1.findElement(By.xpath("/html/body/div[10]/div/div[1]/div[2]/button[2]"));
        if (ventanaCookies != null) {
            System.out.println("Detectado caja de cookies");
            ventanaCookies.click();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int j=2; j<20; j++){
        String descripcion1  = pagina1.findElement(By.xpath("/html/body/div[2]/div[1]/ul[2]/li[" + j++ + "]" + "/div/div/h2/a")).getText();
        System.out.println("\u001B[31m ------->" + descripcion1);
        pw.println(descripcion1);

    }
    System.out.println("Precios de los productos");
    for (int m = 2; m<20; m++){
        String precio1 = pagina1.findElement(By.xpath("/html/body/div[2]/div[1]/ul[2]/li[" + m++ + "]" + "/div/aside[2]/div[1]/div[1]")).getText();
        System.out.println("\u001B[32m ------>"+precio1 +  "\n "  );
    }

    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
