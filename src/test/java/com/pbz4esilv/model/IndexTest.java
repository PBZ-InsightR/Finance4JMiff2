package com.pbz4esilv.model;

import  junit.framework.Assert;
import org.junit.Test;

import java.util.Date;

public class IndexTest {

    @Test
    public void testAddEquity(Equity equity) throws Exception {
        Index indexTest;
        indexTest = new Index("test",new Date());
        indexTest.addEquity(equity);


        Assert.assertEquals(1,indexTest.getList().size());//verifier si la liste n'est pas vide
    }
    public void testGetSize() throws  Exception
    {
        Index indexTest;
        indexTest=new Index("test",new Date());
        Assert.assertEquals(1,indexTest.getSize());
    }
    public void testFindEquityByName(String nameEquityToFindTest) throws Exception
    {
        Equity eqt;
        eqt = new Equity(nameEquityToFindTest,"test",0.0,0.0,null,0.0,0.0);
        Index indexTest;
        indexTest=new Index("test",new Date());
        indexTest.addEquity(eqt);
        Assert.assertTrue(indexTest.findEquityByName(nameEquityToFindTest).equals(nameEquityToFindTest));//on verifie si le nom de l'equity est bien celui ajout�
    }
    public void testFindEquityByTicker(String tickerEquityToFind) throws Exception
    {
        Equity eqt;
        eqt = new Equity("test",tickerEquityToFind,0.0,0.0,null,0.0,0.0);
        Index indexTest;
        indexTest=new Index("test",new Date());
        indexTest.addEquity(eqt);
        Assert.assertTrue(indexTest.findEquityByTicker(tickerEquityToFind).getTicker().equals(tickerEquityToFind));//on verifie si le ticker de l'equity est bien celui ajout�
    }

}