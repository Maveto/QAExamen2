package pomPages;

import controls.Image;
import org.openqa.selenium.By;

public class MainPage {

    public Image loginImage= new Image(By.xpath("//img[@src='/Images/design/pagelogin.png']"));
    public Image signupImg = new Image(By.xpath("//img[@src=\"/Images/design/pagesignup.png\"]"));

    public MainPage(){}
}