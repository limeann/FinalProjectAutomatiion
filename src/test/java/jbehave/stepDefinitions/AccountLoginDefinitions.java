package jbehave.stepDefinitions;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import steps.AccountLoginSteps;

public class AccountLoginDefinitions {
    @Steps
    AccountLoginSteps accountLoginSteps;

    @When("I set '$login' into EMAIL ADDRESS field")
    public void setLogin(String login){
        accountLoginSteps.setLogin(login);
    }

    @When("I set '$password' into PASSWORD field")
    public void setPassword(String password){
        accountLoginSteps.setPassword(password);
    }

    @When("I click on SIGN IN button")
    public void clickOnSignInButton(){
        accountLoginSteps.loginInAccount();
    }

    @Then("a massage 'Looks like either your email address or password were incorrect. Wanna try again?' should pop up")
    public void massage(){

        Assert.assertTrue(accountLoginSteps.messageWrongSignIn());}
}

