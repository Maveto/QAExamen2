package tests;

import org.junit.After;
import org.junit.Test;
import pomPages.CenterSection;
import pomPages.LoginModal;
import pomPages.MainPage;
import singletonSession.Session;

public class Ej5UI {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    CenterSection centerSection = new CenterSection();
    String user = "mautest1@mautest1.com";
    String pwd = "1234";

    @Test
    public void verify_change_name() {
        Session.getSession().getDriver().get("http://todo.ly/");

        mainPage.signupImg.click();




    }

    @After
    public void close() throws InterruptedException {

        Thread.sleep(1000);
        Session.getSession().closeSession();
    }
}
