package com.rest.demo.data.vo.v1;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;



import java.io.Serializable;


@NoArgsConstructor @AllArgsConstructor @Getter @Setter @EqualsAndHashCode
public class PersonVO extends RepresentationModel<PersonVO> implements Serializable{


    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
}
