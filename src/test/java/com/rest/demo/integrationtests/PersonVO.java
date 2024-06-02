package com.rest.demo.integrationtests;


import lombok.*;
import org.springframework.hateoas.RepresentationModel;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @EqualsAndHashCode
public class PersonVO extends RepresentationModel<PersonVO> implements Serializable{


    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
    private Boolean enabled;
}
