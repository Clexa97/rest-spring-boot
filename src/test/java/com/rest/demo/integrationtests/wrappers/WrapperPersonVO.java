package com.rest.demo.integrationtests.wrappers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor @Getter @Setter @EqualsAndHashCode
@XmlRootElement
public class WrapperPersonVO implements Serializable{

    @JsonProperty("_embedded")
    private PersonEmbeddedVO embedded;

}
