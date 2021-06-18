package jbehave.stepDefinitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import steps.JoinSteps;


public class JoinDefinition {

    @Steps
    JoinSteps joinSteps;

    @When("I set '$email' to EMAIL ADDRESS field")
    public void setEmail(String email){
        joinSteps.setLoginEmail(email);
    }

    @When("I set '$name' to FIRST NAME field")
    public void setFirstName(String name){
        joinSteps.setFirstName(name);
    }

    @When("I set '$lastName' to LAST NAME field")
    public void setLastName(String lastName){
        joinSteps.setLastName(lastName);
    }

    @When("I set '$birthDate' to DAY field")
    public void setBirthDay(String birthDay){
        joinSteps.setBirthDay(birthDay);
    }

    @When("I set '$birthMonth' to MONTH field")
    public void setBirthMonth(String month){
        joinSteps.setBirthMonth(month);
    }

    @When("I set '$birthYear' to YEAR field")
    public void setBirthYear(String year){
        joinSteps.setBirthYear(year);
    }

    @When("I set '$password' to PASSWORD field")
    public void setLogInPassword(String password){
        joinSteps.setLoginPassword(password);
    }

    @When("I click on JOIN ASOS button")
    public void clickOnJoinButton(){
        joinSteps.clickJoinAsos();
    }

    @Then("Message Account cannot be created right now displayed")
    public void checkDisplayErrorJoinForbiddenMessage(){

        Assert.assertTrue("Registration message box is not displayed",joinSteps.checkRegistrationMessageBox());
    }
}
