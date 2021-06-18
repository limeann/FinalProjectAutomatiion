package steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DressesPage;

import utils.Driver;

public class DressesSteps {
    private WebDriver driver = Driver.getDriver();

    private DressesPage dressesPage = PageFactory.initElements(driver, DressesPage.class);

    private void scrollTo(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    private void checkIfFiltersUpload(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dressesPage.getXpathForUploadFilters()));
    }

    public void clickOnDressToGetRoBag(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dressesPage.getDressToGetToBag()));
        scrollTo(dressesPage.getDressToGetToBag());
        dressesPage.getDressToGetToBag().click();
    }

    public void clickToAddToFavourite(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dressesPage.getDressToFavouriteButton()));
        scrollTo(dressesPage.getDressToFavouriteButton());
        dressesPage.getDressToFavouriteButton().click();
    }

    public boolean checkAdditionDressToFavourite(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dressesPage.getDressSaveForLaterIcon()));
        return dressesPage.getDressSaveForLaterIcon().isDisplayed();
    }

    public void clickOnStyleFilter(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dressesPage.getFilterStyleButton()));
        dressesPage.getFilterStyleButton().click();
    }

    public void choseALineTypeForStyleFilter(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dressesPage.getStyleFilterALine()));
        dressesPage.getStyleFilterALine().click();
        this.checkIfFiltersUpload();
    }

    public void clickOnDressTypeFilter(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dressesPage.getFilterDressTypeButton()));
        dressesPage.getFilterDressTypeButton().click();
    }

    public void choseGoingOutTypeForDressTypeFilter(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dressesPage.getDressTypeFilterGoingOut()));
        dressesPage.getDressTypeFilterGoingOut().click();
        checkIfFiltersUpload();
    }

    public void clickOnNecklineFilter(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dressesPage.getFilterNecklineButton()));
        dressesPage.getFilterNecklineButton().click();
    }

    public void choseHighNeckTypeForNecklineFilter(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dressesPage.getNecklineFilterHighNeck()));
        dressesPage.getNecklineFilterHighNeck().click();
        checkIfFiltersUpload();
    }

    public boolean checkIfDressByFiltersDisplayed(){
        scrollTo(dressesPage.getDressSearchingByFilters());
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dressesPage.getDressSearchingByFilters()));
        return dressesPage.getDressSearchingByFilters().isDisplayed();
    }
}
