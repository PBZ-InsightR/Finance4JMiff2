package com.pbz4esilv.model;

import  junit.framework.Assert;
import org.junit.Test;
import java.util.Date;


public class EquityTest {

    @Test
    public void testGetName() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals("AXA", eq1.getName());
    }

    public void testGetTicker() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals("axa", eq1.getTicker());
    }

    public void testGetPrice() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals(100, eq1.getPrice());
    }

    public void TestGetVolatility() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals(20, eq1.getVolatility());
    }

    public void TestGetWeight() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals(1, eq1.getVolatility());
    }

    public void TestGetDividend() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals(10000, eq1.getVolatility());
    }

    public void TestGetDateValuation() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals(d1, eq1.getVolatility());
    }
}