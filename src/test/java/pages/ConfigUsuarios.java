package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class ConfigUsuarios {

    public TextBox changeEmail = new TextBox(By.xpath("//input[@id='EmailInput']"));

    public Button acceptChange = new Button(By.xpath("//span[text()='Ok']"));

}
