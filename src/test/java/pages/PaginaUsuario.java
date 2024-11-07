package pages;

import controls.Button;
import org.openqa.selenium.By;

public class PaginaUsuario {

    public Button settings = new Button(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_PanelHeaderButtons\"]/a[1]"));
    public Button logoutButton = new Button(By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]"));

}
