/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.util.HashSet;
import lombok.Data;

/**
 *
 * @author daniel
 */
@Data
public class Value extends Item{
    private  HashSet<Quotation> quotes;
    private  Country country;
}
