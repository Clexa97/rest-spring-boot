package com.rest.demo.data.vo.v1.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class TokenVO implements Serializable {
    private String username;
    private Boolean authenticated;
    private Date created;
    private Date expiration;
    private String accessToken;
    private String refreshToken;
}
