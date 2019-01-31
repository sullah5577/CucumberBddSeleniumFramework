package framework;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class NewAcctPage extends BasePage {

    private By userName = By.xpath("//input[@name='uid']");
    private By password = By.xpath("//input[@name='password']");
    private By loginBtn = By.xpath("//input[@name='btnLogin']");
    private By custIsRegistered = By.xpath("//p[text()='Edit Customer']");
    private By custEdit = By.xpath("//a[text()='Edit Customer']");
    private By custIdExt = By.xpath("//input[@name='cusid']");
    private By custIdExtSubmit = By.xpath("//input[@name='AccSubmit']");
    private By netAcct = By.xpath("//a[text()='New Account']");
    private By custId = By.xpath("//input[@name='cusid']");
    private By acctType = By.xpath("//select[@name='selaccount']");
    private By initialDeposit = By.xpath("//input[@name='inideposit']");
    private By acctSubmit = By.xpath("//input[@name='button2']");
    private By acctSuccess = By.xpath("//p[text()='Account Generated Successfully!!!']");

    public void enterUserPwd(DataTable dataTable){
        List<List<String>> data  = dataTable.raw();
        setValueToInputField(data.get(0).get(0),userName);
        setValueToInputField(data.get(0).get(2),password);

    }

    public void clickOnLoginBtn(){
        clickOn(loginBtn);
    }

    public void custRegistered(){
        clickOn(custEdit);
        setValueToInputField("32638",custIdExt);
        clickOn(custIdExtSubmit);
        String actual = getTextFromElement(custIsRegistered);
        String expected = "Edit Customer";
        Assert.assertEquals(expected,actual);
    }

    public void clickNewAcct(){
        clickOn(netAcct);
    }

    public void enterAcctInfo(DataTable dataTable){

        List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
        setValueToInputField(data.get(0).get("customer-id"),custId);
        selectFromDropDown("Savings",acctType);
        setValueToInputField(data.get(0).get("initial-deposit"),initialDeposit);

    }

    public void submitAcctInfo(){
        clickOn(acctSubmit);
    }

    public void verifyAcctCreation(){
        String actual = getTextFromElement(acctSuccess);
        Assert.assertEquals("Account Generated Successfully!!!",actual);
        takeScreenshot();
    }

}
