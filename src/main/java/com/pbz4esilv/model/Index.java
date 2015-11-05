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
    public void add_equity(Equity un){
        this.equityList.add(un);

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
}
