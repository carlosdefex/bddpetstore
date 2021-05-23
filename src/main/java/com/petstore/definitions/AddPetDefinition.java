package com.petstore.definitions;

import com.petstore.steps.AddPetStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddPetDefinition {

    @Steps
    AddPetStep addPetStep;

    @When("add a new pet with name {string}")
    public void addANewPet(String namePet) {
        addPetStep.newPet(namePet);
    }

    @Then("the {string} is created correctly")
    public void thePetIsCreatedCorrectly(String namePet) {
        addPetStep.verificatePet(namePet);
    }
}
