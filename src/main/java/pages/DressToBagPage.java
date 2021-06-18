package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DressToBagPage {
    @FindBy(xpath = "//select[@data-id='sizeSelect']")
    WebElement dressSizeSelection;

    @FindBy(xpath = "//select[@data-id=\"sizeSelect\"]/option[text()='EU 32']")
    WebElement dressSize;

    @FindBy(xpath = "//button[@data-testid='miniBagIcon']/span[text()='1']")
    WebElement filledBagIcon;

    @FindBy(xpath = "//button[@data-test-id='add-button']")
    WebElement addToBagButton;

    @FindBy(xpath = "//span[@id='selectSizeError']")
    WebElement massageSelectSizeError;

    @FindBy(xpath = "//button[@aria-label='Delete this item']")
    WebElement deleteItemFromBagButton;

    @FindBy(xpath = "//a[@data-testid='miniBagIcon']/span[@type='bagUnfilled']")
    WebElement unfilledBagIcon;
}
