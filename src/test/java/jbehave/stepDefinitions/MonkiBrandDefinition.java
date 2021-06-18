package jbehave.stepDefinitions;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;

import steps.MonkiBrandSteps;

public class MonkiBrandDefinition {
    @Steps
    MonkiBrandSteps monkiBrandSteps;

    @Then("go to Monkis brand page")
    public void checkBannerAtMonki(){
        Assert.assertEquals(monkiBrandSteps.checkIfBrandIsCorrect(),"Women's Monki");

    }
}
