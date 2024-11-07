package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.*;
import session.Session;

public class CrearActualizarUsuario {

    PaginaInicial paginaInicial = new PaginaInicial();
    CrearCuenta crearCuenta = new CrearCuenta();
    PaginaUsuario paginaUsuario = new PaginaUsuario();
    ConfigUsuarios configUsuarios = new ConfigUsuarios();

    IniciarSesion iniciarSesion = new IniciarSesion();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }

    @Test
    public void verificarCrearYActualizar() throws InterruptedException {
        String fullNameUser = "email1 usuario";
        String emailUser = "email1234@gmail.com";
        String passwordUser = "123456";

        paginaInicial.sigUpFree.click();
        crearCuenta.fullName.setText(fullNameUser);
        crearCuenta.email.setText(emailUser);
        crearCuenta.password.setText(passwordUser);
        crearCuenta.termsOfSevices.click();
        crearCuenta.signUp.click();
        Thread.sleep(1000);

        Assertions.assertTrue(paginaUsuario.logoutButton.isControlDislayed(),
                "Error no se pudo iniciar las sesión");

        Thread.sleep(5000);
        String nuevoEmail = "email9876@gmail.com";
        paginaUsuario.settings.click();
        configUsuarios.changeEmail.clearSetText(nuevoEmail);
        configUsuarios.acceptChange.click();
        Thread.sleep(5000);

        Session.getInstance().createWait(10).until(ExpectedConditions.alertIsPresent());
        Alert alert = Session.getInstance().getBrowser().switchTo().alert();
        alert.accept();

        paginaInicial.login.click();
        iniciarSesion.emailadd.setText(nuevoEmail);
        iniciarSesion.passwordpw.setText(passwordUser);
        iniciarSesion.loginAcc.click();
        Thread.sleep(5000);

        Assertions.assertTrue(paginaUsuario.logoutButton.isControlDislayed(),"Error no se pudo iniciar sesion con el nuevo correo");
    }
}
