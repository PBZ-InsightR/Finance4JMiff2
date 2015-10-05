package com.pbz4esilv.model;

import java.util.Date;

public class Equity {

    private String name;
    private String ticker;
    private double price;
    private double volatility;
    private Date dateValuation ;
    private double dividend;

    public Equity(String name,String ticker, double price,double volatility, Date dateValuation, double dividend ) {
        this.name = name ;
        this.ticker = ticker;
        this.price = price ;
        this.volatility = volatility ;
        this.dateValuation = dateValuation;
        this.dividend = dividend;
    }

    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public String getTicker() {
        return this.ticker;
    }
    public double getVolatility() {
        return this.volatility;
    }
    public Date getDateValuation() {
        return this.dateValuation;
    }
    public double getDividend() {
        return this.dividend;
    }
}
