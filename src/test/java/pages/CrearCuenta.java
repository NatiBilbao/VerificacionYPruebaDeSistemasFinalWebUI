package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class CrearCuenta {
    public TextBox fullName = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]"));
    public TextBox email = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]"));
    public TextBox password = new TextBox(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]"));

    public Button termsOfSevices = new Button(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_CheckBoxTerms\"]"));
    public Button signUp = new Button(By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]"));
}
