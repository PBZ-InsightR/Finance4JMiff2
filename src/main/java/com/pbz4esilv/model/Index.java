package com.pbz4esilv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Index {

    //Attribut
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

    //Ajoute une equity à l'attribut liste
    public void addEquity(Equity equity){
        equityList.add(equity);
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
        for(int i=0;i<equityList.size();i++)
        {
            System.out.println(equityList.get(i));//a modifer avec l'API, on est pas dans la console
        }
    }


    public Equity findEquityByName(String nameEquityToFind)//de meme que pour findEquityByTicker mais pour le nom, la surcharge ne marche pas chez moi
    {
        for(int i=0;i<equityList.size();i++)
        {
           if(equityList.get(i).getName()== nameEquityToFind)
           {
               return equityList.get(i);
           }

        }
        return null;
    }

    public Equity findEquityByTicker(String tickerEquityToFind)//recuperer l'equity de la liste par le ticker
    {
        for(int i=0;i<equityList.size();i++)//parcours de la liste
        {
            if(equityList.get(i).getTicker()== tickerEquityToFind)//si la correspondance est faite, unique ?
            {
                return equityList.get(i);//on la retourne
            }

        }
        return null;
    }
    public double findEquityPrice(String nameEquity)//recuperer le prix de  l'equity de la liste
    {
        for(int i=0;i<equityList.size();i++)//parcours de la liste
        {
            if(equityList.get(i).getName()== nameEquity)//si la correspondance est faite, unique ?
            {
                return equityList.get(i).getPrice();//on retourne son prix
            }

        }
        return 0;
    }


}
