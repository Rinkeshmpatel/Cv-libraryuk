package com.cvlibraryuk.steps;

import com.cvlibraryuk.pages.HomePage;
import com.cvlibraryuk.pages.Resultpage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Jobsearchsteps {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String title) {
        new HomePage().Enterjobtitle(title);}



    @And("^I enter Location \"([^\"]*)\"$")
    public void iEnterLocation(String location){
        new HomePage().enterlocation(location);
    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance){
    new HomePage().Selectdistance(distance);
    }

    @And("^I click on moreSearchOptionsLink$")
    public void iClickOnMoreSearchOptionsLink() {
    new HomePage().clickonmoresearchoptionlink();
    }

    @And("^I enter salaryMin \"([^\"]*)\"$")
    public void iEnterSalaryMin(String min){
        new HomePage().entarsalaryMin(min);
    }

    @And("^I enter salaryMax \"([^\"]*)\"$")
    public void iEnterSalaryMax(String max){
        new HomePage().entersalarymax(max);
    }

    @And("^I select salaryType \"([^\"]*)\"$")
    public void iSelectSalaryType(String Stype){
        new HomePage().selectsalarytype(Stype);
    }

    @And("^I select jobType \"([^\"]*)\"$")
    public void iSelectJobType(String Jtype) {
        new HomePage().selectjobtype(Jtype);
    }

    @And("^I click on Find Jobs button$")
    public void iClickOnFindJobsButton() {
     new HomePage().clickfindjobsbutton();
    }

    @Then("^I verify the result \"([^\"]*)\"$")
    public void iVerifyTheResult(String result) {
        Assert.assertEquals(result, new Resultpage().verifyTextSuccessfully(result));
    }

}
