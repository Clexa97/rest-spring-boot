package com.rest.demo.integrationtests;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor @Getter @Setter @EqualsAndHashCode
public class AccountCredentialsVO implements Serializable {
    private String username;
    private String password;
}
