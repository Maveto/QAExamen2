package pomPages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTextBox= new TextBox(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxEmail']"));
    public TextBox pwdTextBox= new TextBox(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxPassword']"));
    public Button loginButton= new Button(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$ButtonLogin']"));

    public TextBox name = new TextBox(By.xpath("//input[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]"));
    public TextBox email = new TextBox(By.xpath("//input[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]"));
    public TextBox pwd = new TextBox(By.xpath("//input[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]"));
    public Button checkBox = new Button(By.xpath("//input[@id=\"ctl00_MainContent_SignupControl1_CheckBoxTerms\"]"));
    public Button signupButton = new Button(By.xpath("//input[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]"));


    public LoginModal(){}

    public void loginAction(String user, String pwd) {
        emailTextBox.set(user);
        pwdTextBox.set(pwd);
        loginButton.click();
    }

}