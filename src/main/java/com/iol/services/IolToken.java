/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iol.services;

import com.fasterxml.jackson.annotation.JsonProperty;
import interfaces.IToken;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 *
 * @author daniel
 */
@Data
@Component
public class IolToken implements IToken{

    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("expires_in")
    private Integer expiresIn;
    @JsonProperty("refresh_token")
    private String refreshToken;
    @JsonProperty(".issued")
    private String issued;
    @JsonProperty(".expires")
    private String expires;
    @JsonProperty(".refreshexpires")
    private String refreshexpires;

    @Override
    public boolean isValid() {
        return false;
    }
    
    
}
