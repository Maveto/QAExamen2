package tests;

import io.cucumber.java.bs.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.CenterSection;
import pomPages.LoginModal;
import pomPages.MainPage;
import pomPages.MenuSection;
import singletonSession.Session;

public class Ej6UI {

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    CenterSection centerSection = new CenterSection();
    MenuSection menuSection = new MenuSection();
    String user = "mautest@mautest.com";
    String pwd = "1234";

    @Test
    public void verify_change_name() throws InterruptedException {
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user, pwd);

        Thread.sleep(2000);

        menuSection.logoutButton.click();

        Assert.assertTrue("No se mudo desloggear", mainPage.loginImage.controlIsDisplayed());
    }

    @After
    public void close() throws InterruptedException {

        Thread.sleep(1000);
        Session.getSession().closeSession();
    }
}
