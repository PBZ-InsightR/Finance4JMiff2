package com.pbz4esilv.model;

import  junit.framework.Assert;
import org.junit.Test;

public class EquityTest {

    @Test
    public void testGetName() throws Exception {
        Equity eq1 = new Equity("AXA",100);
        Assert.assertEquals("AXA", eq1.getName());
    }

}