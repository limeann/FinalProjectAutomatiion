package jbehave.stepDefinitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import steps.DressToBagSteps;

public class DressToBagDefinition {
    @Steps
    DressToBagSteps dressToBagSteps;

    @When("I select 32 size of dress")
    public void select32SixeOfDress(){
        dressToBagSteps.selectDressSize();
    }

    @When("I tried to add dress to bag")
    public void clickOnAddToBagButton(){
        dressToBagSteps.addToBagDress();
    }

    @When("I tried to remove dress from bag")
    public void deleteDressFromBag(){
        dressToBagSteps.removeFromBagDress();
    }


    @Then("Bag icon became filled with '1'")
    public void checkIfBagIconIsFilled(){
        Assert.assertTrue(dressToBagSteps.checkAdditionDressToBag());
    }

    @Then("Bag icon became unfilled")
    public void checkIfBagIconIsUnfilled(){
        Assert.assertTrue(dressToBagSteps.checkRemovingDressToBag());
    }

    @Then("message 'Please select from the available colour and size options' displayed")
    public void checkIfErrorMessageAddToBagDisplayed(){
        Assert.assertTrue(dressToBagSteps.checkMassageSelectSizeError());
    }
}
