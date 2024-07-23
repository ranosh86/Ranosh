package project.pages;

import org.openqa.selenium.support.PageFactory;
import project.utility.Driver;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // whatever necessary locators and methods for the basePage in the project ....

}
