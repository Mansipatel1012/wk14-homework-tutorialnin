package tutorialsninja.com.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import tutorialsninja.com.customlisteners.CustomListeners;
import tutorialsninja.com.utility.Utility;

public class ShoppingCartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;
    //By shoppingCartText = By.xpath("//div[@id='content']//h1");
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;
    //By productName = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDate;
    //By deliveryDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement model;
    //By model = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement total;
    //By total = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement qtyField;
    //By qtyField = By.xpath("//input[contains(@name, 'quantity')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement qtyUpdateBtn;
    //By qtyUpdateBtn = By.xpath("//button[contains(@data-original-title, 'Update')]");
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successModifiedMessage;
    //By successModifiedMessage = By.xpath("//div[@id='checkout-cart']/div[1]");

    public String getShoppingCartText()

    {   Reporter.log("Get Shopping Cart Text");
        CustomListeners.test.log(Status.PASS, "Get Shopping Cart Text");
        return getTextFromElement(shoppingCartText);
    }

    public String getProductName()
    {   Reporter.log("Get Product Name");
        CustomListeners.test.log(Status.PASS, "Get Product Name");
        return getTextFromElement(productName);
    }

    public String getDeliveryDate()
    {   Reporter.log("Get Delivery Date");
        CustomListeners.test.log(Status.PASS, "Get Delivery Date");
        return getTextFromElement(deliveryDate);
    }

    public String getModel()
    {   Reporter.log("Get Model");
        CustomListeners.test.log(Status.PASS, "Get Model");
        return getTextFromElement(model);
    }

    public String getTotal()
    {   Reporter.log("Get Total");
        CustomListeners.test.log(Status.PASS, "Get Total");
        return getTextFromElement(total);
    }

    public void changeQuantity(String qty)
    {   Reporter.log("Change Quantity");
        CustomListeners.test.log(Status.PASS, "Change Quantity");
        sendTextToElement(qtyField, qty);
    }

    public void clickOnQtyUpdateButton()
    {   Reporter.log("Click On Quantity Update Button");
        CustomListeners.test.log(Status.PASS, "Click On Quantity Update Button");
        clickOnElement(qtyUpdateBtn);
    }

    public String getSuccessModifiedMessage()
    {   Reporter.log("Get Success Modified Message");
        CustomListeners.test.log(Status.PASS, "Get Success Modified Message");
        return getTextFromElement(successModifiedMessage);
    }

}

