/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.iol.services.IolService;
import interfaces.IIolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author daniel
 */
@RestController

public class IolController {
    
    @Autowired
    private IolService iolService;
    
    @RequestMapping("/token")
    public String getToken(){
        System.out.println(iolService);
        iolService.getToken();
        return "Hola";
    }
}
