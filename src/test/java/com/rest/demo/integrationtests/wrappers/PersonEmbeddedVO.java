package com.rest.demo.integrationtests.wrappers;

import java.io.Serializable;
import java.util.List;

import com.rest.demo.integrationtests.PersonVO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor @Getter @Setter @EqualsAndHashCode
public class PersonEmbeddedVO implements Serializable{

    @JsonProperty("personVOList")
    private List<PersonVO> persons;
}
