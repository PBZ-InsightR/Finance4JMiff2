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
        Equity kering = new Equity("kering","kering",0.0,0.0,null,0.0,0.0);
        Equity laFargeHolcim = new Equity("laFargeHolcim","laFargeHolcim",0.0,0.0,null,0.0,0.0);
        Equity legrand = new Equity("legrand","legrand",0.0,0.0,null,0.0,0.0);
        Equity lOreal = new Equity("lOreal","lOreal",0.0,0.0,null,0.0,0.0);
        Equity lvmh = new Equity("lvmh","lvmh",0.0,0.0,null,0.0,0.0);
        Equity michelin = new Equity("michelin","michelin",0.0,0.0,null,0.0,0.0);
        Equity orange = new Equity("orange","orange",0.0,0.0,null,0.0,0.0);
        Equity pernodRicard = new Equity("pernodRicard","pernodRicard",0.0,0.0,null,0.0,0.0);
        Equity peugeot = new Equity("peugeot","peugeot",0.0,0.0,null,0.0,0.0);
        Equity publicis = new Equity("publicis","publicis",0.0,0.0,null,0.0,0.0);
        Equity renault = new Equity("renault","renault",0.0,0.0,null,0.0,0.0);
        Equity safran = new Equity("safran","safran",0.0,0.0,null,0.0,0.0);
        Equity saintGobin = new Equity("saintGobin","saintGobin",0.0,0.0,null,0.0,0.0);
        Equity sanofi = new Equity("sanofi","sanofi",0.0,0.0,null,0.0,0.0);
        Equity schneiderElectric = new Equity("schneiderElectric","schneiderElectric",0.0,0.0,null,0.0,0.0);
        Equity societeGenerale = new Equity("societeGenerale","societeGenerale",0.0,0.0,null,0.0,0.0);
        Equity solvay = new Equity("solvay","solvay",0.0,0.0,null,0.0,0.0);
        Equity technip = new Equity("technip","technip",0.0,0.0,null,0.0,0.0);
        Equity total = new Equity("total","total",0.0,0.0,null,0.0,0.0);
        Equity unibailRodamco = new Equity("unibailRodamco","unibailRodamco",0.0,0.0,null,0.0,0.0);
        Equity valeo = new Equity("valeo","valeo",0.0,0.0,null,0.0,0.0);
        Equity veoliaEnvironnement = new Equity("veoliaEnvironnement","veoliaEnvironnement",0.0,0.0,null,0.0,0.0);
        Equity vinci = new Equity("vinci","vinci",0.0,0.0,null,0.0,0.0);
        Equity vivendi = new Equity("vivendi","vivendi",0.0,0.0,null,0.0,0.0);

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
        indexEquity.addEquity(kering);
        System.out.println(indexEquity.toString());
    }


}
