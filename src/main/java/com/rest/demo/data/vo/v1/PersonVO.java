package com.rest.demo.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import java.io.Serializable;

@JsonPropertyOrder({"id", "address", "first_name", "last_name", "gender"})
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @EqualsAndHashCode
public class PersonVO implements Serializable {
    private Long id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String address;
    @JsonIgnore
    private String gender;
}
