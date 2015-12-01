package com.pbz4esilv.model;

import  junit.framework.Assert;
import org.junit.Test;
import java.util.Date;


public class EquityTest {

    @Test
    public void GetName() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals("AXA", eq1.getName());
    }           //test retour nom

    @Test
    public void GetTicker() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals("axa", eq1.getTicker());
    }         //test retour symbole

    @Test
    public void GetPrice() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals(100.0, eq1.getPrice());
    }          //test retour prix

    @Test
    public void TestGetVolatility() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals(20.0, eq1.getVolatility());
    }     //test retour volatilité

    @Test
    public void TestGetWeight() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals(1.0, eq1.getWeight());
    }         //test retour volume

    @Test
    public void GetDividend() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals(10000.0, eq1.getDividend());
    }       //test retour dividende

    @Test
    public void GetDateValuation() throws Exception {
        Equity eq1;
        Date d1= new Date() ;
        eq1 = new Equity("AXA","axa",100,20,d1,10000,1 );
        Assert.assertEquals(d1, eq1.getDateValuation());
    }   //test retour date
}