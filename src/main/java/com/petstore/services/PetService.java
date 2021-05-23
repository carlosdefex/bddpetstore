package com.petstore.services;

import com.petstore.models.PetModel;
import net.serenitybdd.rest.SerenityRest;

public class PetService {

    private static final String ENVIRONMENT = "http://localhost:8080";
    private static final String SERVERS = "/api/v3";
    private static final String ENDPOINT = "/pet";

    public String addPet(PetModel petModel) {
        return SerenityRest.given()
                .contentType("application/json")
                .baseUri(ENVIRONMENT)
                .basePath(SERVERS)
                .body(petModel)
                .when().log().all()
                .post(ENDPOINT)
                .then().log().all()
                .statusCode(200)
                .extract().response().jsonPath().getString("name");
    }

}
