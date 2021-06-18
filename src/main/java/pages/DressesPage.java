package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class DressesPage {

    @FindBy(xpath = "//a[@data-testid='savedItemsIcon']")
    WebElement savedItems;

    @FindBy(xpath = "//article[@id='product-22716706']")
    WebElement dressToGetToBag;

    @FindBy(xpath = "//article[@id='product-22716706']/button")
    WebElement dressToFavouriteButton;

    @FindBy(xpath = "//article[@id='product-22716706']/button[@data-auto-id='saveForLater']")
    WebElement dressSaveForLaterIcon;

    @FindBy(xpath = "//article[@id='product-21210704']")
    WebElement dressSearchingByFilters;

    @FindBy(xpath = "//li[@data-auto-id='attribute_1046']//button")
    WebElement filterStyleButton;

    @FindBy(xpath = "//label[@for='attribute_1046_8314']")
    WebElement styleFilterALine;

    @FindBy(xpath = "//li[@data-auto-id='attribute_10313']//button")
    WebElement filterDressTypeButton;

    @FindBy(xpath = "//p[@data-auto-id='totalSelectedFacetValues']")
    WebElement xpathForUploadFilters;

    @FindBy(xpath = "//label[@for='attribute_10313_50364']")
    WebElement dressTypeFilterGoingOut;

    @FindBy(xpath = "//li[@data-auto-id='attribute_10150']//button")
    WebElement filterNecklineButton;

    @FindBy(xpath = "//label[@for='attribute_10150_72023']")
    WebElement necklineFilterHighNeck;

}
