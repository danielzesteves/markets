/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniel
 */
@Component
@Service
public class IolService {

    @Autowired
    private IolAuthenticationService iolAuthenticacion;
    
    public void getToken(){
        System.out.println("iolAuthenticacion");
        System.out.println(iolAuthenticacion);
        iolAuthenticacion.getToken();
    }
}
