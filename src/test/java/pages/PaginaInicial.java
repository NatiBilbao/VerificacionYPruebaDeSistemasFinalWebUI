package pages;

import controls.Button;
import org.openqa.selenium.By;

public class PaginaInicial {
    public Button sigUpFree = new Button(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[3]/a/img"));

    public Button login = new Button(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img"));
}
