package tutorialsninja.com.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import tutorialsninja.com.customlisteners.CustomListeners;
import tutorialsninja.com.utility.Utility;

public class ComponentsPage extends Utility {




    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement componentsText;

    public String getComponentsText() {
        Reporter.log("Get component Text  " + componentsText.toString());
        CustomListeners.test.log(Status.PASS,"Get component Text " + componentsText);
        return getTextFromElement(componentsText);
    }
}


