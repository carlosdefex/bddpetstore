
package com.petstore.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tag {

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("name")
    public String name;

}
