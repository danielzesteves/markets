/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author daniel
 */
@Data
public class Quotation {
    private Date date;
    private BigDecimal open;
    private BigDecimal closing;
    private BigDecimal high;
    private BigDecimal low;
    private Volume volume;
}
