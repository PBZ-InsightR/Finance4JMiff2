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
        Equity alstom = new Equity("alstom","alstom",0.0,0.0,null,0.0,0.0);
        Equity arcelormittal = new Equity("arcelormittal","arcelormittal",0.0,0.0,null,0.0,0.0);
        Equity axa = new Equity("axa","axa",0.0,0.0,null,0.0,0.0);
        Equity bnpParibas = new Equity("bnpParibas","bnpParibas",0.0,0.0,null,0.0,0.0);
        Equity bouygues = new Equity("bouygues","bouygues",0.0,0.0,null,0.0,0.0);
        Equity capgemini = new Equity("capgemini","capgemini",0.0,0.0,null,0.0,0.0);
        Equity carrefour = new Equity("carrefour","carrefour",0.0,0.0,null,0.0,0.0);
        Equity creditAgricole = new Equity("creditAgricole","creditAgricole",0.0,0.0,null,0.0,0.0);
        Equity danone = new Equity("danone","danone",0.0,0.0,null,0.0,0.0);
        Equity edf = new Equity("edf","edf",0.0,0.0,null,0.0,0.0);
        Equity engie = new Equity("engie","engie",0.0,0.0,null,0.0,0.0);
        Equity essilor = new Equity("essilor","essilor",0.0,0.0,null,0.0,0.0);






        Index indexEquity = new Index(indexName,new Date());
        indexEquity.addEquity(accord);
        indexEquity.addEquity(airLiquid);
        indexEquity.addEquity(airbusGroup);
        indexEquity.addEquity(alcatel);
        indexEquity.addEquity(alstom);
        indexEquity.addEquity(arcelormittal);
        indexEquity.addEquity(axa);
        indexEquity.addEquity(bnpParibas);
        indexEquity.addEquity(bouygues);
        indexEquity.addEquity(capgemini);
        indexEquity.addEquity(carrefour);
        indexEquity.addEquity(creditAgricole);
        indexEquity.addEquity(danone);
        indexEquity.addEquity(edf);
        indexEquity.addEquity(engie);
        indexEquity.addEquity(essilor);
        System.out.println(indexEquity.toString());
    }


}
