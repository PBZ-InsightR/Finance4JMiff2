package com.pbz4esilv.gui;

import com.pbz4esilv.model.Equity;
import com.pbz4esilv.model.Index;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainController {
    public void afficher(String indexName)
    {
        Equity accord= new Equity("accord","accord",0.0,0.0,null,0.0,0.0);
        Equity airLiquid= new Equity("airLiquid","airLiquid",0.0,0.0,null,0.0,0.0);
        Equity airbusGroup= new Equity("airbusGroup","airbusGroup",0.0,0.0,null,0.0,0.0);
        Equity alcatel = new Equity("alcatel","alcatel",0.0,0.0,null,0.0,0.0);


        Index indexEquity = new Index(indexName,new Date());
        indexEquity.addEquity(accord);
        indexEquity.addEquity(airLiquid);
        indexEquity.addEquity(airbusGroup);

        System.out.println(indexEquity.toString());
    }


}
