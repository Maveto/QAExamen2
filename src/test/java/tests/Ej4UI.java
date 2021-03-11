package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.CenterSection;
import pomPages.LoginModal;
import pomPages.MainPage;
import singletonSession.Session;

public class Ej4UI {

    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    CenterSection centerSection = new CenterSection();
    String user = "mautest@mautest.com";
    String pwd = "1234";

    @Test
    public void verify_change_name() {
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user, pwd);

        centerSection.settingsButt.click();
        centerSection.nametextBox.clear();
        centerSection.nametextBox.set("Update");

        centerSection.okButton.click();

        centerSection.settingsButt.click();
        Assert.assertEquals("No se modifico el nombre", "Update", centerSection.nametextBox.getAttributeValue("value"));
    }


    @After
    public void close() throws InterruptedException {

        Thread.sleep(1000);
        Session.getSession().closeSession();
    }
}
