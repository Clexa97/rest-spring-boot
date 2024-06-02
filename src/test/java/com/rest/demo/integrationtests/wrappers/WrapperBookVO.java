package com.rest.demo.integrationtests.wrappers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class WrapperBookVO implements Serializable{

    @JsonProperty("_embedded")
    private BookEmbeddedVO embedded;
}
