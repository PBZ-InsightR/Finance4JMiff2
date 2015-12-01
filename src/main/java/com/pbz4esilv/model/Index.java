package com.pbz4esilv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Index {

    //Attributs
    private String name;
    private Date date;
    private List<Equity> equityList;
    private double value;

    //Constructeur
    public Index(String name, Date date){
        this.name = name;
        this.date = date;
        equityList = new ArrayList<>();
    }

    //Constructeur
    public Index(String name, Date date,int choice){
        this.name = name;
        this.date = date;
        equityList = new ArrayList<>();
        if(choice == 1)
        {
            CAC40list();
        }
    }

    //Ajoute une equity à l'attribut liste
    public void addEquity(Equity equity){
        equityList.add(equity);
    }

    //Ajoute crée et ajoute les 40 titres du Cac40 dans l'index;
    public void CAC40list()
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

        addEquity(solvay);
        addEquity(laFargeHolcim);
        addEquity(accord);
        addEquity(airLiquid);
        addEquity(airbusGroup);
        addEquity(alcatel);
        addEquity(alstom);
        addEquity(arcelormittal);
        addEquity(axa);
        addEquity(bnpParibas);
        addEquity(bouygues);
        addEquity(capgemini);
        addEquity(carrefour);
        addEquity(creditAgricole);
        addEquity(danone);
        addEquity(edf);
        addEquity(engie);
        addEquity(essilor);
        addEquity(kering);
        addEquity(legrand);
        addEquity(lOreal);
        addEquity(lvmh);
        addEquity(michelin);
        addEquity(orange);
        addEquity(pernodRicard);
        addEquity(peugeot);
        addEquity(publicis);
        addEquity(renault);
        addEquity(safran);
        addEquity(saintGobin);
        addEquity(sanofi);
        addEquity(schneiderElectric);
        addEquity(societeGenerale);
        addEquity(technip);
        addEquity(total);
        addEquity(unibailRodamco);
        addEquity(veoliaEnvironnement);
        addEquity(vinci);
        addEquity(vivendi);
        addEquity(valeo);
    }

    //Supprime une equity de l'attribut liste
    public void deleteEquity(Equity equity)
    {
        for(int i=0;i<equityList.size();i++)
        {
            if(equityList.get(i).getName()== equity.getName())
            {
                equityList.remove(i);
            }

        }
    }

    //Retourne les information de toute les equity de l'index dans un string
    @Override
    public String toString(){
        String value = name;
        value = value.concat(" = ");
        for (Equity equity : equityList) {
            value = value.concat(equity.getName());
            value = value.concat(" / ");
        }
        return value;
    }

    //retourne la liste
    public List<Equity> getList()
    {

        return this.equityList;
    }

    //Retourne le nombre d'élément de la liste
    public int getSize()
    {
        return this.equityList.size();
    }

    public void afficherList()
    {
        for(Equity elem : equityList )
        {
            System.out.println(elem);//a modifer avec l'API, on est pas dans la console
        }
    }

    public Equity findEquityByName(String nameEquityToFind)//de meme que pour findEquityByTicker mais pour le nom, la surcharge ne marche pas chez moi
    {
        for(Equity elem : equityList )
        {
           if(elem.getName()== nameEquityToFind)
           {
               return elem;
           }
        }
        return null;
    }

    public Equity findEquityByTicker(String tickerEquityToFind)//recuperer l'equity de la liste par le ticker
    {
        for(Equity elem : equityList )//parcours de la liste
        {
            if(elem.getTicker()== tickerEquityToFind)//si la correspondance est faite, unique ?
            {
                return elem;//on la retourne
            }

        }
        return null;
    }

    public double findEquityPrice(String nameEquityorTicker)//recuperer le prix de  l'equity de la liste
    {
        for(Equity elem : equityList )//parcours de la liste
        {
            if(elem.getName()== nameEquityorTicker||elem.getTicker()== nameEquityorTicker)//si la correspondance est faite
            {
                return elem.getPrice();//on retourne son prix
            }

        }
        return 0;
    }



}
