package com.petstore.steps;

import com.petstore.models.Category;
import com.petstore.models.PetModel;
import com.petstore.services.PetService;
import net.thucydides.core.annotations.Step;
import org.hamcrest.MatcherAssert;

public class AddPetStep {

    private PetService petService = new PetService();
    private String namePetResponse;

    @Step
    public void newPet(String namePet) {
        namePetResponse = petService.addPet(buildPet(namePet));
    }

    private PetModel buildPet(String namePet) {
        return PetModel.builder()
                .id(10)
                .name(namePet)
                .category(buildCategory())
                .status("available")
                .build();
    }

    private Category buildCategory() {
        return Category.builder()
                .id(1)
                .name("Dogs")
                .build();
    }

    @Step
    public void verificatePet(String namePet) {
        MatcherAssert.assertThat("The name no is similar", namePet.toLowerCase().contains(namePetResponse.toLowerCase()));
    }
}
