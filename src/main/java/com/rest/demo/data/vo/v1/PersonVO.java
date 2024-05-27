package com.rest.demo.data.vo.v1;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @EqualsAndHashCode
public class PersonVO implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;
}
