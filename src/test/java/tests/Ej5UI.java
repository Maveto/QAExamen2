package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.CenterSection;
import pomPages.LoginModal;
import pomPages.MainPage;
import pomPages.MenuSection;
import singletonSession.Session;

import java.util.Random;

public class Ej5UI {

    Random r = new Random();

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    CenterSection centerSection = new CenterSection();
    MenuSection menuSection = new MenuSection();
    String user = "mautest"+r.nextInt(1000)+"@mautest"+r.nextInt(1000)+".com";
    String pwd = "1234";

    @Test
    public void verify_signin() throws InterruptedException {
        Session.getSession().getDriver().get("http://todo.ly/");

        mainPage.signupImg.click();
        loginModal.name.set("Mau");
        loginModal.email.set(user);
        loginModal.pwd.set(pwd);

        loginModal.checkBox.click();
        Thread.sleep(3000);
        loginModal.signupButton.click();

        Assert.assertTrue("No se pudo iniciar session", menuSection.logoutButton.controlIsDisplayed());


    }

    @After
    public void close() throws InterruptedException {

        Thread.sleep(1000);
        Session.getSession().closeSession();
    }
}
