package com.pbz4esilv.model;

import  junit.framework.Assert;
import org.junit.Test;

import java.util.Date;

public class EquityTest {

    @Test
    public void testGetName() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000 );
        Assert.assertEquals("AXA", eq1.getName());
    }

}