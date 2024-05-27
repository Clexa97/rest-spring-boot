package com.rest.demo.data.vo.v2;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @EqualsAndHashCode
public class PersonVOV2 implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String gender;

    private Date birthDay;
}
