package com.pbz4esilv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Index {
    private String name;
    private Date date;
    private List<Equity> equityList;
    private double value;


    public Index(String name, Date date){
        this.name = name;
        this.date = date;
        equityList = new ArrayList<>();

    }

    public void addEquity(Equity equity){
        equityList.add(equity);
    }


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

    public List<Equity> getList()
    {

        return this.equityList;  //retourne la liste
    }
    public int getSize()
    {
        return this.equityList.size();
    }

    public void afficherList()
    {
        for(int i=0;i<equityList.size();i++)
        {
            System.out.println(equityList.get(i));
        }
    }
    public Equity findEquityByName(String nameEquityToFind)
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

    public Equity findEquityByTicker(String tickerToFind)
    {
        for(int i=0;i<equityList.size();i++)
        {
            if(equityList.get(i).getTicker()== tickerToFind)
            {
                return equityList.get(i);
            }

        }
        return null;
    }


}
