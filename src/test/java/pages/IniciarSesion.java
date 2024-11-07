package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class IniciarSesion {
    public TextBox emailadd = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]"));

    public TextBox passwordpw = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]"));

    public Button loginAcc = new Button(By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]"));
}
