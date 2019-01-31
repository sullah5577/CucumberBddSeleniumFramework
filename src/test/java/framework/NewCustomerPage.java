package framework;

import cucumber.api.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import stepdefinitions.SharedSD;

import java.util.List;

public class NewCustomerPage extends BasePage{

    private By userName = By.xpath("//input[@name='uid']");
    private By password = By.xpath("//input[@name='password']");
    private By loginBtn = By.xpath("//input[@name='btnLogin']");
    private By newCustomerLink = By.xpath("//a[text()='New Customer']");
    private By customerName = By.xpath("//input[@name='name']");
    private By customerGender = By.xpath("//input[@value='f']");
    private By customerDob = By.xpath("//input[@id='dob']");
    private By customerAddress = By.xpath("//textarea[@name='addr']");
    private By customerCity = By.xpath("//input[@name='city']");
    private By customerState = By.xpath("//input[@name='state']");
    private By customerPin = By.xpath("//input[@name='pinno']");
    private By customerMobileNo = By.xpath("//input[@name='telephoneno']");
    private By customerEmail = By.xpath("//input[@name='emailid']");
    private By customerPassword = By.xpath("//input[@name='password']");
    private By customerSubmit = By.xpath("//input[@name='sub']");
    private By customerSuccessMsg = By.xpath("//p[text()='Customer Registered Successfully!!!']");


    public String getPageTitle(){
        String strArg1 = "Guru99 Bank Home Page";
        String actualTitle = SharedSD.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(strArg1,actualTitle);
        return actualTitle;

    }

    public void enterUserAndPass(DataTable dataTable) throws InterruptedException {


        List<List<String>> data  = dataTable.raw();
        setValueToInputField(data.get(0).get(0),userName);
        setValueToInputField(data.get(0).get(2),password);

    }

    public void clickOnLoginBtn(){
        clickOn(loginBtn);
    }

    public void clickOnAddNewCust(){
        clickOn(newCustomerLink);
    }

    public void enterCustomerInfo(DataTable dataTable){


        List<List<String>> data = dataTable.raw();
        setValueToInputField(data.get(0).get(0),customerName);
        clickOn(customerGender);
        setValueToInputField(data.get(0).get(1),customerDob);
        setValueToInputField(data.get(0).get(2),customerAddress);
        setValueToInputField(data.get(0).get(3),customerCity);
        setValueToInputField(data.get(0).get(4),customerState);
        setValueToInputField(data.get(0).get(5),customerPin);
        setValueToInputField(data.get(0).get(6),customerMobileNo);
        setValueToInputField(data.get(0).get(7),customerEmail);
        setValueToInputField(data.get(0).get(8),customerPassword);
        clickOn(customerSubmit);

    }



    public void verifySuccessCustAcct(){
        String actual = getTextFromElement(customerSuccessMsg);
        String expected = "Customer Registered Successfully!!!";
        Assert.assertEquals(actual,expected);
    }

}
