/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iol.services;

import interfaces.IAuthenticationService;
import interfaces.IAuthenticationService;
import interfaces.IToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author daniel
 */
@Component
public class IolAuthenticationService implements IAuthenticationService{
   
   public void getToken(){
       System.out.println("Athu");
   } 

    @Override
    public boolean isAuthenticated() {
        IolProperties props = new IolProperties();
        System.out.println(props.toString());        
        return true;
    }
}
