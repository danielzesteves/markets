/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iol.services;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author desteves
 */

@ConfigurationProperties(prefix="iol")
@Data
public class IolProperties {
    private String user;
    private String pass;  
}
