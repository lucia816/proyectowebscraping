
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
        mediamarket.paginamediamarket();
        phonehouse.paginaphonehouse();
        Backmarket.paginabackmarket();
    }
}


       /* try {
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
        }*/


