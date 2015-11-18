package com.pbz4esilv.model;

import  junit.framework.Assert;
import org.junit.Test;

import java.util.Date;

public class IndexTest {

    @Test
    public void testAddEquity(Equity eqt) throws Exception {
        Index indexTest;
        indexTest = new Index("test",new Date());
        indexTest.addEquity(eqt);

        Assert.assertTrue(java.util.ArrayList.isNotEmpty(IndexTest));//verifier si la liste n'est pas vide
    }

}