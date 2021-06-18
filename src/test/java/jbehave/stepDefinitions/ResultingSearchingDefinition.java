package jbehave.stepDefinitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import steps.ResultingSearchSteps;

public class ResultingSearchingDefinition {
    @Steps
    ResultingSearchSteps resultingSearchingSteps;

    @Then("banner should contains 'Your search results for:'$searchingWord''")
    public void checkBannerOnResultingPage(String searchingWord){
        Assert.assertEquals(resultingSearchingSteps.checkIfResultingPageContainsSearchWord(searchingWord),searchingWord);
    }
}
