package jbehave.stepDefinitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import steps.DressesSteps;

public class DressesDefinition {
    @Steps
    DressesSteps dressesSteps;

    @When("I navigated to chosen dress")
    public void clickOnChosenDress(){
        dressesSteps.clickOnDressToGetRoBag();
    }

    @When("I clicked on heart of chosen dress to add to favourite")
    public void clickOnButtonToAddToFavourite(){
        dressesSteps.clickToAddToFavourite();
    }

    @Then("heart icon is filled")
    public void checkIfDressAddedToFavourite(){
        Assert.assertTrue(dressesSteps.checkAdditionDressToFavourite());
    }

    @When("I clicked on Style filter")
    public void clickOnButtonStyleFilter(){
        dressesSteps.clickOnStyleFilter();
    }

    @When("I chose A Line dress")
    public void choseALineType(){
        dressesSteps.choseALineTypeForStyleFilter();
    }

    @When("I clicked on Dress Type filter")
    public void clickOnButtonDressTypeFilter(){
        dressesSteps.clickOnDressTypeFilter();
    }

    @When("I chose Going Out dress")
    public void choseGoingOutType(){
        dressesSteps.choseGoingOutTypeForDressTypeFilter();
    }

    @When("I clicked on Neckline filter")
    public void clickOnButtonNecklineFilter(){
        dressesSteps.clickOnNecklineFilter();
    }

    @When("I chose High Neck dress")
    public void choseHighNeckType(){
        dressesSteps.choseHighNeckTypeForNecklineFilter();
    }

    @Then("dress with such filters exist")
    public void checkIfDressWithFiltersIsDisplayed(){
        Assert.assertTrue(dressesSteps.checkIfDressByFiltersDisplayed());
    }

}

