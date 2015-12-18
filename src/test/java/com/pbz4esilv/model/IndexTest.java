package com.pbz4esilv.model;

import  junit.framework.Assert;
import org.junit.Test;

import java.util.Date;

public class IndexTest {

    @Test
    public void testAddEquity() throws Exception {
        Date d1= new Date() ;
        Equity equity = new Equity("AXA","axa",100,20,d1,10000,1 );
        Index indexTest;
        indexTest = new Index("test",new Date());
        indexTest.addEquity(equity);


        Assert.assertEquals(1,indexTest.getList().size());//verifier si la liste n'est pas vide
    }
    @Test
    public void testGetSize() throws  Exception
    {
        Index indexTest;
        indexTest=new Index("test",new Date());
        Assert.assertEquals(1,indexTest.getSize());
    }
    @Test
    public void testFindEquityByName() throws Exception
    {
        Equity eqt;
        String nameEquityToFindTest = "AXA";
        eqt = new Equity(nameEquityToFindTest,"test",0.0,0.0,null,0.0,0.0);
        Index indexTest;
        indexTest=new Index("test",new Date());
        indexTest.addEquity(eqt);
        Assert.assertTrue(indexTest.findEquityByName(nameEquityToFindTest).equals(nameEquityToFindTest));//on verifie si le nom de l'equity est bien celui ajouté
    }
    @Test
    public void testFindEquityByTicker() throws Exception
    {
        Equity eqt;
        String tickerEquityToFind = "axa";
        eqt = new Equity("test",tickerEquityToFind,0.0,0.0,null,0.0,0.0);
        Index indexTest;
        indexTest=new Index("test",new Date());
        indexTest.addEquity(eqt);
        Assert.assertTrue(indexTest.findEquityByTicker(tickerEquityToFind).getTicker().equals(tickerEquityToFind));//on verifie si le ticker de l'equity est bien celui ajouté
    }

}