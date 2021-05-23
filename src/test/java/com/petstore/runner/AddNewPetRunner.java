package com.petstore.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/add_new_pet.feature",
        glue = "com.petstore.definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class AddNewPetRunner {
}
