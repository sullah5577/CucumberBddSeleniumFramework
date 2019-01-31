package framework;


import cucumber.api.DataTable;
import gherkin.lexer.Da;
import org.junit.Assert;
import org.openqa.selenium.By;
import stepdefinitions.SharedSD;

import java.util.List;

public class LoginPage extends BasePage  {







    private By pageHeading = By.xpath("//h2[text()='Guru99 Bank']");
    private By userName = By.xpath("//input[@name='uid']");
    private By password = By.xpath("//input[@name='password']");
    private By loginBtn = By.xpath("//input[@name='btnLogin']");



    public void getPageHeading(){
        getTextFromElement(pageHeading);
    }

    public String getPageTitle(){
        String strArg1 = "Guru99 Bank Home Page";
        String actualTitle = SharedSD.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(strArg1,actualTitle);
        return actualTitle;

    }

    public void enterUser(String value){
        setValueToInputField(value,userName);
    }

    public void enterPassword(String value){
        setValueToInputField(value,password);
    }

    public void clickOnLoginBtn(){
        clickOn(loginBtn);
    }

    public void verifyLoginSuccess(){
        getCurrentURL("http://www.demo.guru99.com/v4/manager/Managerhomepage.php");
    }

    public void getTextFromAlertPrompt(){
        getTextFromAlert();
    }

    public void acceptAlertPrompt(){
        acceptAlert();
    }




}
