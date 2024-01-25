package com.Automation_UI.pages;

import com.Automation_UI.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "/login")
    public WebElement signUpBtn;





}
