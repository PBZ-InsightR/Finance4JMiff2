package com.pbz4esilv.model;

import  junit.framework.Assert;
import org.junit.Test;

import java.util.Date;

public class IndexTest {

    @Test
    public void testAddEquity() throws Exception {
        Index indexTest;
        indexTest = new Index("test",new Date());

        indexTest.addEquity(eqt);

        //Assert.assertTrue(java.util.ArrayList.isNotEmpty(IndexTest));//verifier si la liste n'est pas vide
    }
    @Test
    public void testGetSize()
    {
        Index indexTest;
        indexTest=new Index("test",new Date());
        Equity eqt=new Equity("test","test",0.0,0.0,null,0.0,0.0);
        indexTest.addEquity(eqt);
        Assert.assertEquals(1,indexTest.getSize());
    }
    @Test
    public void testFindEquityByName()
    {
        Equity eqt;
        eqt = new Equity("test","test",0.0,0.0,null,0.0,0.0);
        Index indexTest;
        indexTest=new Index("test",new Date());
        indexTest.addEquity(eqt);
        Assert.assertTrue(indexTest.findEquityByName(eqt.getName()).getName()==eqt.getName());//on verifie si le nom de l'equity est bien celui ajouté
    }
    @Test
    public void testFindEquityByTicker()
    {
        Equity eqt;
        eqt = new Equity("test","test",0.0,0.0,null,0.0,0.0);
        Index indexTest;
        indexTest=new Index("test",new Date());
        indexTest.addEquity(eqt);
        Assert.assertTrue(indexTest.findEquityByTicker(eqt.getTicker()).getTicker()==eqt.getTicker());//on verifie si le ticker de l'equity est bien celui ajouté
    }

}