/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iol.services;

import interfaces.IAuthenticationService;
import interfaces.IToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniel
 */
@Service
public class IolAuthenticationService implements IAuthenticationService{
    @Autowired
    private IolToken token;

    public IolAuthenticationService(IolToken token) {
        this.token = token;
    }
    
    
    public void getToken(){
        System.out.println(token);
    }
    
}
