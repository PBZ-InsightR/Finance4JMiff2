package com.pbz4esilv.model;

import java.util.Date;
import java.util.List;

public class Index {
    private String name;
    private Date date;
    private double value;
    private List<Equity> equityList;

    public Index(String name, Date date,double value, List<Equity> equityList){
        this.name = name;
        this.date = date;
        this.value=value;
        this.equityList = equityList;
    }
    public double getValue()
    {
        return value;
    }

}
