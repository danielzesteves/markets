/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iol.services;

import com.app.IolProperties;
import interfaces.IAuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author daniel
 */
@Component
@EnableConfigurationProperties(IolProperties.class)
public class IolAuthenticationService implements IAuthenticationService {

    @Autowired
    private IolProperties props;

    public void getToken() {
        System.out.println("Athu");
    }

    @Override
    public boolean isAuthenticated() {
        System.out.println(props.getUser());
        System.out.println(props.toString());
        return true;
    }
}
