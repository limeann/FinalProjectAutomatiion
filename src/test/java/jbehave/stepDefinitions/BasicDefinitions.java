package jbehave.stepDefinitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import steps.BasicSteps;

public class BasicDefinitions {
    @Steps
    BasicSteps basicSteps;

    @Given("I navigated to url = '$url'")
    public void navigateToASOS(String url){basicSteps.openURL(url);}

    @When("I navigated to Account Item")
    public void navigateToAccountItem(){basicSteps.clickOnAccountItem();}

    @When("I navigated to 'Join'")
    public void navigateToJoin(){
            basicSteps.clickOnJoin();

    }

    @When("I navigated to My Account")
    public void navigateToSignIn(){
            basicSteps.clickOnSignIn();

    }

    @When("I navigated to DRESSES")
    public void navigatedToDresses(){
        basicSteps.clickOnDress();
    }

    @When("I clicked on searching bar")
    public void clickSearchingBar(){
        basicSteps.clickOnSearchingBar();
    }

    @When("I entered '$searchWord' and clicked ENTER")
    public void navigateToSearchWordPage(String searchingWord){
        basicSteps.enterSearchWord(searchingWord);
    }

    @Then("My Account Item became filled")
    public void checkSuccessfulSignIn(){
        Assert.assertTrue(basicSteps.checkIfFilledIconDisplayed());
    }

    @When("I clicked on Brands")
    public void clickOnBrand(){
        basicSteps.clickOnBrands();
    }

    @When("I clicked on Monkis")
    public void clickOnMonkis(){
        basicSteps.clickOnMonkisBrand();
    }

    @Then("I clicked on sign out button")
    public void clickOnButtonSignOut(){
        basicSteps.clickOnSingOutButton();
    }

}
