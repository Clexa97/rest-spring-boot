package com.rest.demo.data.vo.v1.security;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor @Getter @Setter @EqualsAndHashCode
public class AccountCredentialsVO implements Serializable {
    private String username;
    private String password;
}
