package com.pbz4esilv.model;

import java.util.Date;

public class Equity {

    private String name;
    private String ticker;
    private double price;
    private double volatility;
    private Date dateValuation ;
    private double dividend;

    public Equity(String _name,String _ticker, double _price,double _volatility, Date _dateValuation, double _Dividend ) {
        this.name = _name ;
        this.ticker = _ticker;
        this.price = _price ;
        this.volatility = _volatility ;
        this.dateValuation = _dateValuation;
        this.dividend = _Dividend;
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
