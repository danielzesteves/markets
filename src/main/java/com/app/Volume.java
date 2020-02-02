/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.math.BigDecimal;
import lombok.Data;

/**
 *
 * @author daniel
 */
@Data
public class Volume {
    private BigDecimal nominal;
    private BigDecimal cash;
    private BigDecimal average;
    private BigDecimal percentaje;
    
}
