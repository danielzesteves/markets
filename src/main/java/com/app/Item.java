/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import lombok.Data;

/**
 *
 * @author daniel
 */
@Data
public abstract class Item {
    private String name;
    private String description;
}
