package framework;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import stepdefinitions.SharedSD;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;



public class BasePage {

    public void clickOn(By locator){
        SharedSD.getDriver().findElement(locator).click();

    }


    public void clearValueToInputField( By locator){
        try {
            SharedSD.getDriver().findElement(locator).clear();
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Screenshot taken");
            Assert.fail("Element is not found with this locator" + locator.toString());
        }
    }

    public void setValueToInputField(String value, By locator){
        try {
            SharedSD.getDriver().findElement(locator).sendKeys(value);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            System.out.println("Screenshot taken");
            Assert.fail("Element is not found with this locator" + locator.toString());
        }
    }

    public String getTextFromElement(By locator){
        return  SharedSD.getDriver().findElement(locator).getText();
    }

    public String getTitleOfPage(String expectedTitle){
        String actualTitle = SharedSD.getDriver().getTitle();

       Assert.assertEquals(actualTitle,expectedTitle);
        return SharedSD.getDriver().getTitle();
    }

    public String getCurrentURL(String expectedURL){
        String actualURL = SharedSD.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);
        return SharedSD.getDriver().getCurrentUrl();
    }

    public void acceptAlert(){
        SharedSD.getDriver().switchTo().alert().accept();
    }

    public void dismissAlert(){
        SharedSD.getDriver().switchTo().alert().dismiss();
    }

    public String getTextFromAlert(){
        String textAlert = SharedSD.getDriver().switchTo().alert().getText();
        return textAlert;
    }





    public void selectFromDropDown(String value, By locator){

        Select dropdown = new Select(SharedSD.getDriver().findElement(locator));

        dropdown.selectByVisibleText(value);

    }

    public void switchToChildWindow(){

        try {
            Set<String> handle = SharedSD.getDriver().getWindowHandles();
            Iterator<String> it = handle.iterator();
            String parent = it.next();
            String child = it.next();
            SharedSD.getDriver().switchTo().window(child);

        }catch (NoSuchElementException e){
            e.printStackTrace();
        }

    }

    public void switchToParentWindow(){
        try {
            Set<String> handle = SharedSD.getDriver().getWindowHandles();
            Iterator<String> it = handle.iterator();
            String parent = it.next();
            String child = it.next();
            SharedSD.getDriver().switchTo().window(parent);
            System.out.println(SharedSD.getDriver().getTitle());
        }catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }

    public void closeWindow(){
        SharedSD.getDriver().close();

    }

    public void waitUntilVisibilityOfElement( By locator){
        WebDriverWait wait=null;
        new WebDriverWait(SharedSD.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public  void takeScreenshot(){


        try {
            TakesScreenshot ts = (TakesScreenshot)SharedSD.getDriver();
            File src = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("./screenshots/gur99.png"));
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
